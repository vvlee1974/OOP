package org.example.lesson7.classWork.ex701.controller;

import org.example.lesson7.classWork.ex701.model.Loggable;

public class LogCalculator implements Calculable {

    private final Calculable decorated;
    private final Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }


    @Override
    public Calculable sum(int arg) {
        logger.log("Вызов метода sum с параметром = " + arg);
        return decorated.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("Вызов метода multi с параметром = " + arg);
        return decorated.multi(arg);
    }

    @Override
    public int getResult() {
        logger.log("Результирующий ЛОГ ");
        return decorated.getResult();
    }
}
