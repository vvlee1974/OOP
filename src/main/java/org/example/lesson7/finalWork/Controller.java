package org.example.lesson7.finalWork;

import org.example.lesson7.finalWork.complexNum.ComplexNumber;
import org.example.lesson7.finalWork.services.DataProcessor;

public class Controller {
    DataProcessor dataProcessor = new DataProcessor();

    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        return dataProcessor.addition(a, b);
    }

    public ComplexNumber sub(ComplexNumber a, ComplexNumber b){
        return dataProcessor.subtraction(a, b);
    }
    public ComplexNumber mul(ComplexNumber a, ComplexNumber b){
        return dataProcessor.multiplication(a, b);
    }
public ComplexNumber div(ComplexNumber a, ComplexNumber b){
        return dataProcessor.division(a, b);
    }

}
