package com.example._03_behavioral_patterns._23_visitor.java._02_after;

public class Rectangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
