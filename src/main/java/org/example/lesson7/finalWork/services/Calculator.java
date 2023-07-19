package org.example.lesson7.finalWork.services;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;

public interface Calculator {
    ComplexNumber addition(ComplexNumber complexNumber, ComplexNumber complexB);
    ComplexNumber subtraction(ComplexNumber complexA, ComplexNumber complexB);
    ComplexNumber multiplication(ComplexNumber complexNumber, ComplexNumber complexB);
    ComplexNumber division(ComplexNumber complexNumber, ComplexNumber complexB);
}
