package org.example.lesson5.homework.data;
import java.time.LocalDate;

public class Staff {
    LocalDate birthDate;
    String name;
    int staffID;
    String department;
    String post;
    double salary;

    public Staff(String name, LocalDate birthDate, int staffID, String department, String post, double salary) {
        this.birthDate = birthDate;
        this.name = name;
        this.staffID = staffID;
        this.department = department;
        this.post = post;
        this.salary = salary;
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
