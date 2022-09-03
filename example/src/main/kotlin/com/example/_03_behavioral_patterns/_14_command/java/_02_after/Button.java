package com.example._03_behavioral_patterns._14_command.java._02_after;

import com.example._03_behavioral_patterns._14_command.java._01_before.Game;
import com.example._03_behavioral_patterns._14_command.java._01_before.Light;

import java.util.Stack;

public class Button {

    private final Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}
