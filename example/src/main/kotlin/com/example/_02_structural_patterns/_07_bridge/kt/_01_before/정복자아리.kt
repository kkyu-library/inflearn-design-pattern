package com.example._02_structural_patterns._07_bridge.kt._01_before

class 정복자아리(
    override val name: String
) : Champion {
    override fun move() {
        println("정복자 아리 move")
    }

    override fun skillQ() {
        println("정복자 아리 Q")
    }

    override fun skillW() {
        println("정복자 아리 W")
    }

    override fun skillE() {
        println("정복자 아리 E")
    }

    override fun skillR() {
        println("정복자 아리 R")
    }
}
