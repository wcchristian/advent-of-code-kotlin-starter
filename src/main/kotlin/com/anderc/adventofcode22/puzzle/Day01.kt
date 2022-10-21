package com.anderc.adventofcode22.puzzle

import com.anderc.adventofcode22.util.FileLoader

object Day01 {
    fun printSolution() {
        println("Solution 1: ${part1()}")
        println("Solution 2: ${part2()}")
    }

    fun part1(): String {
        val stringLines = FileLoader.loadFromFile<String>("/day01.txt")
        return stringLines[0]
    }

    fun part2(): String {
        val sampleLines = FileLoader.loadFromFile<String>("/day01_sample.txt")
        return sampleLines[1]
    }
}