package org.example.lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {
    private String name = "Быки и коровы. На русском.";

    public RuGame(String name) {
        this.name = name;
    }

    public RuGame() {
    }

    public String getName() {
        return name;
    }

    @Override
    public List<String> generateCharList() {
        List<String> strList = new ArrayList<>();
        for (int i = 'а'; i <= 'я'; i++) {
            strList.add(Character.toString(i));
        }
        return strList;
    }
}