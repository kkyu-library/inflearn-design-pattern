package com.example._03_behavioral_patterns._17_mediator.java._01_before;

public class Gym {

    private CleaningService cleaningService;

    public void clean() {
        cleaningService.clean(this);
    }
}
