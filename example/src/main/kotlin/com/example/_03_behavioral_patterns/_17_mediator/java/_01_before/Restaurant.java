package com.example._03_behavioral_patterns._17_mediator.java._01_before;

public class Restaurant {

    private final CleaningService cleaningService = new CleaningService();

    public void dinner(Guest guest) {
        System.out.println("dinner " + guest);
    }

    public void clean() {
        cleaningService.clean(this);
    }
}
