package org.example.lesson2.claasswork.ex202;

public class DomesticCat extends Cat {
    static int count;

    public DomesticCat(String name, int runDistance) {

        super(name, runDistance);
        count++;

    }
}
