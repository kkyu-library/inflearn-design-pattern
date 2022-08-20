package com.example._01_creational_patterns._02_factory_method.kt._02_after

class WhiteShipFactory : ShipFactory {

    override fun createShip(): Ship {
        return WhiteShip()
    }
}

data class WhiteShip(
    override val name: String = "whiteship",
    override val logo: String = "\uD83D\uDEE5️",
    override val color: String = "white",
) : Ship(name, color, logo)
