package org.example.lesson1.classWork.ex101;

public class Main101 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("barsik", "white", 21);
        System.out.println("Кот: " + cat1.name + ", " + cat1.color
                + " цвета , имеет возраст: " + cat1.age + " лет");
        Cat cat2 = new Cat("Murzik", "black", 3);
        System.out.println("Кот: " + cat2.name + ", "
                + cat2.color + " цвета , имеет возраст: " + cat2.age + " лет");
    }
}
