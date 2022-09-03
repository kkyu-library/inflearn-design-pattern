package com.example._03_behavioral_patterns._14_command.kt._02_after

import com.example._03_behavioral_patterns._14_command.kt._01_before.Game

class MyApp(
    private val command: Command
) {

    fun press() {
        command.execute()
    }
}

fun main() {
    val myApp = MyApp(GameStartCommand(Game()))
}
