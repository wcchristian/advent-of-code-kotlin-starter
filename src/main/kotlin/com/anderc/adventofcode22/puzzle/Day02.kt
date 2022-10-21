package com.anderc.adventofcode22.puzzle

import com.anderc.adventofcode22.util.FileLoader

object Day02 {
    fun printSolution() {
        println("Solution 1: ${part1()}")
        println("Solution 2: ${part2()}")
    }

    fun part1(): Int {
        val floats = FileLoader.loadFromFile<Float>("/day02.txt")
        return floats[0].toInt()
    }

    fun part2(): Int {
        val floats = FileLoader.loadFromFile<Float>("/day02.txt")
        return floats[1].toInt()
    }
}