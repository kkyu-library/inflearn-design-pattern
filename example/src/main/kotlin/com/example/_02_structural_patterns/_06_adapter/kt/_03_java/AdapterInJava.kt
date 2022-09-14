package com.example._02_structural_patterns._06_adapter.kt._03_java

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

fun main() {
    // collections
    val strings = listOf("a", "b", "c")
    val enumeration = Collections.enumeration(strings)
    val list = Collections.list(enumeration)

    // io
    try {
        FileInputStream("input.txt").use { `is` ->
            InputStreamReader(`is`).use { isr ->
                BufferedReader(isr).use { reader ->
                    while (reader.ready()) {
                        println(reader.readLine())
                    }
                }
            }
        }
    } catch (e: IOException) {
        throw RuntimeException(e)
    }
}
