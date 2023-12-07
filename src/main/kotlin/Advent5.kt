

fun advent5_1(input: String): Long {
    val inputSplit = input.split("\n\n")
    val seeds = inputSplit.first().dropWhile { c ->
        c != ':'
    }.drop(2).split(' ').map { it.toLong() }
    val map = inputSplit.drop(1)
    return mapValues(seeds, map).min()
}

fun advent5_2(input: String): Long {
    val inputSplit = input.split("\n\n")
    val seedsRange = inputSplit.first().dropWhile { c ->
        c != ':'
    }.drop(2).split(' ').map { it.toLong() }
    val seeds = (seedsRange.indices step 2).map {
        seedsRange[it] to seedsRange[it + 1]
    }
    val map = inputSplit.drop(1)
    return mapValues2(seeds, map).min()
}


private fun mapValues(values: List<Long>, maps: List<String>): List<Long> {
    if (maps.isEmpty()) return values
    val mapTriple = maps.first().split("\n").drop(1).map {
        it.split(" ").map { it.toLong() }
    }
    return mapValues(values.map { value ->
        mapTriple.firstOrNull { triple -> value in LongRange(triple[1], triple[1] + triple[2]) }?.let { triple ->
            triple[0] + value - triple[1]
        } ?: value
    }, maps.drop(1))
}

private fun mapValues2(values: List<Pair<Long, Long>>, maps: List<String>): List<Long> {
    if (maps.isEmpty()) return values.map { it.first }
    val mapTriple = maps.first().split("\n").drop(1).map {
        it.split(" ").map { it.toLong() }
    }
    val newValues = mutableListOf<Pair<Long, Long>>()
    values.forEach { (initialValue, range) ->
        var initialIndex = initialValue
        var rangeLeft = range
        while (rangeLeft > 0) {
            mapTriple.firstOrNull { triple ->
                initialIndex in LongRange(
                    triple[1],
                    triple[1] + triple[2] - 1
                )
            }?.let { triple ->
                newValues.add(triple[0] + initialIndex - triple[1] to minOf(
                    rangeLeft,
                    triple[2] + (triple[1] - initialIndex))
                ).also {
                    val newRange =
                        rangeLeft - minOf(rangeLeft, triple[2] + (triple[1] - initialIndex))
                    initialIndex += rangeLeft - newRange
                    rangeLeft = newRange
                }
            } ?: run {
                val newRange = LongRange(initialIndex, initialIndex + rangeLeft - 1)
                mapTriple.filter { it[1] in newRange }.sortedBy { it[1] }.firstOrNull()?.let {
                    val rangeI = it[1] - initialIndex
                    newValues.add(initialIndex to rangeI).also {
                        initialIndex += rangeI
                        rangeLeft -= rangeI
                    }
                } ?: run {
                    newValues.add(initialIndex to rangeLeft).also {
                        initialIndex += rangeLeft
                        rangeLeft = 0
                    }
                }

            }
        }
    }
    return mapValues2(newValues, maps.drop(1))
}