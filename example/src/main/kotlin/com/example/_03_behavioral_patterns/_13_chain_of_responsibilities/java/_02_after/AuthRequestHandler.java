package com.example._03_behavioral_patterns._13_chain_of_responsibilities.java._02_after;

import com.example._03_behavioral_patterns._13_chain_of_responsibilities.java._01_before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
