package com.example.andrei.spring1.game;

public class GameRunner {

    private MarioGame game;

    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }


    public void run() {
        System.out.println("Game is running " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
