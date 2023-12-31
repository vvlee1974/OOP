package org.example.lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame {
    private String name = "Быки и коровы. Числа.";

    public NumberGame(String name) {
        this.name = name;
    }

    public NumberGame() {
    }

    public String getName() {
        return name;
    }

    @Override
    public List<String> generateCharList() {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strList.add(Integer.toString(i));
        }
        return strList;
    }
}
