import kotlin.math.pow

fun advent4p1(input: String): Long {
    return input.split("\n").fold(0L) { acc, s ->
        val groups = s.dropWhile { c ->
            c != ':'
        }.drop(1).split('|')
        val winingNumber = groups.first().split(' ').filterNot { it.isEmpty() }.map { it.toInt() }
        val cardNumbers = groups.last().split(' ').filterNot { it.isEmpty() }.map { it.toInt() }
        val result = winingNumber.filter { cardNumbers.contains(it) }.size
        acc + if (result == 0) 0 else 2.toFloat().pow(result - 1).toLong()
    }
}
fun advent4p2(input: String): Long {
    val winnings = mutableListOf<Int>()
    input.split("\n").forEachIndexed { index, s ->
        val groups = s.dropWhile { c ->
            c != ':'
        }.drop(1).split('|')
        val winingNumber = groups.first().split(' ').filterNot { it.isEmpty() }.map { it.toInt() }
        val cardNumbers = groups.last().split(' ').filterNot { it.isEmpty() }.map { it.toInt() }
        val result = winingNumber.filter { cardNumbers.contains(it) }.size
        if (winnings.size -1 < index) winnings.add(1) else winnings[index] += 1
        IntRange(1, result).forEach {
            if (it + index > winnings.size - 1) winnings.add(winnings[index])
            else winnings[it + index] += winnings[index]
        }
    }
    return winnings.fold(0) {acc, i -> acc + i  }
}