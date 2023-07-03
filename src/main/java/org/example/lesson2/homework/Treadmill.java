package org.example.lesson2.homework;

public class Treadmill  extends Obstacles{
    private  int length ;

    public Treadmill(String name, int size) {
        super(name, size);
        this.length = size;
    }

    public int getLength() {
        return length;
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
