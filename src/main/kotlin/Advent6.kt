fun advent6p1(input: String): Long {
    return input.split("\n").map { it.dropWhile { c -> !c.isDigit() } }
        .map { it.split(' ').filter { s -> s.isNotBlank() }.map { numberString -> numberString.toLong() } }.run {
        first().foldIndexed(1L) { index, acc, time ->
            acc * ((time / 2 - getStart(0, time / 2, time, last()[index])) * 2 - (time - 1) % 2)
        }
    }
}

private fun getStart(start: Long, end: Long, runTime: Long, distance: Long): Long {
    val value = (start + end) / 2
    return when {
        start == value || end == value -> value
        win(value, runTime, distance) -> getStart(start, value, runTime, distance)
        else -> getStart(value, end, runTime, distance)
    }
}

private fun win(powerTime: Long, runTime: Long, distance: Long) = powerTime * (runTime - powerTime) > distance