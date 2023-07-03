package org.example.lesson2.claasswork.ex202;

public class Cat extends Animal {
    static int count;
    int runDistance;



    public Cat(String name, int runDistance) {
        super(name);
        if (runDistance > 200) {
            this.runDistance = 200;
            System.out.println("Введенное значение больше максимального значения, установлено максимальное");
        } else this.runDistance = runDistance;
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            System.out.println(super.name + " Не сможет пробежать");
        } else {
            System.out.println(super.name + " Пробежал");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(super.name + " Не умеет плавать");

    }
}