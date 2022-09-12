package com.example._03_behavioral_patterns._21_strategy.kt._01_before

class BlueLightRedLight(
    private val speed: Int
) {

    fun blueLight() {
        if (speed == 1) {
            println("무 궁 화    꽃   이")
        } else if (speed == 2) {
            println("무궁화꽃이")
        } else {
            println("무광꼬치")
        }
    }

    fun redLight() {
        if (speed == 1) {
            println("피 었 습 니  다.")
        } else if (speed == 2) {
            println("피었습니다.")
        } else {
            println("피어씀다")
        }
    }
}
