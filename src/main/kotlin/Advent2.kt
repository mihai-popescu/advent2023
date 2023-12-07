fun advent2p1(input: String): Long {
    return input.split("\n").foldIndexed(0L) { index, acc, s ->
        val add = s.dropWhile { c ->
            c != ':'
        }.drop(1).split(";").all { game ->
            var blue = 0
            var green = 0
            var red = 0
            game.split(",").forEach { balls ->
                when {
                    balls.indexOf("red", ignoreCase = true) > -1 -> red =
                        balls.filter { it.isDigit() }.toInt()

                    balls.indexOf("green", ignoreCase = true) > -1 -> green =
                        balls.filter { it.isDigit() }.toInt()

                    balls.indexOf("blue", ignoreCase = true) > -1 -> blue =
                        balls.filter { it.isDigit() }.toInt()
                }
            }
            red <= 12 && green <= 13 && blue <= 14
        }
        if (add) acc + index + 1 else acc
    }
}

fun advent2p2(input: String): Long {
    return input.split("\n").fold(0L) { acc, s ->
        var blue = 0
        var green = 0
        var red = 0
        s.dropWhile { c ->
            c != ':'
        }.drop(1).split(";").forEach { game ->
            game.split(",").forEach { balls ->
                when {
                    balls.indexOf("red", ignoreCase = true) > -1 -> red =
                        maxOf(red, balls.filter { it.isDigit() }.toInt())

                    balls.indexOf("green", ignoreCase = true) > -1 -> green =
                        maxOf(green, balls.filter { it.isDigit() }.toInt())

                    balls.indexOf("blue", ignoreCase = true) > -1 -> blue =
                        maxOf(blue, balls.filter { it.isDigit() }.toInt())
                }
            }
        }
        acc + blue * green * red
    }
}