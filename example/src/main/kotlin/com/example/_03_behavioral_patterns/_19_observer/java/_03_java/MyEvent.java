package com.example._03_behavioral_patterns._19_observer.java._03_java;

public class MyEvent {

    private final String message;

    public MyEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
