package com.example._03_behavioral_patterns._21_strategy.kt._03_java

fun main() {
    val numbers: MutableList<Int> = ArrayList()
    numbers.add(10)
    numbers.add(5)

    println(numbers)

    numbers.sortWith(Comparator.naturalOrder())
    println(numbers)
}
