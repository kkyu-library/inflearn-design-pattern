package com.example._03_behavioral_patterns._15_interpreter.kt._02_after

interface PostfixExpression {
    fun interpret(context: Map<Char, Int>): Int
}
