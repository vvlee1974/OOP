package org.example.lesson7.finalWork.view;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;
import org.example.lesson7.finalWork.controller.Controller;

import java.util.Scanner;

public class ViewCalc {
    private Controller controller;

    public ViewCalc(Controller controller) {
        this.controller = controller;
    }

    public ViewCalc() {
    }

    public void run() {
        System.out.println("================================");
        System.out.println("ДЕЙСТВИЯ С КОМПЛЕКСНЫМИ ЧИСЛАМИ");
        System.out.println("================================");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        System.out.println("----------------------------");
        int choice = promptInt("Выберете действие: ");
        System.out.println("----------------------------");


        System.out.println(" z1 = a + bi");
        Double realA = (double) promptInt("Введите  действительную часть 'a' первого аргумента 'z1': ");
        Double imageA = (double) promptInt("Введите  мнимую часть 'b' первого аргумента 'z1': ");
        ComplexNumber a = new ComplexNumber(realA, imageA);
        System.out.println();
        System.out.println(" z2 = a + bi");
        Double realB = (double) promptInt("Введите  действительную часть 'a' второго аргумента 'z2': ");
        Double imageB = (double) promptInt("Введите  мнимую часть 'b' второго аргумента 'z2': ");
        ComplexNumber b = new ComplexNumber(realB, imageB);
        System.out.println("----------------------------");

        if (choice > 0 && choice <= 4) {
            switch (choice) {
                case 1 -> {
                    System.out.println("Сложение комплексных чисел");
                    System.out.println("(a + bi) = " + controller.sum(a, b));
                    System.out.println("----------------------------");
                }
                case 2 -> {
                    System.out.println("Вычитание комплексных чисел");
                    System.out.println("(a - bi) = " + controller.sub(a, b));
                    System.out.println("----------------------------");
                }
                case 3 -> {
                    System.out.println("Умножение комплексных чисел");
                    System.out.println("(a * bi) = " + controller.mul(a, b));
                    System.out.println("----------------------------");
                }
                case 4 -> {
                    System.out.println("Деление комплексных чисел");
                    System.out.println("(a / bi) = " + controller.div(a, b));
                    System.out.println("----------------------------");
                }
            }
        } else System.out.println("Некорректный ввод. Повторите выбор.");
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}