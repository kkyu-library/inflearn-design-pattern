package com.example._03_behavioral_patterns._14_command.kt._02_after

import com.example._03_behavioral_patterns._14_command.kt._01_before.Game

class GameEndCommand(
    private val game: Game
) : Command {

    override fun execute() {
        game.end()
    }

    override fun undo() {
        GameStartCommand(game).execute()
    }
}
