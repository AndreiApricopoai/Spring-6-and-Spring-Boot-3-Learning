package com.example.andrei.spring1;

import com.example.andrei.spring1.game.GameRunner;
import com.example.andrei.spring1.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        MarioGame marioGame = new MarioGame();
        GameRunner gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}
