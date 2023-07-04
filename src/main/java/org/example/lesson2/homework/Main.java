package org.example.lesson2.homework;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Skills> s = new ArrayList<>();
        s.add(0, new Human("Человек из офиса", 1100, 1));
        s.add(1, new Cat("Кот Барсик", 1500, 2));
        s.add(2, new Robot("Робот C-3PO", 10000, 1));

        List<Obstacle> o = new ArrayList<>();
        o.add(0, new Treadmill("Беговая дорожка", 1000));
        o.add(1, new Wall("Стена", 2));

        System.out.println("=================================");
        System.out.println("ПОЛОСА ПРЕПЯТСТВИЙ");
        System.out.println("СТАРТ!");
        System.out.println("=================================");
        for (Skills skills : s) {
            for (Obstacle obstacle : o) {
                if (obstacle instanceof Treadmill) {
                    skills.start(obstacle);
                    if (skills.run(((Treadmill) obstacle).getLength())) {
                        System.out.println("\t\t\t\tЭтап выполнен!");
                        skills.stop(obstacle);
                        continue;
                    } else {
                        System.out.println("Этап не выполнен...");
                        System.out.println("Выбыл из состязания!");
                        skills.stop(obstacle);
                        break;
                    }
                } else if (obstacle instanceof Wall) {
                    skills.start(obstacle);
                    if (skills.jump(((Wall) obstacle).getHeight())) {
                        System.out.println("\t\t\t\tЭтап выполнен!");
                        skills.stop(obstacle);
                        continue;
                    } else {
                        System.out.println("Этап не выполнен...");
                        System.out.println("Выбыл из состязания!");
                        skills.stop(obstacle);
                        break;
                    }
                }
                skills.stop(obstacle);
            }
            System.out.println("=================================");
        }
    }
}