package org.example.lesson7.classWork.ex701;

import org.example.lesson7.classWork.ex701.model.ConsoleLogger;
import org.example.lesson7.classWork.ex701.model.ICalculableFactory;
import org.example.lesson7.classWork.ex701.model.LogCalculableFactory;
import org.example.lesson7.classWork.ex701.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
