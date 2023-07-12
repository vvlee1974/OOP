package org.example.lesson5.classwork.ex501;

public class Outer2 {

    public Outer2(int outerValue) {
        this.outerValue = outerValue;
    }

    /**
     * Вложенный класс начало
     */
    static class Inner {
        int innerValue;

        public void innerMethod() {
            System.out.println(innerValue);
//            System.out.println(outerValue);
//            outerMethod();
//            innerMethod();
        }

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }
    }

    // todo конец вложенный класса
    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
//        System.out.println(innerValue);
//        outerMethod();
//        innerMethod();
    }

    public static void main(String[] args) {
        Inner inner = new Inner(3);// теперь можно создавать
        // тк он больше не внутренний и может существовать отдельно
        System.out.println("введи координату:");
        class Point{ // локальный класс
            int x;

            public Point(int x) {
                this.x = x;
            }

            @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        '}';
            }
        }
        Point point = new Point(3);
        System.out.println("point = " + point);
    }

}
