package org.example.lesson2.homework;

public class Treadmill  extends Obstacles{
    //private static int length = 750;

    public Treadmill(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("    Старт этапа - " + super.getName());
    }

    @Override
    public void stop() {
        System.out.println("    Финиш этапа - " + super.getName());
    }
}
