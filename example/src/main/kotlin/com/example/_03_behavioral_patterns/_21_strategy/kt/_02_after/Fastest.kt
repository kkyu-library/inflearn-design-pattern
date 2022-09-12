package com.example._03_behavioral_patterns._21_strategy.kt._02_after

class Fastest : Speed {
    override fun blueLight() {
        println("무광꼬치")
    }

    override fun redLight() {
        println("피어씀다.")
    }
}
