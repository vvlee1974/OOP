package org.example.lesson3.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // todo: реализовать рестарт игры
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пользователя:");
        String user1 = scanner.nextLine();
        System.out.println("=====================================");
        System.out.println("Игра: БЫКИ и КОРОВЫ");
        System.out.println("=====================================");
        System.out.println("1 - Числа");
        System.out.println("2 - На русском");
        System.out.println("3 - English");
        System.out.println("-------------------------------------");
        System.out.println("Выбор игры: ");
        int choiceGame = scanner.nextInt();
        AbstractGame game = getChoiceGame(choiceGame);
        System.out.println("=====================================");
        if (game != null && (choiceGame > 0 && choiceGame <= 3)) {
            System.out.println("Игра: " + '"' + game.getName() + '"');
            System.out.println("Начинаем!");
            System.out.println("-------------------------------------");
            switch (choiceGame) {
                case 1 -> numberGame(game, scanner, user1);
                case 2 -> getRuGame(scanner, user1, game);
                case 3 -> getEngGame(scanner, user1, game);
                default -> System.out.println("???");
            }
        } else {
            System.out.println("Некорректный ввод. Повторите выбор игры");
        }
        scanner.close();
    }

    /**
     * @param scanner ввод данных
     * @param user1   пользователь
     * @param game    вариант игры на английском
     */
    private static void getEngGame(Scanner scanner, String user1, AbstractGame game) {
        System.out.println("Введите количество попыток:");
        int tryCount = scanner.nextInt();
        scanner.nextLine();
        int t = tryCount;
        System.out.println("-------------------------------------");
        System.out.println("Игрок: " + user1);
        System.out.println("Количество попыток: " + tryCount);
        String x = game.startEngGame(game.getWordLength(), tryCount);
        char[] chars = x.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Игрок: " + user1);
        boolean isFinish = false;
        boolean isWin = false;
        int count = 0;
        List<String> history = new ArrayList<>();
        while (!(isFinish || isWin)) {
            String input = scanner.nextLine();
            Answer answer = game.inputValue(input);
            if (answer != null) {
                tryCount--;
                System.out.println("Результат: " + answer);
                System.out.println("Осталось попыток: " + tryCount);
                System.out.println("-------------------------------------");
                System.out.println("Игрок: " + user1);
                count += 1;
                history.add(count + ") " + input + " = " + answer + "  \n");
            }
            isFinish = (game.getGameStatus() == GameStatus.FINISH) || tryCount == 0;
            isWin = (game.getGameStatus() == GameStatus.WIN);
        }
        if (isWin) {
            System.out.println("Вы победили!");
            System.out.println("Задуманное слово: " + x);
            System.out.println("-------------------------------------");
            System.out.println("Использовано попыток " + count + " из " + t);
            System.out.println("=====================================");
        } else {
            System.out.println("Вы проиграли...");
            System.out.println("Задуманное слово: " + x);
            System.out.println("=====================================");
            System.out.println("Посмотреть историю? Да(1)/Нет(2)");
            int a = scanner.nextInt();
            System.out.println("-------------------------------------");
            if (a == 1) {
                System.out.println("Задуманное число: " + x);
                System.out.println("-------------------------------------");
                for (String ans : history) {
                    System.out.println(ans);
                }
                System.out.println("-------------------------------------");
            } else {
                System.out.println("До встречи!");
            }
        }
    }

    /**
     * @param scanner ввод данных
     * @param user1   пользователь
     * @param game    вариант игры на русском
     */
    private static void getRuGame(Scanner scanner, String user1, AbstractGame game) {
        String x;
        System.out.println("Введите количество попыток:");
        int tryCount = scanner.nextInt();
        scanner.nextLine();
        int t = tryCount;
        System.out.println("-------------------------------------");
        System.out.println("Игрок: " + user1);
        System.out.println("Количество попыток: " + tryCount);
        x = game.startRuGame(game.getWordLength(), tryCount);
        char[] chars = x.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Игрок: " + user1);
        boolean isFinish = false;
        boolean isWin = false;
        int count = 0;
        List<String> history = new ArrayList<>();
        while (!(isFinish || isWin)) {
            String input = scanner.nextLine();
            Answer answer = game.inputValue(input);
            if (answer != null) {
                tryCount--;
                System.out.println("Результат: " + answer);
                System.out.println("Осталось попыток: " + tryCount);
                System.out.println("-------------------------------------");
                System.out.println("Игрок: " + user1);
                count += 1;
                history.add(count + ") " + input + " = " + answer + "  \n");
            }
            isFinish = (game.getGameStatus() == GameStatus.FINISH) || tryCount == 0;
            isWin = (game.getGameStatus() == GameStatus.WIN);
        }
        if (isWin) {
            System.out.println("Вы победили!");
            System.out.println("Задуманное слово: " + x);
            System.out.println("-------------------------------------");
            System.out.println("Использовано попыток " + count + " из " + t);
            System.out.println("=====================================");
        } else {
            System.out.println("Вы проиграли...");
            System.out.println("Задуманное слово: " + x);
            System.out.println("=====================================");
            System.out.println("Посмотреть историю? Да(1)/Нет(2)");
            int a = scanner.nextInt();
            System.out.println("-------------------------------------");
            if (a == 1) {
                System.out.println("Задуманное число: " + x);
                System.out.println("-------------------------------------");
                for (String ans : history) {
                    System.out.println(ans);
                }
                System.out.println("-------------------------------------");
            } else {
                System.out.println("До встречи!");
            }
        }
    }

    /**
     * @param choiceGame число для определения варианта игры
     * @return вариант игры
     */
    private static AbstractGame getChoiceGame(int choiceGame) {
        if (choiceGame <= 3 && choiceGame > 0) {
            AbstractGame game;
            switch (choiceGame) {
                case 1 -> {
                    game = new NumberGame();
                    return game;
                }
                case 2 -> {
                    game = new RuGame();
                    return game;
                }
                case 3 -> {
                    game = new EngGame();
                    return game;
                }
            }
        }
        return null;
    }

    /**
     * @param game    вариант игры числовой
     * @param scanner ввод данных для игры
     * @param user1   пользователь
     */
    private static void numberGame(AbstractGame game, Scanner scanner, String user1) {
        System.out.println("Задайте количество цифр:");
        int wordLength = scanner.nextInt();
        System.out.println("Введите количество попыток:");
        int tryCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-------------------------------------");
        System.out.println("Игрок: " + user1);
        System.out.println("Количество попыток: " + tryCount);
        int t = tryCount;
        String x;
        x = game.start(wordLength, tryCount);
        char[] chars = x.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Игрок: " + user1);
        boolean isFinish = false;
        boolean isWin = false;
        int count = 0;
        List<String> history = new ArrayList<>();
        while (!(isFinish || isWin)) {
            String input = scanner.nextLine();
            Answer answer = game.inputValue(input);
            if (answer != null) {
                tryCount--;
                System.out.println("Результат: " + answer);
                System.out.println("Осталось попыток: " + tryCount);
                System.out.println("-------------------------------------");
                System.out.println("Игрок: " + user1);
                count += 1;
                history.add(count + ") " + input + "  " + answer + "  \n");
            }
            isFinish = (game.getGameStatus() == GameStatus.FINISH) || tryCount == 0;
            isWin = (game.getGameStatus() == GameStatus.WIN);
        }
        if (isWin) {
            System.out.println("Вы победили!");
            System.out.println("Задуманное число: " + x);
            System.out.println("-------------------------------------");
            System.out.println("Использовано попыток " + count + " из " + t);
            System.out.println("=====================================");
        } else {
            System.out.println("Вы проиграли...");
            System.out.println("Задуманное число: " + x);
            System.out.println("=====================================");
            System.out.println("Посмотреть историю? Да(1)/Нет(2)");
            int a = scanner.nextInt();
            System.out.println("-------------------------------------");
            if (a == 1) {
                System.out.println("Задуманное число: " + x);
                System.out.println("-------------------------------------");
                for (String ans : history) {
                    System.out.println(ans);
                }
                System.out.println("-------------------------------------");
            } else {
                System.out.println("До встречи!");
            }
        }
    }
}