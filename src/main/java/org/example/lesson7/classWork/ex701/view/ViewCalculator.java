package org.example.lesson7.classWork.ex701.view;

import org.example.lesson7.classWork.ex701.controller.Calculable;
import org.example.lesson7.classWork.ex701.model.ICalculableFactory;

import java.util.Scanner;

public class ViewCalculator {
    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory)  {
        this.calculableFactory = calculableFactory;
    }

    public ViewCalculator() {
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
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
