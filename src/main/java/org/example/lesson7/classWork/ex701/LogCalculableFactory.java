package org.example.lesson7.classWork.ex701;

public class LogCalculableFactory implements ICalculableFactory{
    private Loggable logger;


    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

}
