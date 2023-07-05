package org.example.lesson3.homework;

public class Answer {
    private int bulls;
    private int cows;

    public Answer(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
    }

    public Answer() {
    }

    @Override
    public String toString() {
        return "быки: " + bulls + ", коровы: " + cows;
    }
}
