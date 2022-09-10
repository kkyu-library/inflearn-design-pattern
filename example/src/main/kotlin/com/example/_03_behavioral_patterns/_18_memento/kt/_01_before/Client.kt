package com.example._03_behavioral_patterns._18_memento.kt._01_before

fun main() {
    val game = Game()
    game.redTeamScore = 10
    game.blueTeamScore = 20

    val blueTeamScore = game.blueTeamScore
    val redTeamScore = game.redTeamScore
    val restoredGame = Game()
    restoredGame.blueTeamScore = blueTeamScore
    restoredGame.redTeamScore = redTeamScore
}
