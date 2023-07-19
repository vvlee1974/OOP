package org.example.lesson7.finalWork;

import org.example.lesson7.finalWork.controller.Controller;
import org.example.lesson7.finalWork.view.ViewCalc;

public class Main {
    public static void main(String[] args) {
//        ComplexNumber a = new ComplexNumber(7.0, -4.0);
//        ComplexNumber b = new ComplexNumber(3.0, 2.0);
        Controller controller = new Controller();
        ViewCalc view = new ViewCalc(controller);
        view.run();
    }
}
