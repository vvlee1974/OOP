package org.example.lesson4.classwork.ex403;

import java.util.ArrayList;
import java.util.List;

//3)	Написать класс калькулятор, принимающий List целочисленных значений,
// возвращающий сумму элементов коллекции (метод sum)
public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();
        List<Number> listNum = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            listInt.add(i);
            listDouble.add((double) i);
            listNum.add(i);
        }
        System.out.println("calculate.sum(listNum) = " + calculate.sum(listNum));
        System.out.println("calculate.sum(listInt) = " + calculate.sum(listInt));
        System.out.println("calculate.sum(listDouble) = " + calculate.sum(listDouble));
    }
}
