package org.example.lesson2.claasswork.ex203;

public class Bicycle implements Transport {
    @Override
    public void start() {
        System.out.println(" велосипед поехал!");
    }

    @Override
    public void stop() {
        System.out.println(" велосипед остановился!");
    }
}
