package com.example._01_creational_patterns._01_singleton.kt

object Settings {}

fun main() {
    val settings1 = Settings
    val settings2 = Settings
    println(settings1 == settings2)
}
