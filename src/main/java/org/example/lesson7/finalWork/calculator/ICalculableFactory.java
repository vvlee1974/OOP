package org.example.lesson7.finalWork.calculator;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;

public interface ICalculableFactory {
    Calculable create(ComplexNumber a, ComplexNumber b);
}
