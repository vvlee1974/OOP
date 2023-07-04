package org.example.lesson3.homework;

public interface Game {
    String start (int wordLength, int attempts);

    Answer inputValue (String input);

    GameStatus getGameStatus ();
}
