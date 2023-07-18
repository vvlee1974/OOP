package org.example.lesson7.finalWork;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;
import org.example.lesson7.finalWork.controller.Controller;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(7.0, -4.0);
        ComplexNumber b = new ComplexNumber(3.0, 2.0);

        Controller controller = new Controller();
        System.out.println("================================");
        System.out.println("ДЕЙСТВИЯ С КОМПЛЕКСНЫМИ ЧИСЛАМИ");
        System.out.println("================================");
        System.out.println();
        System.out.println("Сложение комплексных чисел");
        System.out.println("(a + b) = " + controller.sum(a, b));
        System.out.println("----------------------------");
        System.out.println("Вычитание комплексных чисел");
        System.out.println("(a - b) = " + controller.sub(a, b));
        System.out.println("----------------------------");
        System.out.println("Умножение комплексных чисел");
        System.out.println("(a * b) = " + controller.mul(a, b));
        System.out.println("----------------------------");
        System.out.println("Деление комплексных чисел");
        System.out.println("(a / b) = " + controller.div(a, b));
    }
}
