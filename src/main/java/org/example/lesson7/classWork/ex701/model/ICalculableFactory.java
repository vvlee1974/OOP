package org.example.lesson7.classWork.ex701.model;

import org.example.lesson7.classWork.ex701.controller.Calculable;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}
