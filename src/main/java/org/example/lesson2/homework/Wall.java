package org.example.lesson2.homework;

public class Wall implements Obstacle {

    private String name;
    private int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Wall() {
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void begin() {
        System.out.println('"' + name + '"'+ ", " + height + " м" + ":");
        System.out.println("-------------");
    }

    @Override
    public void end() {
        System.out.println();
    }
}