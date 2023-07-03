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

        //Wall wall = new Wall("Стена");

        // System.out.println("wall.getHeight() = " + wall.getHeight());

        for (Players player : players) {
            player.playerInfo();
            System.out.println("----------------------------------");
            for (Obstacles obstacle : obstacles) {

                player.jump(getHeight());
                player.run(getLength());
            }
        }
    }
}