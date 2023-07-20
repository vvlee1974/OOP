package org.example.lesson7.finalWork.view;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;
import org.example.lesson7.finalWork.calculator.Calculable;
import org.example.lesson7.finalWork.calculator.ICalculableFactory;

import java.util.Scanner;

public class ViewCalc {
    private ICalculableFactory calculableFactory;

    public ViewCalc(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
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
        if (choice > 0 && choice <= 4) {
            System.out.println(" z1 = a + bi");
            Double realA = (double) promptInt("Введите действительную часть 'a' первого аргумента 'z1': ");
            Double imageA = (double) promptInt("Введите мнимую часть 'b' первого аргумента 'z1': ");
            ComplexNumber a = new ComplexNumber(realA, imageA);
            System.out.println();
            System.out.println(" z2 = a + bi");
            Double realB = (double) promptInt("Введите действительную часть 'a' второго аргумента 'z2': ");
            Double imageB = (double) promptInt("Введите мнимую часть 'b' второго аргумента 'z2': ");
            ComplexNumber b = new ComplexNumber(realB, imageB);
            Calculable calculator = calculableFactory.create(a, b);
            System.out.println("----------------------------------------------------------------");
            switch (choice) {
                case 1 -> {
                    System.out.println("Сложение комплексных чисел");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(calculator.sum(a, b));
                    System.out.println("----------------------------------------------------------------");
                }
                case 2 -> {
                    System.out.println("Вычитание комплексных чисел");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println( calculator.sub(a, b));
                    System.out.println("----------------------------------------------------------------");
                }
                case 3 -> {
                    System.out.println("Умножение комплексных чисел");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println( calculator.multi(a, b));
                    System.out.println("----------------------------------------------------------------");
                }
                case 4 -> {
                    System.out.println("Деление комплексных чисел");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(calculator.div(a, b));
                    System.out.println("----------------------------------------------------------------");
                }
            }
        } else System.out.println("Некорректный ввод. Повторите выбор.");
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}