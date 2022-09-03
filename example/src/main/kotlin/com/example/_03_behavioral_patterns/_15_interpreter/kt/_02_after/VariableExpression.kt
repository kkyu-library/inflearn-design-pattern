package com.example._03_behavioral_patterns._15_interpreter.kt._02_after

class VariableExpression(
    private val character: Char
) : PostfixExpression {

    override fun interpret(context: Map<Char, Int>): Int {
        return context[character]!!
    }
}
