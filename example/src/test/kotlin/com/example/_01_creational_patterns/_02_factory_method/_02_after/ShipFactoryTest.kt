package com.example._01_creational_patterns._02_factory_method._02_after

import com.example._01_creational_patterns._02_factory_method.kt._02_after.BlackShipFactory
import com.example._01_creational_patterns._02_factory_method.kt._02_after.WhiteShipFactory
import org.junit.jupiter.api.Test

internal class ShipFactoryTest {

    @Test
    fun orderShip() {
        val whiteShip = WhiteShipFactory().orderShip("whiteship", "keesun@mail.com")
        val blackShip = BlackShipFactory().orderShip("blackship", "keesun@mail.com")
        println(whiteShip)
        println(blackShip)
    }
}
