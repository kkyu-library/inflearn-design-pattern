package com.example._01_creational_patterns._03_abstract_factory.kt._02_after

import com.example._01_creational_patterns._02_factory_method.kt._02_after.Ship
import com.example._01_creational_patterns._02_factory_method.kt._02_after.ShipFactory
import com.example._01_creational_patterns._02_factory_method.kt._02_after.WhiteShip

class WhiteShipFactory(
    private val shipPartsFactory: ShipPartsFactory
) : ShipFactory {

    override fun createShip(): Ship {
        val ship: Ship = WhiteShip()
        ship.anchor = shipPartsFactory.createAnchor()
        ship.wheel = shipPartsFactory.createWheel()
        return ship
    }
}
