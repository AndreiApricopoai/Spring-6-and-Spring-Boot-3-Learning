package com.example.andrei.spring1;

import game.*;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        // Aici se creeaza cele 3 jocuri obiecte.
        GamingConsole marioGame = new MarioGame();
        GamingConsole superContraGame = new SuperContraGame();
        GamingConsole pacmanGame = new PacmanGame();

        // Aici se creeaza gameRunner-ul si se apeleaza metoda run() a lui gameRunner.
        GameRunner gameRunner = new GameRunner(pacmanGame);
        gameRunner.run();

    }
}
