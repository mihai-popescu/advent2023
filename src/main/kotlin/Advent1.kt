private val digitStrings =
    listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
private val digitChar = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")


fun advent1p1(input: String): Long {
    return input.lowercase().split("\n").fold(0L) { acc, s ->
        val firstDigit = when (val charDigit = s.findAnyOf(digitChar)) {
            null -> 0
            else -> digitChar.indexOf(charDigit.second)
        }
        val lastDigit = when (val lastCharDigit = s.findLastAnyOf(digitChar)) {
            null -> 0
            else -> digitChar.indexOf(lastCharDigit.second)
        }
        acc + firstDigit * 10 + lastDigit
    }
}

fun advent1p2(input: String): Long {
    return input.lowercase().split("\n").fold(0L) { acc, s ->
        val stringDigit = s.findAnyOf(digitStrings)
        val charDigit = s.findAnyOf(digitChar)
        val firstDigit = when {
            stringDigit == null && charDigit == null -> 0
            stringDigit == null -> digitChar.indexOf(charDigit!!.second)
            charDigit == null -> digitStrings.indexOf(stringDigit.second)
            charDigit.first < stringDigit.first -> digitChar.indexOf(charDigit.second)
            else -> digitStrings.indexOf(stringDigit.second)
        }
        val lastStringDigit = s.findLastAnyOf(digitStrings)
        val lastCharDigit = s.findLastAnyOf(digitChar)
        val lastDigit = when {
            lastStringDigit == null && lastCharDigit == null -> 0
            lastStringDigit == null -> digitChar.indexOf(lastCharDigit!!.second)
            lastCharDigit == null -> digitStrings.indexOf(lastStringDigit.second)
            lastCharDigit.first > lastStringDigit.first -> digitChar.indexOf(lastCharDigit.second)
            else -> digitStrings.indexOf(lastStringDigit.second)
        }
        acc + firstDigit * 10 + lastDigit
    }
}