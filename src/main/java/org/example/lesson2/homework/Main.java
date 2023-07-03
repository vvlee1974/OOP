package org.example.lesson2.homework;

import static org.example.lesson2.homework.Obstacles.getHeight;
import static org.example.lesson2.homework.Obstacles.getLength;

public class Main {
    public static void main(String[] args) {
        Players[] players = {new Human("Василий Пупкин", 750, 2),
                new Cats("Барсик", 500, 4)
        };
        Obstacles[] obstacles = {new Treadmill("Беговая дорожка"),
                new Wall("Стена")
        };

        for (Obstacles obstacle : obstacles) {
            obstacle.start();
            for (Players player : players) {
//            player.playerInfo();
//            System.out.println("----------------------------------");
                if (obstacle.getName().equals("Стена")) {
                    player.jump(getHeight());
                } else {
                    player.run(getLength());
                }
            }
            obstacle.stop();
            System.out.println("----------------------------------");
        }
    }
}