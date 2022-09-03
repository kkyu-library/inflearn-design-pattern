package com.example._03_behavioral_patterns._14_command.java._02_after;

import com.example._03_behavioral_patterns._14_command.java._01_before.Light;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        new LightOffCommand(this.light).execute();
    }
}
