package com.example._01_creational_patterns._02_factory_method.kt._01_before

fun main() {
    val whiteShip = ShipFactory.orderShip("Whiteship", "keesun@mail.com")
    println(whiteShip)
    val blackShip = ShipFactory.orderShip("Blackship", "keesun@mail.com")
    println(blackShip)
}
