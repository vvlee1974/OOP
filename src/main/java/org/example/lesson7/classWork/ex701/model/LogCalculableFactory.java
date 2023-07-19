package org.example.lesson7.classWork.ex701.model;

import org.example.lesson7.classWork.ex701.controller.Calculable;
import org.example.lesson7.classWork.ex701.controller.Calculator;
import org.example.lesson7.classWork.ex701.controller.LogCalculator;

public class LogCalculableFactory implements ICalculableFactory {
    private final Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
