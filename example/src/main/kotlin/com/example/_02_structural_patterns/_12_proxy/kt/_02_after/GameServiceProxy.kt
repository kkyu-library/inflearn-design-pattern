package com.example._02_structural_patterns._12_proxy.kt._02_after

class GameServiceProxy(
    private var gameService: GameService = DefaultGameService()
) : GameService {

    override fun startGame() {
        val before = System.currentTimeMillis()
        gameService.startGame()
        println(System.currentTimeMillis() - before)
    }
}
