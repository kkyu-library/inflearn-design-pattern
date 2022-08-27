package com.example._02_structural_patterns._08_composite.java._01_before;

public class Item {

    private final String name;

    private final int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }
}
