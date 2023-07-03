package org.example.lesson2.homework;


public abstract class Players {
     String name;

    public Players(String name) {
        this.name = name;
    }

    public Players() {
    }

    public void playerInfo() {
        System.out.println("Участник: " + name + " готов!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void run(int size);

    public abstract void jump(int size);
}
