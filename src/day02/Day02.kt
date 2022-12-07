package day02

import readInput

fun main() {
    val part1Scores: Map<String, Int> =
        mapOf(
            "A X" to 1 + 3,
            "A Y" to 2 + 6,
            "A Z" to 3 + 0,
            "B X" to 1 + 0,
            "B Y" to 2 + 3,
            "B Z" to 3 + 6,
            "C X" to 1 + 6,
            "C Y" to 2 + 0,
            "C Z" to 3 + 3,
        )
    val part2Scores: Map<String, Int> =
        mapOf(
            "A X" to 3 + 0,
            "A Y" to 1 + 3,
            "A Z" to 2 + 6,
            "B X" to 1 + 0,
            "B Y" to 2 + 3,
            "B Z" to 3 + 6,
            "C X" to 2 + 0,
            "C Y" to 3 + 3,
            "C Z" to 1 + 6,
        )

    val testInput = readInput("day02", "Day02_test").split("\n")
    check(testInput.sumOf {
        part1Scores[it] ?: 0
    } == 15)

    val input = readInput("day02", "Day02").split("\n")
    println(input.sumOf {
        part2Scores[it] ?: 0
    })
}


