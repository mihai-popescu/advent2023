import kotlin.math.max
import kotlin.math.sign

fun advent6p1(input: String): Long {
    return input.split("\n").map { it.dropWhile { c -> !c.isDigit() } }
        .map { it.split(' ').filter { s -> s.isNotBlank() }.map { numberString -> numberString.toLong() } }.run {
            first().foldIndexed(1L) { index, acc, time ->
                acc * ((time / 2 - findIndex(time, last()[index])) * 2 - (time - 1) % 2)
            }
        }
}

fun advent6p2(input: String): Long {
    return input.split("\n").map { it.dropWhile { c -> !c.isDigit() } }
        .map { it.replace(" ", "") }.map { numberString -> numberString.toLong() }.run {
            (first() / 2 - findIndex(first(), last())) * 2 - (first() - 1) % 2
        }
}

private fun findIndex(runTime: Long, distance: Long): Long =
    findIndex(runTime, distance, 0L to runTime / 2)


private fun findIndex(runTime: Long, distance: Long, result: Pair<Long, Long>): Long {
    val (start, end) = result
    val value = (start + end) / 2
    if (start == value || end == value) return value
    with(win(value, runTime, distance)) {
        return findIndex(runTime, distance, start + this * (value - start) to value + this * (end - value))
    }
}

private fun win(powerTime: Long, runTime: Long, distance: Long) =
    max(0L, (distance - powerTime * (runTime - powerTime)).toDouble().sign.toLong())