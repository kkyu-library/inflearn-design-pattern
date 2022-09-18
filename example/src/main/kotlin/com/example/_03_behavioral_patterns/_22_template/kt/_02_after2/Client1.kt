package com.example._03_behavioral_patterns._22_template.kt._02_after2

fun main() {
    val fileProcessor = FileProcessor("number.txt")
    val result = fileProcessor.process { result1: Int, number: Int -> result1 + number }
    println(result)
}
