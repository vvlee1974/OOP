package org.example.lesson2.homework;

public class Main {
    public static void main(String[] args) {
        Obstacles[] obstacles = {new Treadmill("Беговая дорожка", 400),
                new Wall("Стена", 5), new Wall("Стена2", 10)
        };

        Players[] players = {new Human("Василий", 500, 2),
                new Human("Инокентий", 300, 1)
        };


        for (Players player : players) {
            player.playerInfo();
            System.out.println("-------------------------------");
            for (Obstacles obstacle : obstacles) {
                obstacle.start();
                if (obstacle.toString().equals("Беговая дорожка") ) {
                    player.run(obstacle.size);
                } else {
                    player.jump(obstacle.size);
                }
                obstacle.stop();
                System.out.println("-------------------------------");
            }
            System.out.println("=============================================");


        }
    }
}
