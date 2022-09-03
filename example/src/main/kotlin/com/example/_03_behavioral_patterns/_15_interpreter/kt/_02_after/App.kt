package com.example._03_behavioral_patterns._15_interpreter.kt._02_after

import java.util.Map

fun main() {
    val expression = PostfixParser.parse("xyz+-a+")
    val result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4))
    println(result)
}
