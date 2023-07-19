package org.example.lesson7.classWork.ex701.model;

import org.example.lesson7.classWork.ex701.controller.Calculable;
import org.example.lesson7.classWork.ex701.controller.Calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
