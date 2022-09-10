package com.example._03_behavioral_patterns._18_memento.kt._02_after

fun main() {
    val game = Game()
    game.blueTeamScore = 10
    game.redTeamScore = 20

    val save = game.save()
    game.blueTeamScore = 12
    game.redTeamScore = 22
    game.restore(save)

    println(game.blueTeamScore)
    println(game.redTeamScore)
}
