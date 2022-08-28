package com.example._02_structural_patterns._12_proxy.kt._02_after

fun main() {
    val gameService: GameService = GameServiceProxy()
    gameService.startGame()
}
