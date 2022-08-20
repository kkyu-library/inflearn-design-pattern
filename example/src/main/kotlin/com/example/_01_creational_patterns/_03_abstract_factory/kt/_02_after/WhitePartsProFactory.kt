package com.example._01_creational_patterns._03_abstract_factory.kt._02_after

class WhitePartsProFactory : ShipPartsFactory {

    override fun createAnchor(): Anchor {
        return WhiteAnchorPro()
    }

    override fun createWheel(): Wheel {
        return WhiteWheelPro()
    }
}

class WhiteAnchorPro : Anchor

class WhiteWheelPro : Wheel
