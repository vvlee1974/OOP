package org.example.lesson4.classwork.ex402;

//2)Создать коробку с числами(BoxWithNumber) и найти среднее значение(average) и сравнение средних(compareAverage).
public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Integer> box1 = new BoxWithNumber<>(15, 10, 9, 4, 5);
        System.out.println("box1.average() = " + box1.average());
        BoxWithNumber<Double> box2 = new BoxWithNumber<>(15.0, 10.0, 4.0, 9.0, 5.0);
        System.out.println("box2.average() = " + box2.average());
        System.out.println("box1.compareAverage(box2) = " + box1.compareAverage(box2));
    }
}
