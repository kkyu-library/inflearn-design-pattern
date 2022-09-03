package com.example._03_behavioral_patterns._14_command.kt._01_before

class MyApp(
    private val game: Game
) {
    fun press() {
        game.start()
    }
}

fun main() {
    val button = Button(Light())
    button.press()
    button.press()
    button.press()
    button.press()
}
