package org.example.lesson3.classwork.ex303;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringList.add(Integer.toString(i));
        } return stringList;
    }
}

