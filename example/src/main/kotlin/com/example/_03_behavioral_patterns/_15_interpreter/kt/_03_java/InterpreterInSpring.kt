package com.example._03_behavioral_patterns._15_interpreter.kt._03_java

import org.springframework.expression.ExpressionParser
import org.springframework.expression.spel.standard.SpelExpressionParser

fun main() {
    val book = Book("spring")
    val parser: ExpressionParser = SpelExpressionParser()
    val expression = parser.parseExpression("title")
    println(expression.getValue(book))
}

class Book(
    val title: String
)
