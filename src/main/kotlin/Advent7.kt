val cards = listOf("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A")

val comparator1 = object : Comparator<Triple<Int, String, Long>> {
    override fun compare(o1: Triple<Int, String, Long>, o2: Triple<Int, String, Long>): Int {
        if (o1.first > o2.first)
            return -1
        if (o1.first < o2.first)
            return 1
        return run {
            o1.second.forEachIndexed { index, c ->
                if (cards.indexOf(c.toString()) > cards.indexOf(o2.second[index].toString())) {
                    return@run 1
                }
                if (cards.indexOf(c.toString()) < cards.indexOf(o2.second[index].toString())) {
                    return@run -1
                }
            }
            0
        }
    }
}

fun advent7p1(input: String): Long {
    val wins = mutableListOf<Triple<Int, String, Long>>()
    input.split("\n").forEach { s ->
        val (hand, bid) = s.split(' ').let {
            it.first() to it.last().toLong()
        }
        val cardsInHand = List(13) { 0 }.toMutableList()
        hand.forEach {
            cardsInHand[cards.indexOf(it.toString())] += 1
        }
        when {
            cardsInHand.any { it == 5 } -> wins.add(Triple(1, hand, bid))
            cardsInHand.any { it == 4 } -> wins.add(Triple(2, hand, bid))
            cardsInHand.any { it == 3 } && cardsInHand.any { it == 2 } -> wins.add(Triple(3, hand, bid))
            cardsInHand.any { it == 3 } -> wins.add(Triple(4, hand, bid))
            cardsInHand.filter { it == 2 }.size == 2 -> wins.add(Triple(5, hand, bid))
            cardsInHand.any { it == 2 } -> wins.add(Triple(6, hand, bid))
            else -> wins.add(Triple(7, hand, bid))
        }
    }
    return wins.sortedWith(comparator1).foldIndexed(0L) { index, acc, triple ->
        acc + (index + 1) * triple.third
    }
}

val cards2 = listOf("J", "2", "3", "4", "5", "6", "7", "8", "9", "T", "Q", "K", "A")

val comparator2 = object : Comparator<Triple<Int, String, Long>> {
    override fun compare(o1: Triple<Int, String, Long>, o2: Triple<Int, String, Long>): Int {
        if (o1.first > o2.first)
            return -1
        if (o1.first < o2.first)
            return 1
        return run {
            o1.second.forEachIndexed { index, c ->
                if (cards2.indexOf(c.toString()) > cards2.indexOf(o2.second[index].toString())) {
                    return@run 1
                }
                if (cards2.indexOf(c.toString()) < cards2.indexOf(o2.second[index].toString())) {
                    return@run -1
                }
            }
            0
        }
    }
}


fun advent7p2(input: String): Long {
    val wins = mutableListOf<Triple<Int, String, Long>>()
    input.split("\n").forEach { s ->
        val (hand, bid) = s.split(' ').let {
            it.first() to it.last().toLong()
        }
        val cardsInHand = List(13) { 0 }.toMutableList()
        hand.forEach {
            cardsInHand[cards2.indexOf(it.toString())] += 1
        }
        when {
            cardsInHand.drop(1).any { (cardsInHand[0] + it) == 5 } -> wins.add(Triple(1, hand, bid))
            cardsInHand.drop(1).any { (cardsInHand[0] + it) == 4 } -> wins.add(Triple(2, hand, bid))
            (cardsInHand.drop(1).any { it == 3 } && cardsInHand.any { it == 2 }) ||
                    (cardsInHand.drop(1).filter { it == 2 }.size == 2 && cardsInHand[0] == 1)
            -> wins.add(Triple(3, hand, bid))

            cardsInHand.drop(1).any { (cardsInHand[0] + it) == 3 } -> wins.add(Triple(4, hand, bid))
            cardsInHand.drop(1).filter { it == 2 }.size == 2 -> wins.add(Triple(5, hand, bid))
            cardsInHand.drop(1).any { it == 2 } || cardsInHand[0] == 1 -> wins.add(Triple(6, hand, bid))
            else -> wins.add(Triple(7, hand, bid))
        }
    }
    return wins.sortedWith(comparator2).foldIndexed(0L) { index, acc, triple ->
        acc + (index + 1) * triple.third
    }
}