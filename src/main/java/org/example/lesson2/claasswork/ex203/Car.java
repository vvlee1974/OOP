package org.example.lesson2.claasswork.ex203;

public class Car implements Transport{
    @Override
    public void start() {
        System.out.println(" автомобиль поехал!");
    }

    @Override
    public void stop() {
        System.out.println(" автомобиль остановился!");

    }
}
