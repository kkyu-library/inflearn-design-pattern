package com.example._01_creational_patterns._03_abstract_factory.kt._02_after

import com.example._01_creational_patterns._03_abstract_factory.kt._01_before.WhiteAnchor
import com.example._01_creational_patterns._03_abstract_factory.kt._01_before.WhiteWheel

class WhiteShipPartsFactory : ShipPartsFactory {

    override fun createAnchor(): Anchor {
        return WhiteAnchor()
    }

    override fun createWheel(): Wheel {
        return WhiteWheel()
    }
}
