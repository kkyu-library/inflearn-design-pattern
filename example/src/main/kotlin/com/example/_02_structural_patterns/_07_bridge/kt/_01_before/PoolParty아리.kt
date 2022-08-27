package com.example._02_structural_patterns._07_bridge.kt._01_before

class PoolParty아리(
    override val name: String
) : Champion {
    override fun move() {
        println("PoolParty move")
    }

    override fun skillQ() {
        println("PoolParty Q")
    }

    override fun skillW() {
        println("PoolParty W")
    }

    override fun skillE() {
        println("PoolParty E")
    }

    override fun skillR() {
        println("PoolParty R")
    }
}
