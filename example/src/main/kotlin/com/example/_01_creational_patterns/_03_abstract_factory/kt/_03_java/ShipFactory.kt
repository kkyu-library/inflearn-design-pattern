package com.example._01_creational_patterns._03_abstract_factory.kt._03_java

import com.example._01_creational_patterns._02_factory_method.java._02_after.Ship
import com.example._01_creational_patterns._02_factory_method.java._02_after.WhiteShip
import org.springframework.beans.factory.FactoryBean

class ShipFactory : FactoryBean<Ship> {

    override fun getObject(): Ship {
        val ship: Ship = WhiteShip()
        ship.name = "whiteship"
        return ship
    }

    override fun getObjectType(): Class<*> {
        return Ship::class.java
    }
}
