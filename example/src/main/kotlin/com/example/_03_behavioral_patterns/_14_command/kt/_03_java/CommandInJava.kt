package com.example._03_behavioral_patterns._14_command.kt._03_java

import com.example._03_behavioral_patterns._14_command.kt._01_before.Game
import com.example._03_behavioral_patterns._14_command.kt._01_before.Light
import java.util.concurrent.Executors

fun main() {
    val light = Light()
    val game = Game()
    val executorService = Executors.newFixedThreadPool(4)
    executorService.submit { light.on() }
    executorService.submit { game.start() }
    executorService.submit { game.end() }
    executorService.submit { light.off() }
    executorService.shutdown()
}
