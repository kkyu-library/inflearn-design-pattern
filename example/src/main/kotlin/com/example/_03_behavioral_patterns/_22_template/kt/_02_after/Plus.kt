package com.example._03_behavioral_patterns._22_template.kt._02_after

class Plus(
    path: String
) : FileProcessor(path) {

    public override fun getResult(result: Int, number: Int): Int {
        var result = result
        return number.let { result += it; result }
    }
}
