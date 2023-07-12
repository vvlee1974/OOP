package org.example.lesson5.lecture5.ex001Calc;

public class Main {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
    }
}
