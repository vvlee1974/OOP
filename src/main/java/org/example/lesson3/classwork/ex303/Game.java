package org.example.lesson3.classwork.ex303;

public interface Game {
    void start(int lengthWord, int countTry);
    Answer inputValue(String input);
    GameStatus getGameStatus();
}
