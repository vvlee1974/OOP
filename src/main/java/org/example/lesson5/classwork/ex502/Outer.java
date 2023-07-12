package org.example.lesson5.classwork.ex502;

public class Outer {
    public static void main(String[] args) {
        Game game = new Game() {
            @Override
            public void start() {
                System.out.println("игра началась");
            }
        };
        // если видит new Game() , то к Outer добавляется $ + порядковый номер
        // к Outer$1 implements Game
        // происходит овверайд методов интерфейса
        // Outer game = new Outer();
        AbstractGame abstractGame = new AbstractGame() {
            @Override
            public void info() {
                System.out.println("Информация об игре");
            }
        };
        abstractGame.info();

    }
}
