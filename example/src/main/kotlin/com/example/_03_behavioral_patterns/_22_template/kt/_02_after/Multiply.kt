package com.example._03_behavioral_patterns._22_template.kt._02_after

class Multiply(
    path: String
) : FileProcessor(path) {

    override fun getResult(result: Int, number: Int): Int {
        var result = result
        return number.let { result *= it; result }
    }
}
