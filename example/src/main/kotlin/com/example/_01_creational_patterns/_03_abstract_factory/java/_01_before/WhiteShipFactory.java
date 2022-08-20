package com.example._01_creational_patterns._03_abstract_factory.java._01_before;

import com.example._01_creational_patterns._02_factory_method.java._02_after.ShipFactory;
import com.example._01_creational_patterns._02_factory_method.java._02_after.Ship;
import com.example._01_creational_patterns._02_factory_method.java._02_after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
