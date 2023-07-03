package org.example.lesson2.homework;

public class Wall extends Obstacles {
    //private static int height = 3;

    public Wall(String name) {
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
