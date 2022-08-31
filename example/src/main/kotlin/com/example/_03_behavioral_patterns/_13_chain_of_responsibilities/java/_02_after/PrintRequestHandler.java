package com.example._03_behavioral_patterns._13_chain_of_responsibilities.java._02_after;

import com.example._03_behavioral_patterns._13_chain_of_responsibilities.java._01_before.Request;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
