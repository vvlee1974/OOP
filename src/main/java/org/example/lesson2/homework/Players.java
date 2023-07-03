package org.example.lesson2.homework;


public abstract class Players {
     String name;

    public Players(String name) {
        this.name = name;
    }

    public void playerInfo() {
        System.out.println("Участник: " + name + " готов!");
    }

    public abstract void run(int size);

    public abstract void jump(int size);
}
