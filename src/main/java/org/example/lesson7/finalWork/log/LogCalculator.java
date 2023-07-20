package org.example.lesson7.finalWork.log;

import org.example.lesson7.finalWork.calculator.Calculable;
import org.example.lesson7.finalWork.complexNum.ComplexNumber;

public class LogCalculator implements Calculable {
    private Calculable decorated;
    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        logger.log("Вызов метода sum: " + "(" + a + ")" + " + " + "(" + b + ")");
        System.out.println("----------------------------------------------------------------");
        return decorated.sum(a, b);
    }

    @Override
    public ComplexNumber sub(ComplexNumber a, ComplexNumber b) {
        logger.log("Вызов метода sub: " + "(" + a + ")" + " - " + "(" + b + ")");
        System.out.println("----------------------------------------------------------------");
        return decorated.sub(a, b);
    }

    @Override
    public ComplexNumber multi(ComplexNumber a, ComplexNumber b) {
        logger.log("Вызов метода multi: " + "(" + a + ")" + " * " + "(" + b + ")");
        System.out.println("----------------------------------------------------------------");
        return decorated.multi(a, b);
    }

    @Override
    public ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        logger.log("Вызов метода div: " + "(" + a + ")" + " / " + "(" + b + ")");
        System.out.println("----------------------------------------------------------------");
        return decorated.div(a, b);
    }
}
