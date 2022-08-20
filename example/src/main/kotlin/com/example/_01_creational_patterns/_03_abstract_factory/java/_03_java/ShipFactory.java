package com.example._01_creational_patterns._03_abstract_factory.java._03_java;

import com.example._01_creational_patterns._02_factory_method.java._02_after.Ship;
import com.example._01_creational_patterns._02_factory_method.java._02_after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() {
        Ship ship = new WhiteShip();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
