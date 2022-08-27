package com.example._02_structural_patterns._08_composite.java._02_after;

public class Item implements Component {

    private final String name;

    private final int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }
}
