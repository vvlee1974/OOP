package org.example.lesson4.homework;

public class Calc<N extends Number> {
    N a;
    N b;

    public Calc() {
    }

    public Calc(N a, N b) {
        this.a = a;
        this.b = b;
    }

    public Calc(N a) {
        this.a = a;
    }

    /**
     * @return сложение двух чисел
     */
    public double addition() {
        return a.doubleValue() + b.doubleValue();
    }


    /**
     * @return умножение двух чисел
     */
    public double multiplication() {
        return a.doubleValue() * b.doubleValue();
    }

    /**
     * @return деление двух чисел
     */
    public double division() {
        return a.doubleValue() / b.doubleValue();
    }

    public String toBinaryInt(N a) {
        this.a = a;
        return Integer.toBinaryString((int) a);


    }

    public String toBinaryDoubleFloat(double d, int c) {

        long wholePart = (long) d;
        return wholeToBinary(wholePart) + '.' + fractionalToBinary(d - wholePart, c);
    }

    private String wholeToBinary(long l) {
        return Long.toBinaryString(l);
    }

    private String fractionalToBinary(double num, int precision) {
        StringBuilder binary = new StringBuilder();
        while (num > 0 && binary.length() < precision) {
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }
}
