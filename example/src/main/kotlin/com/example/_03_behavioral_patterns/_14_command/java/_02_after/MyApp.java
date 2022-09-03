package com.example._03_behavioral_patterns._14_command.java._02_after;

import com.example._03_behavioral_patterns._14_command.java._01_before.Game;

public class MyApp {

    private final Command command;

    public MyApp(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new GameStartCommand(new Game()));
    }
}
