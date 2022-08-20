package com.example._01_creational_patterns._02_factory_method.kt._02_after

class BlackShipFactory : ShipFactory {

    override fun createShip(): Ship {
        return BlackShip()
    }
}

data class BlackShip(
    override val name: String = "blackship",
    override val color: String = "black",
    override val logo: String = "⚓",
) : Ship(name, color, logo)
