package org.example.lesson4.classwork.ex402;

import lombok.Data;

@Data

public class BoxWithNumber<N extends Number> {
    N[] number;

    public BoxWithNumber(N... num) {
        this.number = num;
    }

    public double average() {
        double sum = 0.0;
        for (N n : number) {
            sum += n.doubleValue();
        }
        return sum / number.length;
    }


    public boolean compareAverage(BoxWithNumber<?> box2) {
        if (Math.abs(this.average() - box2.average()) < 0.00001) {
            return true;
        }
        return false;
    }
}
