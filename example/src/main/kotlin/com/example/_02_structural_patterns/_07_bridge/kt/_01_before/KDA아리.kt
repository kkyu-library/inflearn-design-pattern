package com.example._02_structural_patterns._07_bridge.kt._01_before

class KDA아리(
    override val name: String
) : Champion {
    override fun move() {
        println("KDA 아리 move")
    }

    override fun skillQ() {
        println("KDA 아리 Q")
    }

    override fun skillW() {
        println("KDA 아리 W")
    }

    override fun skillE() {
        println("KDA 아리 E")
    }

    override fun skillR() {
        println("KDA 아리 R")
    }
}
