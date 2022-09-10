package com.example._03_behavioral_patterns._18_memento.kt._02_after

class Game(
    var redTeamScore: Int = 0,
    var blueTeamScore: Int = 0
) {
    fun save(): GameSave {
        return GameSave(blueTeamScore, redTeamScore)
    }

    fun restore(gameSave: GameSave) {
        blueTeamScore = gameSave.blueTeamScore
        redTeamScore = gameSave.redTeamScore
    }
}
