package org.example.lesson3.classwork.ex303;

public class Answer {
    private  int bulls;
    private int cows;

    @Override
    public String toString() {
        return "Answer{" +
                "bulls=" + bulls +
                ", cows=" + cows +
                '}';
    }

    public Answer(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
    }

    public Answer() {
    }

    public int getBulls() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls = bulls;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }
}
