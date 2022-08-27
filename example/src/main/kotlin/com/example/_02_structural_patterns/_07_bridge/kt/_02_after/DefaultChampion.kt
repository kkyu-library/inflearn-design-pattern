package com.example._02_structural_patterns._07_bridge.kt._02_after

import com.example._02_structural_patterns._07_bridge.kt._01_before.Champion

open class DefaultChampion(
    private val skin: Skin,
    override val name: String
) : Champion {
    override fun move() {
        System.out.printf("%s %s move\n", skin.name, name)
    }

    override fun skillQ() {
        System.out.printf("%s %s Q\n", skin.name, name)
    }

    override fun skillW() {
        System.out.printf("%s %s W\n", skin.name, name)
    }

    override fun skillE() {
        System.out.printf("%s %s E\n", skin.name, name)
    }

    override fun skillR() {
        System.out.printf("%s %s R\n", skin.name, name)
    }
}
