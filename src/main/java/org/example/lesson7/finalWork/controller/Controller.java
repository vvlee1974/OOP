package org.example.lesson7.finalWork.controller;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;
import org.example.lesson7.finalWork.services.DataProcessor;

public class Controller {
    private final DataProcessor dataProcessor = new DataProcessor();

    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        return (ComplexNumber) dataProcessor.addition(a, b);
    }

    public ComplexNumber sub(ComplexNumber a, ComplexNumber b) {
        return (ComplexNumber) dataProcessor.subtraction(a, b);
    }

    public ComplexNumber mul(ComplexNumber a, ComplexNumber b) {
        return (ComplexNumber) dataProcessor.multiplication(a, b);
    }

    public ComplexNumber div(ComplexNumber a, ComplexNumber b) {
        return (ComplexNumber) dataProcessor.division(a, b);
    }
}
