package com.example._03_behavioral_patterns._14_command.kt._01_before

class Button(
    private val light: Light
) {

    fun press() {
        light.off()
    }
}

fun main() {
    val button = Button(Light())
    button.press()
    button.press()
    button.press()
    button.press()
}
