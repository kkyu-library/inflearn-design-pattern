package com.example._03_behavioral_patterns._15_interpreter.kt._03_java

import java.util.regex.Pattern

fun main() {
    println(Pattern.matches(".pr...", "spring"))
    println(Pattern.matches("[a-z]{6}", "spring"))
    println(Pattern.matches("white[a-z]{4}[0-9]{4}", "whiteship2000"))
    println(Pattern.matches("\\d", "1")) // one digit
    println(Pattern.matches("\\D", "a")) // one non-digit
}
