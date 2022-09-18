package com.example._03_behavioral_patterns._22_template.kt._02_after

fun main() {
    val fileProcessor: FileProcessor = Multiply("number.txt")
    val result = fileProcessor.process()
    println(result)
}
