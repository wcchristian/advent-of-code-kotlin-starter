package com.anderc.adventofcode22.util

import java.util.stream.Collectors

@Suppress("UNCHECKED_CAST")
object FileLoader {

    @SuppressWarnings("unchecked")
    inline fun <reified T> loadFromFile(filePath: String): List<T> {
        val fileText = FileLoader::class.java.getResource(filePath)!!.readText()
        return when(T::class) {
            Int::class -> fileText.lines().stream().map {it.toInt()}.collect(Collectors.toList()) as List<T>
            Float::class -> fileText.lines().stream().map { it.toFloat() }.collect(Collectors.toList()) as List<T>
            else -> fileText.lines() as List<T>
        }
    }
}