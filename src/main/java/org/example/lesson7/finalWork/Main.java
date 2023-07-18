package org.example.lesson7.finalWork;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5.0,4.0);
        ComplexNumber b = new ComplexNumber(8.0, 5.0);

        Controller controller = new Controller();
        System.out.println("controller.sum(a, b) = " + controller.sum(a, b));
        System.out.println("controller.sub(a, b) = " + controller.sub(a, b));
    }
}
