package com.example._03_behavioral_patterns._14_command.java._02_after;

import com.example._03_behavioral_patterns._14_command.java._01_before.Game;

public class GameEndCommand implements Command {

    private final Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }
}
