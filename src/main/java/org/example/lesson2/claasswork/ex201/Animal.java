package org.example.lesson2.claasswork.ex201;

public abstract class Animal {

    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Имя животного : " + name);
    }

    public abstract void voice();

    public void jump() {
        System.out.println(" Прыжок ! ");
    }
}
