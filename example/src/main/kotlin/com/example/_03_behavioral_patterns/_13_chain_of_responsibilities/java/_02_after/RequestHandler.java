package com.example._03_behavioral_patterns._13_chain_of_responsibilities.java._02_after;

import com.example._03_behavioral_patterns._13_chain_of_responsibilities.java._01_before.Request;

public abstract class RequestHandler {

    private final RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
