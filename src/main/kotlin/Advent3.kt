private fun Char.isSpecial() = !this.isDigit() && this != '.'

fun advent3_1(input: String): Long {
    val lines = input.split("\n")
    return lines.foldIndexed(0L) { index, acc, line ->
        var startIndex = 0
        acc + line.fold("")
        { s, c -> if (c.isDigit()) s+c else "$s." }.split(".").filterNot { it.isEmpty() }.fold(0L) { acc2, s ->
            val start = maxOf(0, line.indexOf(s, startIndex) - 1)
            val end = minOf(line.length - 1, line.indexOf(s, startIndex) + s.length)
            startIndex = start + s.length
            if (line[start].isSpecial()) return@fold acc2 + s.toInt()
            if (line[end].isSpecial()) return@fold acc2 + s.toInt()
            if (index > 0 && lines[index - 1].drop(start).dropLast(line.length - 1 - end).any {it.isSpecial()
                }) return@fold acc2 + s.toInt()
            if (index + 1 < line.length && lines[index + 1].drop(start).dropLast(line.length - 1 - end).any {it.isSpecial()
                }) return@fold acc2 + s.toInt()
            acc2
        }
    }
}

fun advent3_2(input: String): Long {
    val lines = input.split("\n")
    return lines.foldIndexed(0L) { indexLine, accTotal, line ->
        accTotal + line.foldIndexed(0L) { indexColoum, accLine, character ->
            accLine + if (character == '*') {
                val range = IntRange(indexColoum - 1, indexColoum + 1)
                val numbers =
                    (if (indexLine > 0) numbersInRangeOfLine(lines[indexLine - 1], range) else
                        emptyList()) +
                            numbersInRangeOfLine(line, range) +
                            (if (indexLine < lines.size - 1) numbersInRangeOfLine(
                                lines[indexLine + 1],
                                range
                            ) else
                                emptyList())
                if (numbers.size == 2) numbers.first() * numbers.last() else 0
            } else 0
        }
    }
}

private fun numbersInRangeOfLine(line: String, range: IntRange): List<Int> {
    return lineNumbers(line).mapNotNull { (index, stringNumber) ->
        if (IntRange(index, index + stringNumber.length - 1).any { it in range})
            stringNumber.toInt()
        else null
    }
}

private fun lineNumbers(line: String): List<Pair<Int, String>> {
    val numbers = mutableListOf<Pair<Int, String>>()
    var isNumber = false
    line.forEachIndexed { index, c ->
        when {
            c.isDigit() && isNumber -> {
                val lastNumber = numbers.last()
                numbers.removeLast()
                numbers.add(lastNumber.first to lastNumber.second + c)
            }
            c.isDigit() && !isNumber -> {
                numbers.add(index to c.toString())
                isNumber = true
            }
            !c.isDigit() -> isNumber = false
        }
    }
    return numbers
}