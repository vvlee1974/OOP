package org.example.lesson2.homework;


public class Main {
    public static void main(String[] args) {
        Players[] players = {new Human("Василий Пупкин", 500, 2),
                new Cats("Барсик", 1500, 4)
        };
        Obstacles[] obstacles = {new Treadmill("Беговая дорожка", 450),
                new Wall("Стена", 3)
        };

        for (Obstacles obstacle : obstacles) {
            obstacle.start();
            for (Players player : players) {
                if (obstacle.getName().equals("Стена")) {
                    player.jump(obstacle.getSize());
                } else {
                    player.run(obstacle.getSize());
                }
            }
            obstacle.stop();
            System.out.println("----------------------------------");
        }
    }
}