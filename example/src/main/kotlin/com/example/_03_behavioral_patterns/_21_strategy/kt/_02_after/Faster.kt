package com.example._03_behavioral_patterns._21_strategy.kt._02_after

class Faster : Speed {
    override fun blueLight() {
        println("무궁화꽃이")
    }

    override fun redLight() {
        println("피었습니다.")
    }
}
