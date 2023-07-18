package org.example.lesson7.finalWork;

import org.example.lesson7.finalWork.services.DataProcessor;

public class Controller {
    DataProcessor dataProcessor = new DataProcessor();

    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        return dataProcessor.addition(a, b);
    }

    public ComplexNumber sub(ComplexNumber a, ComplexNumber b){
        return dataProcessor.division(a, b);
    }
}
