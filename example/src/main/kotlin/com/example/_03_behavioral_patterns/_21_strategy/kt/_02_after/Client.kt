package com.example._03_behavioral_patterns._21_strategy.kt._02_after

fun main() {
    val game = BlueLightRedLight()
    game.blueLight(Normal())
    game.redLight(Fastest())
    game.blueLight(object : Speed {
        override fun blueLight() {
            println("blue light")
        }

        override fun redLight() {
            println("red light")
        }
    })
}
