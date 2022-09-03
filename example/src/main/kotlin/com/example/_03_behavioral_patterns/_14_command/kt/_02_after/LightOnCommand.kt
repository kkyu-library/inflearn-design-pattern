package com.example._03_behavioral_patterns._14_command.kt._02_after

import com.example._03_behavioral_patterns._14_command.kt._01_before.Light

class LightOnCommand(
    private val light: Light
) : Command {

    override fun execute() {
        light.on()
    }

    override fun undo() {
        LightOffCommand(light).execute()
    }
}
