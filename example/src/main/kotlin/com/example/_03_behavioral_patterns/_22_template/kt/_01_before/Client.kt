package com.example._03_behavioral_patterns._22_template.kt._01_before

fun main() {
    val fileProcessor = FileProcessor("number.txt")
    val result = fileProcessor.process()
    println(result)
}
