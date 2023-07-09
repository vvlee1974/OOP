package org.example.lesson4.classwork.ex403;

import java.util.List;

public class Calculate {
//    (static T qwe;) - статические поля использовать нельзя, т.к. поле не может быть общим для объектов

    public double sum(List<? extends Number> numbers){ // (<? extends Number>) любой тип, наследуемый от Number
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
