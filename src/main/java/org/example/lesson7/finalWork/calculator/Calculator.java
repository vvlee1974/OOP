package org.example.lesson7.finalWork.calculator;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;

public class Calculator implements Calculable{
    private ComplexNumber a;
    private ComplexNumber b;


    public Calculator(ComplexNumber a, ComplexNumber b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {
    }

    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        Double real = a.getRealPart() + b.getRealPart();
        Double image = a.getImaginaryPart() + b.getImaginaryPart();
        return new ComplexNumber(real, image);
    }

    @Override
    public ComplexNumber sub(ComplexNumber a, ComplexNumber b) {
        Double real = a.getRealPart() - b.getRealPart();
        Double image = a.getImaginaryPart() - b.getImaginaryPart();
        return new ComplexNumber(real, image);
    }

    @Override
    public ComplexNumber multi(ComplexNumber a, ComplexNumber b) {
        Double real = (a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart());
        Double image = (a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart());
        return new ComplexNumber(real, image);
    }

    @Override
    public ComplexNumber div(ComplexNumber a, ComplexNumber b) {
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
