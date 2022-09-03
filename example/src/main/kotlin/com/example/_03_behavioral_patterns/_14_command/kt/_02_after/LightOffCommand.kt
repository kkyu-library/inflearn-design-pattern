package com.example._03_behavioral_patterns._14_command.kt._02_after

import com.example._03_behavioral_patterns._14_command.kt._01_before.Light

class LightOffCommand(
    private val light: Light
) : Command {

    override fun execute() {
        light.off()
    }

    override fun undo() {
        LightOnCommand(light).execute()
    }
}
