package org.example.lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // todo: ввод пользователя
    // todo: логирование пользовательских попыток
    // todo: реализовать рестарт игры
    // todo: реализовать английскую версию
    public static void main(String[] args) {
        AbstractGame game = new NumberGame();

        System.out.println(); // todo: comment Of The Year

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину слова:");
        int wordLength = scanner.nextInt();

        System.out.println("Введите количество попыток:");
        int tryCount = scanner.nextInt();
        int t = tryCount;
        scanner.nextLine();


        System.out.println("-------------------------------------");
        System.out.println("Начало игры!");
        System.out.println("Количество попыток: " + tryCount);

        String x = game.start(wordLength, tryCount);

        char[] chars = x.toCharArray();
        //System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        System.out.println("-------------------------------------");

        boolean isFinish = false;
        boolean isWin = false;
        int count = 0;
        while (!(isFinish || isWin)) {
            Answer answer = game.inputValue(scanner.nextLine());
            if (answer != null) {
                System.out.println("Результат: " + answer);
                tryCount--;
                System.out.println("Количество попыток: " + tryCount);
                System.out.println("-------------------------------------");
                count += 1;
            }
            isFinish = game.getGameStatus() == GameStatus.FINISH;
            isWin = game.getGameStatus() == GameStatus.WIN;
        }

        if (isWin) {
            System.out.println("Вы победили!");
            System.out.println("Задуманные символы = " + x);
                System.out.println("-------------------------------------");
            System.out.println("Использовано попыток " + count + " из " + t);
        } else {
            System.out.println("Вы проиграли...");
            System.out.println("Задуманные символы = " + x);
        }
    }
}