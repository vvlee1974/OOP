package org.example.lesson2.homework;


public class Obstacles implements ObstacleCourse{
    private String name;
    private static int height = 3;
    private static int length = 750;


    public Obstacles(String name) {
        this.name = name;
    }

    public static int getHeight() {
        return height;
    }

    public static int getLength() {
        return length;
    }


    @Override
    public void start() {
        System.out.println("Старт этапа.");
    }

    @Override
    public void stop() {
        System.out.println("Финиш этапа.");
    }


}
