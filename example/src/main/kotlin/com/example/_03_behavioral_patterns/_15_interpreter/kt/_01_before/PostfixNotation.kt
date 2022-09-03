package com.example._03_behavioral_patterns._15_interpreter.kt._01_before

import java.util.*

class PostfixNotation(
    private val expression: String
) {

    fun calculate() {
        val numbers = Stack<Int>()
        for (c in expression.toCharArray()) {
            when (c) {
                '+' -> numbers.push(numbers.pop() + numbers.pop())
                '-' -> {
                    val right = numbers.pop()
                    val left = numbers.pop()
                    numbers.push(left - right)
                }

                else -> numbers.push((c.toString() + "").toInt())
            }
        }
        println(numbers.pop())
    }
}

fun main() {
    val postfixNotation = PostfixNotation("123+-")
    postfixNotation.calculate()
}
