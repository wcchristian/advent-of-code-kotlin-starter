package com.anderc.adventofcode22.puzzle

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day01Test {

    @Test
    fun samplePart1() {
        assertEquals("this", Day01.part1("/day01_sample.txt"))
    }

    @Test
    fun part1() {
        assertEquals("this", Day01.part1("/day01.txt"))
    }

    @Test
    fun samplePart2() {
        assertEquals("is", Day01.part2("/day01_sample.txt"))
    }

    @Test
    fun part2() {
        assertEquals("is", Day01.part2("/day01.txt"))
    }
}