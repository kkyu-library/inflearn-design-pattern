package com.example._01_creational_patterns._03_abstract_factory.java._02_after;

import com.example._01_creational_patterns._02_factory_method.java._02_after.Ship;
import com.example._01_creational_patterns._02_factory_method.java._02_after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory1 = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship1 = shipFactory1.createShip();
        System.out.println(ship1.getAnchor().getClass());
        System.out.println(ship1.getWheel().getClass());

        ShipFactory shipFactory2 = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship2 = shipFactory2.createShip();
        System.out.println(ship2.getAnchor().getClass());
        System.out.println(ship2.getWheel().getClass());
    }
}
