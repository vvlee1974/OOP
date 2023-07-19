package org.example.lesson7.classWork.ex701.model;

import org.example.lesson7.classWork.ex701.model.Loggable;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
