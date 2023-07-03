package org.example.lesson2.claasswork.ex201;

public class Dog extends Animal{
    private String color;
    private int age;

    public Dog() {

    }

    public Dog(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }


    @Override
    public void voice() {
        System.out.println(" гав ! гав!");
    }
}
