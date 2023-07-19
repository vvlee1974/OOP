package org.example.lesson7.classWork.ex701.controller;

public class Calculator implements Calculable {
    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}
