package com.example._01_creational_patterns._02_factory_method.kt._02_after

fun main() {
    val whiteShip = WhiteShipFactory().orderShip("whiteship", "keesun@mail.com")
    val blackShip = BlackShipFactory().orderShip("blackship", "keesun@mail.com")
    println(whiteShip)
    println(blackShip)
}
