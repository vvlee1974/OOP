package org.example.lesson5.classwork.ex503.data;

import java.time.LocalDate;

public class Student extends User{
    int studentID;

    public Student(String name, LocalDate birthDate, int studentID) {
        super(name, birthDate);
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                "}\n" ;
    }
}
