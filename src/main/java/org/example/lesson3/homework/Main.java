package org.example.lesson3.homework;

import java.util.Scanner;

public class Main {
    // todo: реализовать рестарт игры
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Введите пользователя: ");
        String userLogin = scanner.nextLine();
        System.out.println("-------------------------------------");

        System.out.println("1 - Быки и коровы. Числа.");
        System.out.println("2 - Быки и коровы. На русском.");
        System.out.println("3 - Bulls and cows.");
        System.out.println("-------------------------------------");
        System.out.println("Выбор варианта игры.");
        int choiceGame = scanner.nextInt();

        AbstractGame game = getChoiceNewGame(choiceGame);

        if (game != null) {
            System.out.println("=====================================");
            System.out.println("Игра - " + game.getName());
            System.out.println("-------------------------------------");
        } else {
            System.out.println("Неправильный ввод. Сделай правильный выбор.");
            scanner.nextLine();
        }

        System.out.println("Игрок: " + userLogin);
        System.out.println("Введите длину слова:");
        int wordLength = scanner.nextInt();
        System.out.println("Введите количество попыток:");
        int tryCount = scanner.nextInt();

        scanner.nextLine();

        System.out.println("-------------------------------------");
        System.out.println("Поехали!");
        System.out.println("Количество попыток: " + tryCount);

        assert game != null;
        gamePlay(scanner, userLogin, game, tryCount, wordLength);

    }

    /**
     * @param scanner    ввод данных
     * @param userLogin  пользователь
     * @param game       вариант игры
     * @param tryCount   количество попыток
     * @param wordLength количество символов
     */
    private static void gamePlay(Scanner scanner, String userLogin, AbstractGame game, int tryCount, int wordLength) {
        int t = tryCount;

        assert game != null;
        String word = game.start(wordLength, tryCount);

        char[] chars = word.toCharArray();
        //System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        System.out.println("=====================================");

        boolean isFinish = false;
        boolean isWin = false;
        int count = 0;
        while (!(isFinish || isWin)) {
            System.out.println("Игрок: " + userLogin);
            Answer answer = game.inputValue(scanner.nextLine());
            if (answer != null) {
                tryCount--;
                System.out.println("Результат: " + answer);
                System.out.println("Осталось попыток: " + tryCount);
                System.out.println("-------------------------------------");
                count += 1;
            }
            isFinish = (game.getGameStatus() == GameStatus.FINISH) || tryCount == 0;
            isWin = (game.getGameStatus() == GameStatus.WIN);
        }

        if (isWin) {
            System.out.println("Игрок: " + userLogin);
            System.out.println("Вы победили!");
            System.out.println("Задуманное слово: " + word);
            System.out.println("-------------------------------------");
            System.out.println("Использовано попыток " + count + " из " + t);
        } else {
            System.out.println("Игрок: " + userLogin);
            System.out.println("Вы проиграли...");
            System.out.println("Задуманное слово: " + word);
        }
        System.out.println("=====================================");
    }

    /**
     * @param choiceGame входящее число для выбора варианта игры
     * @return вариант игры
     */
    private static AbstractGame getChoiceNewGame(int choiceGame) {
        if (choiceGame > 0 && choiceGame <= 3) {
            switch (choiceGame) {
                case 1 -> {
                    return new NumberGame();
                }
                case 2 -> {
                    return new RuGame();
                }
                case 3 -> {
                    return new EngGame();
                }
                default -> System.out.println("???");
            }
        }
        return null;
    }
}