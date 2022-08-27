package com.example._02_structural_patterns._07_bridge.kt._01_before

import com.example._02_structural_patterns._07_bridge.kt._02_after.Skin

interface Champion : Skin {
    fun move()
    fun skillQ()
    fun skillW()
    fun skillE()
    fun skillR()
}
