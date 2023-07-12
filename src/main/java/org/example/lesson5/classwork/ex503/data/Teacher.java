package org.example.lesson5.classwork.ex503.data;

import java.time.LocalDate;

public class Teacher extends User{
    int teacherID;

    public Teacher(String name, LocalDate birthDate, int teacherID) {
        super(name, birthDate);
        this.teacherID = teacherID;
    }


}
