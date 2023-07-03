package org.example.lesson2.homework;

public class Wall extends Obstacles {
    private  int height;

    public Wall(String name, int size) {
        super(name, size);
        this.height = size;
    }

    public int getHeight() {
        return height;
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
