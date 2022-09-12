package com.example._03_behavioral_patterns._21_strategy.kt._02_after

class BlueLightRedLight {
    fun blueLight(speed: Speed) {
        speed.blueLight()
    }

    fun redLight(speed: Speed) {
        speed.redLight()
    }
}
