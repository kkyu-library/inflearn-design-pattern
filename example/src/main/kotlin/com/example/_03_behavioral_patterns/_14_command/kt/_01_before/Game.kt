package com.example._03_behavioral_patterns._14_command.kt._01_before

class Game(
    private var isStarted: Boolean = false
) {

    fun start() {
        println("게임을 시작합니다.")
        isStarted = true
    }

    fun end() {
        println("게임을 종료합니다.")
        isStarted = false
    }
}
