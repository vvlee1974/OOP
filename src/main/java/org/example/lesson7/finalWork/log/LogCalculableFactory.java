package org.example.lesson7.finalWork.log;

import org.example.lesson7.finalWork.calculator.Calculable;
import org.example.lesson7.finalWork.calculator.Calculator;
import org.example.lesson7.finalWork.calculator.ICalculableFactory;
import org.example.lesson7.finalWork.complexNum.ComplexNumber;

public class LogCalculableFactory implements ICalculableFactory {
    private final Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(ComplexNumber a, ComplexNumber b) {
        return new LogCalculator(new Calculator(a, b), logger);
    }
}
