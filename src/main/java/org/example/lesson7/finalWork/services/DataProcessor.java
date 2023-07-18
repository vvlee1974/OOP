package org.example.lesson7.finalWork.services;

import org.example.lesson7.finalWork.ComplexNumber;

public class DataProcessor implements Addition, Subtraction, Multiplication, Division{

    @Override
    public ComplexNumber addition(ComplexNumber complexA, ComplexNumber complexB) {
        Double real = complexA.getRealPart() + complexB.getRealPart();
        Double image = complexA.getImaginaryPart() + complexB.getImaginaryPart();
        return new ComplexNumber(real, image);
    }

    @Override
    public ComplexNumber division(ComplexNumber complexA, ComplexNumber complexB) {
        Double real = complexA.getRealPart() - complexB.getRealPart();
        Double image = complexA.getImaginaryPart() - complexB.getImaginaryPart();
        return new ComplexNumber(real, image);
    }

    @Override
    public void multiplication(ComplexNumber complexA, ComplexNumber complexB) {

    }

    @Override
    public void subtraction(ComplexNumber complexA, ComplexNumber complexB) {

    }
}
