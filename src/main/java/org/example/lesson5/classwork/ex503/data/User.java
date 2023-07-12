package org.example.lesson5.classwork.ex503.data;

import java.time.LocalDate;
import java.util.Date;

public abstract class User {
    String name;
    LocalDate birthDate;

    public User(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}
