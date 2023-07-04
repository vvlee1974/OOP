package org.example.lesson2.homework;

public class Treadmill implements Obstacle{
    private String name;
    private int length;

    public Treadmill(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public Treadmill() {
    }

    @Override
    public void begin() {
        System.out.println('"' + name + '"'+ ", " + length + " м" + ":");
        System.out.println("--------------------------");
    }

    @Override
    public void end() {
        System.out.println();
    }

    public int getLength() {
        return length;
    }
}
