package org.example.lesson7.finalWork.calculator;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;

public interface Calculable {
    ComplexNumber sum(ComplexNumber a, ComplexNumber b);

    ComplexNumber sub(ComplexNumber a, ComplexNumber b);

    ComplexNumber multi(ComplexNumber a, ComplexNumber b);

    ComplexNumber div(ComplexNumber a, ComplexNumber b);
}
