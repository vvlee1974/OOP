package org.example.lesson5.homework.data;

import java.time.LocalDate;

public class Staff {
    private int staffID;
    private String name;
    private LocalDate birthDate;
    private String department;
    private String post;
    private double salary;

    public Staff(int staffID, String name, LocalDate birthDate, String department, String post, double salary) {
        this.staffID = staffID;
        this.name = name;
        this.birthDate = birthDate;
        this.department = department;
        this.post = post;
        this.salary = salary;
    }

    public Staff() {
    }

    @Override
    public String toString() {
        return "Сотрудник (" +
                "Табельный номер: " + staffID +
                ", ФИО: " + name +
                ", Отдел: " + department +
                ", Должность: " + post +
                ", Оклад: " + salary +
                ", Дата принятия: " + birthDate +
                ')';
    }
}
