package com.example._03_behavioral_patterns._15_interpreter.java._02_after;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);
}
