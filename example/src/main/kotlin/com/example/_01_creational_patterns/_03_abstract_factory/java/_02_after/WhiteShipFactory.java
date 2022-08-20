package com.example._01_creational_patterns._03_abstract_factory.java._02_after;

import com.example._01_creational_patterns._02_factory_method.java._02_after.Ship;
import com.example._01_creational_patterns._02_factory_method.java._02_after.ShipFactory;
import com.example._01_creational_patterns._02_factory_method.java._02_after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
