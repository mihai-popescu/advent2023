import data.ADVENT_DAY_5_DATA
import data.ADVENT_DAY_6_DATA
import data.ADVENT_DAY_6_DATA_TEST

fun main() {
    println("Program result: ${adventDay6Part1()}")
}

private fun adventDay5Part2(): Long = advent5p2(ADVENT_DAY_5_DATA)

private fun adventDay6Part1Test(): Long = advent6p1(ADVENT_DAY_6_DATA_TEST)

private fun adventDay6Part1(): Long = advent6p1(ADVENT_DAY_6_DATA)