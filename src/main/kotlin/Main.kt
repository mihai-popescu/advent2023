import kotlin.math.pow

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${advent5_2("""seeds: 4106085912 135215567 529248892 159537194 1281459911 114322341 1857095529 814584370 2999858074 50388481 3362084117 37744902 3471634344 240133599 3737494864 346615684 1585884643 142273098 917169654 286257440

seed-to-soil map:
1640984363 3136305987 77225710
3469528922 1857474741 56096642
278465165 2901870617 105516220
1442950910 1913571383 198033453
463085535 1458252975 13696838
1718210073 1686050230 171424511
383981385 3064707638 71598349
1267048154 3759577328 175902756
3262934306 1479455614 206594616
2493001016 200414015 157177749
3885112776 411057950 157348766
4042461542 1181162257 199039568
476782373 2111604836 790265781
455579734 1471949813 7505801
1889634584 3213531697 546045631
4241501110 357591764 53466186
3525625564 3935480084 359487212
2650178765 568406716 612755541
200414015 1380201825 78051150
2435680215 3007386837 57320801

soil-to-fertilizer map:
513693437 1166448955 406316429
3977989337 1831898517 148449061
2857616419 1749713256 55966993
2245899978 767737007 398711948
3462028551 3402487827 258322330
1207747701 2246116788 274586148
1857449833 2520702936 106524473
950443356 290304833 224196260
2913583412 1805680249 26218268
290304833 3849361293 119346889
3720350881 3244527156 157960671
920009866 1634093064 30433490
409651722 2627227409 104041715
3916661657 1572765384 61327680
1624788708 2115889182 130227606
1963974306 3695907849 9066861
1755016314 1980347578 102433519
1973041167 3151152620 93374536
1482333849 710468850 57268157
2644611926 2899798022 213004493
1539602006 1664526554 85186702
2210802286 3660810157 35097692
3135769437 3968708182 326259114
1174639616 2082781097 33108085
3878311552 3112802515 38350105
2066415703 3704974710 144386583
2939801680 514501093 195967757
4126438398 2731269124 168528898

fertilizer-to-water map:
1274667249 2789153677 35498097
1119124697 1423189114 4201717
1775973674 127038866 409949870
2636872711 677641697 238584014
998550357 2708616519 80537158
1613168083 3037802277 162805591
1123326414 2618446916 90169603
2516959328 2034731526 119913383
3879305887 3993605604 147788774
1213496017 2616229293 2217623
3412445194 3202949622 62545934
2875456725 2194682091 362593593
1079087515 2154644909 40037182
2468026227 3426058027 48933101
0 1427390831 607340695
2185923544 0 127038866
1310165346 916225711 76820908
2312962410 993046619 155063817
607340695 1369464790 53724324
1389328008 536988736 140652961
1386986254 3200607868 2341754
4241108893 3701026057 53858403
661065019 2824651774 213150503
1529980969 3342870913 83187114
921175000 3265495556 77375357
874215522 1148110436 46959478
4180667579 3914761609 60441314
3238050318 1195069914 174394876
3701026057 3754884460 159877149
4027094661 4141394378 153572918
3860903206 3975202923 18402681
1215713640 2557275684 58953609

water-to-light map:
3346671099 2139469351 253535694
3600206793 4187771498 107195798
1271601308 936374322 163567625
3890528820 1799438963 144160054
1731948725 3256631615 148580525
3859991790 2573461247 250171
389304550 1099941947 124474859
2322259245 1445947039 39679535
1544278612 1943599017 46211136
1124738947 789511961 146862361
3860946526 2109887057 29582294
891137223 173339870 233601724
3044858977 1485626574 301812122
627354019 0 173339870
800693889 1224416806 90443334
4046689141 2034661517 75225540
4166766045 4059570247 128201251
0 1314860140 120308793
4034688874 1787438696 12000267
2294392242 2393005045 27867003
2361938780 2573711418 682920197
4121914681 1989810153 44851364
1674653431 3705039670 14123300
1445242474 3719162970 99036138
513779409 406941594 113574610
3707402591 2420872048 152589199
2053021103 3818199108 241371139
3860241961 1445242474 704565
1880529250 3489375823 172491853
1688776731 3661867676 43171994
120308793 520516204 268995757
1590489748 3405212140 84163683

light-to-temperature map:
1711282888 1572780528 87721767
154126417 0 43277112
950353983 1343526858 179094373
2607445049 2714989532 110883165
197403529 400138402 104876963
302280492 43277112 202734873
2990325458 1942480091 22763517
2203652414 1550069916 22710612
3347561974 4075093920 130901113
1328424170 3514387681 17133869
3187047160 4220120429 74846867
3555672228 4205995033 676520
555737175 2292503071 178861674
936905107 4206671553 13448876
2718328214 2825872697 25755942
2042629442 945726244 118907923
2161537365 3027858084 42115049
1657501024 1888698227 53781864
2943656210 3804007444 46669248
2226363026 2004226072 108596129
0 246011985 154126417
734598849 2928837780 99020304
833619153 1660502295 103285954
2744084156 3436875901 77511780
1299692440 2112822201 28731730
2821595936 782812975 122060274
1799004655 2471364745 95185072
3082783503 1965243608 38982464
2334959155 3531521550 272485894
3121765967 2227221878 65281193
1392230801 3850676692 224417228
3013088975 528288490 69694528
1616648029 904873249 40852995
1345558039 3069973133 46672762
3681258726 1064634167 278892691
1894189727 2566549817 148439715
1129448356 597983018 170244084
3261894027 2141553931 85667947
3478463087 2851628639 77209141
3556348748 1763788249 124909978
4280381423 768227102 14585873
528288490 1522621231 27448685
3960151417 3116645895 320230006

temperature-to-humidity map:
2401309547 2063893326 5931150
4081820678 1536756293 195703517
3389837279 4114880485 97950323
67647704 537880870 95615044
3487787602 2069824476 16209316
212366581 0 210367924
0 470233166 67647704
163262748 331958016 49103833
3921228390 3754997923 26024946
1883070873 986328296 29590327
1844673227 4256569650 38397646
422734505 381061849 89171317
3835004067 4212830808 43738842
1753523088 1732459810 63479835
4277524195 3781022869 17443101
926010074 3798465970 316414515
511905822 210367924 31838014
3565158997 3485152853 269845070
3878742909 776643827 42485481
3352296690 1795939645 37540589
2877358153 2512426556 474938537
1419995251 1068661114 304321846
1348461498 705110074 71533753
1724317097 1372982960 29205991
1974916783 2086033792 426392764
2407240697 3015035397 470117456
1242424589 880291387 106036909
642854491 1833480234 230413092
3503996918 819129308 61162079
543743836 242205938 89752078
873267583 1015918623 52742491
1817002923 2987365093 27670304
1912661200 642854491 62255583
3947253336 1402188951 134567342

humidity-to-location map:
2955816171 2260659770 927037009
1906648752 2188942242 71717528
848878920 35928575 8026852
4100692468 1994667414 194274828
2066384942 3405536067 889431229
559945395 1052613350 288933525
3882853180 3187696779 217839288
856905772 1341546875 164300625
0 528596530 524016820
1978366280 1723924810 88018662
1044385850 67134880 400987760
524016820 0 35928575
1021206397 43955427 23179453
1445373610 468122640 60473890
1723924810 1811943472 182723942""")}")
}




private val digitStrings =
    listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
private val digitChar = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")

fun advent1_2(input: String): Long {
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

fun advent1_1(input: String): Long {
    return input.lowercase().split("\n").fold(0L) { acc, s ->
        val charDigit = s.findAnyOf(digitChar)
        val firstDigit = when {
            charDigit == null -> 0
            else -> digitChar.indexOf(charDigit.second)
        }
        val lastCharDigit = s.findLastAnyOf(digitChar)
        val lastDigit = when {
            lastCharDigit == null -> 0
            else -> digitChar.indexOf(lastCharDigit.second)
        }
        acc + firstDigit * 10 + lastDigit
    }
}

fun advent2_1(input: String): Long {
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

fun advent2_2(input: String): Long {
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
private fun Char.isSpecial() = !this.isDigit() && this != '.'

fun advent4_1(input: String): Long {
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
fun advent4_2(input: String): Long {
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