package com.example._01_creational_patterns._02_factory_method._01_before

import com.example._01_creational_patterns._02_factory_method.kt._01_before.ShipFactory
import org.junit.jupiter.api.Test

internal class ShipFactoryTest {

    @Test
    fun orderShip() {
        val whiteShip = ShipFactory.orderShip("Whiteship", "keesun@mail.com")
        println(whiteShip)
        val blackShip = ShipFactory.orderShip("Blackship", "keesun@mail.com")
        println(blackShip)
    }
}
