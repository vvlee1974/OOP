package org.example.lesson2.claasswork.ex202;

public class Dog extends Animal {
    static int count;
    int runDistance;
    int swimDistance;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name);
        if (runDistance > 500) {
            this.runDistance = 500;
            System.out.println("Введенное значение больше максимального значения, установлено максимальное");
        } else this.runDistance = runDistance;
        if (swimDistance > 10) {
            this.swimDistance = 10;
            System.out.println("Введенное значение больше максимального значения, установлено максимальное");
        } else this.swimDistance = swimDistance;
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
        if (distance > swimDistance) {
            System.out.println(super.name + " Не сможет проплыть");
        } else {
            System.out.println(super.name + " Проплыл");
        }
    }
}



