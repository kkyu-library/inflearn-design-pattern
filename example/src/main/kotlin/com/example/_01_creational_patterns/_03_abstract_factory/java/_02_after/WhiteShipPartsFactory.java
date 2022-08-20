package com.example._01_creational_patterns._03_abstract_factory.java._02_after;

import com.example._01_creational_patterns._03_abstract_factory.java._01_before.WhiteAnchor;
import com.example._01_creational_patterns._03_abstract_factory.java._01_before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
