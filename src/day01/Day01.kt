fun main() {
    val testInput = readInput("day01", "Day01_test")
    check(maxCalories(testInput,3) == 45000)
    val input = readInput("day01","Day01")
    println(maxCalories(input,3))
}

fun maxCalories(input: String,top :Int): Int {
    return input.split("\n\n")
        .asSequence()
        .map { it.split("\n") }
        .map { it ->
            it.sumOf { it.toInt() }
        }.sortedDescending().take(top).sum()
}
