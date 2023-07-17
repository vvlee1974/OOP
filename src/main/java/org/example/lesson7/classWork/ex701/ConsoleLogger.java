package org.example.lesson7.classWork.ex701;

public class ConsoleLogger implements Loggable{
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
