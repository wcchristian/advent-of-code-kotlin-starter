package org.example.adventofcode.puzzle

import org.example.adventofcode.util.FileLoader

fun part1(filePath: String): String {
    val fileLines = FileLoader.loadFromFile<String>(filePath)
    return fileLines[0]
}

fun part2(filePath: String): String {
    return "test"
}

fun main() {
    println("Part 1 example solution is: ${part1("/day01_example.txt")}")
    println("Part 1 main solution is: ${part1("/day01.txt")}")
    println("Part 2 example solution is: ${part2("/day01_example.txt")}")
    println("Part 2 main solution is: ${part2("/day01.txt")}")
}