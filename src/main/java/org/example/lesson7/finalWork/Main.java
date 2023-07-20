package org.example.lesson7.finalWork;

import org.example.lesson7.finalWork.calculator.CalculableFactory;
import org.example.lesson7.finalWork.calculator.ICalculableFactory;
import org.example.lesson7.finalWork.log.ConsoleLogger;
import org.example.lesson7.finalWork.log.LogCalculableFactory;
import org.example.lesson7.finalWork.view.ViewCalc;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalc view = new ViewCalc(calculableFactory);
        view.run();
    }
}
