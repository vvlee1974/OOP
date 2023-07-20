package org.example.lesson7.finalWork.calculator;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(ComplexNumber a, ComplexNumber b) {
        return new Calculator(a, b);
    }
}
