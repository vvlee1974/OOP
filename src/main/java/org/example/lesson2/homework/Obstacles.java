package org.example.lesson2.homework;

public class Obstacles implements ObstacleCourse {
    private String name;
    int size;

    public Obstacles(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public Obstacles(String name) {
        this.name = name;
    }

    public Obstacles() {
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void start() {
        System.out.println("Начало этапа - " + name);
    }

    @Override
    public void stop() {
        System.out.println("Конец этапа - " + name);
    }


}
