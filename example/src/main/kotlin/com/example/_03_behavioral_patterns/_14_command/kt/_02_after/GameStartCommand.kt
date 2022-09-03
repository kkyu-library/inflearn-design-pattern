package com.example._03_behavioral_patterns._14_command.kt._02_after

import com.example._03_behavioral_patterns._14_command.kt._01_before.Game

class GameStartCommand(
    private val game: Game
) : Command {

    override fun execute() {
        game.start()
    }

    override fun undo() {
        GameEndCommand(game).execute()
    }
}
