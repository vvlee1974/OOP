package org.example.lesson7.finalWork.services;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;

public class DataProcessor implements Addition, Subtraction, Multiplication, Division {

    @Override
    public ComplexNumber addition(ComplexNumber a, ComplexNumber b) {
        Double real = a.getRealPart() + b.getRealPart();
        Double image = a.getImaginaryPart() + b.getImaginaryPart();
        return new ComplexNumber(real, image);
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber a, ComplexNumber b) {
        Double real = a.getRealPart() - b.getRealPart();
        Double image = a.getImaginaryPart() - b.getImaginaryPart();
        return new ComplexNumber(real, image);
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber a, ComplexNumber b) {
        Double real = (a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart());
        Double image = (a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart());
        return new ComplexNumber(real, image);
    }

    @Override
    public ComplexNumber division(ComplexNumber a, ComplexNumber b) {
        if ((Math.pow(b.getRealPart(), 2) + Math.pow(b.getImaginaryPart(), 2)) != 0) {
            Double real = (a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart()) /
                    (Math.pow(b.getRealPart(), 2) + Math.pow(b.getImaginaryPart(), 2));
            Double image = (a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart()) /
                    (Math.pow(b.getRealPart(), 2) + Math.pow(b.getImaginaryPart(), 2));
            return new ComplexNumber(real, image);
        }else{
            System.out.println("Делить на ноль нельзя! \nПроверьте данные делителя!");
            System.exit(0);
        }
        return a;
    }
}
