package org.example.lesson3.homework;

public interface Game {
    String start (int wordLength, int attempts);

    String startEngGame (int wordLength, int tryCount);

    String startRuGame(int wordLength, int tryCount);

    Answer inputValue (String input);

    GameStatus getGameStatus ();
}

