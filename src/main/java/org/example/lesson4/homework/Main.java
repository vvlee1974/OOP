package org.example.lesson4.homework;

public class Main {
    public static void main(String[] args) {

        Calc<Integer> calcSum1 = new Calc<>(15,4);
        Calc<Double> calcSum2 = new Calc<>(15.40, 5.35);
        Calc<Float> calcSum3 = new Calc<>(17.1f, 5.1f);
        Calc<Integer> calcProduct = new Calc<>(15, 5);

        Calc<Double> calcBinary1 = new Calc<>();
        Calc<Float> calcBinary2 = new Calc<>();
        Calc<Integer> calcBinary3 = new Calc<>(5);

        System.out.println("calcSumInt = " + calcSum1.addition());
        System.out.println("calcSumDouble = " + calcSum2.addition());
        System.out.println("calcSumFloat = " + calcSum3.addition());
        System.out.println();
        System.out.println("calcProduct = " + calcProduct.multiplication());
        System.out.println();
        System.out.println("calcBinary.toBinaryDouble(2.0) = " + calcBinary1.toBinaryDoubleFloat(2.0, 4));
        System.out.println();
        System.out.println("calcBinary.toBinaryFloat(3.4f) = " + calcBinary2.toBinaryDoubleFloat(3.4f, 4));
        System.out.println();
        System.out.println("calcBinary3.toBinaryInt(5) = " + calcBinary3.toBinaryInt());

    }
}
