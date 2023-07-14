package org.example.lesson5.homework.data;

public class Staff {
    String name;
    int staffID;
    String department;
    String post;
    double salary;

    public Staff(String name, int staffID, String department, String post, double salary) {
        this.name = name;
        this.staffID = staffID;
        this.department = department;
        this.post = post;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return post + " (" +
                "# " + staffID +
                ", ФИО: " + this.name +
                ", Отдел: " + department +
                ", Оклад: " + salary +
                ')';
    }
}