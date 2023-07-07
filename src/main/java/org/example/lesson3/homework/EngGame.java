package org.example.lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class EngGame extends AbstractGame{
    private String name = "Bulls and cows. English";

    public EngGame(String name) {
        this.name = name;
    }

    public EngGame() {
    }

    public String getName() {
        return name;
    }

    @Override
    public List<String> generateCharList() {
        List<String> strList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            strList.add(Character.toString(i));
        }
        return strList;
    }
}
