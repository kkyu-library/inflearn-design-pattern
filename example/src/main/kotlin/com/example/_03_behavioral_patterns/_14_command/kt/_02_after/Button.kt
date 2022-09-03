package com.example._03_behavioral_patterns._14_command.kt._02_after

import com.example._03_behavioral_patterns._14_command.kt._01_before.Game
import com.example._03_behavioral_patterns._14_command.kt._01_before.Light
import java.util.*

class Button(
    private val commands: Stack<Command> = Stack<Command>()
) {
    fun press(command: Command) {
        command.execute()
        commands.push(command)
    }

    fun undo() {
        if (!commands.isEmpty()) {
            val command = commands.pop()
            command.undo()
        }
    }
}

fun main() {
    val button = Button()
    button.press(GameStartCommand(Game()))
    button.press(LightOnCommand(Light()))
    button.undo()
    button.undo()
}
