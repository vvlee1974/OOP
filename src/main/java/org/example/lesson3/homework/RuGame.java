package org.example.lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {

    @Override
    public String getName() {
        return "Быки и коровы. На русском.";
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