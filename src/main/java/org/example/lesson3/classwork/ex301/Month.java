package org.example.lesson3.classwork.ex301;

public enum Month {
    JAN, FEB, MAR, APR(4), MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
    private  int number;


    Month() {
    }

    private Month(int number) {
        this.number = number;
    }
}
