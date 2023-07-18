package org.example.lesson7.finalWork;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;
import org.example.lesson7.finalWork.controller.Controller;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(7.0, -4.0);
        ComplexNumber b = new ComplexNumber(3.0, 2.0);

        Controller controller = new Controller();
        System.out.println("controller.sum(a + b) = " + controller.sum(a, b));
        System.out.println("controller.sub(a - b) = " + controller.sub(a, b));
        System.out.println("controller.mul(a * b) = " + controller.mul(a, b));
        System.out.println("controller.div(a / b) = " + controller.div(a, b));
    }
}
