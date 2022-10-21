package org.example.adventofcode.puzzle

import org.example.adventofcode.util.FileLoader

object Day02 {
    fun printSolution() {
        println("Solution 1: ${part1("/day02.txt")}")
        println("Solution 2: ${part2("/day02.txt")}")
    }

    fun part1(filePath: String): Int {
        val floats = FileLoader.loadFromFile<Float>(filePath)
        return floats[0].toInt()
    }

    fun part2(filePath: String): Int {
        val floats = FileLoader.loadFromFile<Float>(filePath)
        return floats[1].toInt()
    }
}