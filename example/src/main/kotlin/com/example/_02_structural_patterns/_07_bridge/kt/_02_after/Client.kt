package com.example._02_structural_patterns._07_bridge.kt._02_after

import com.example._02_structural_patterns._07_bridge.kt._01_before.Champion

fun main() {
    val kda아리: Champion = 아리(KDA())
    kda아리.skillE()
    kda아리.skillQ()

    val poolParty아리: Champion = 아리(PoolParty())
    poolParty아리.skillQ()
    poolParty아리.skillE()
}
