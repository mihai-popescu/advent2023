import kotlin.math.max

private val digitStrings =
    listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
private val digitChar = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")


fun advent1p1(input: String): Long =
    input.lowercase().split("\n").fold(0L) { acc, s ->
        acc + ((s.findAnyOf(digitChar)?.second ?: "") + (s.findLastAnyOf(digitChar)?.second ?: "0")).toLong()
    }

fun advent1p2(input: String): Long {
    return input.lowercase().split("\n").fold(0L) { acc, s ->
        acc +
                listOfNotNull(
                    s.findAnyOf(digitChar),
                    s.findAnyOf(digitStrings)
                ).minByOrNull { it.first }?.second.toDigit() * 10 +
                listOfNotNull(
                    s.findLastAnyOf(digitChar),
                    s.findLastAnyOf(digitStrings)
                ).maxByOrNull { it.first }?.second.toDigit()
    }
}

private fun String?.toDigit(): Int = this?.toIntOrNull() ?: max(0, digitStrings.indexOf(this))
