package org.example.lesson6.homework.data;

// todo: (единственная ответственность -> Single Responsibility Principle)
//  класс хранит  информацию, относящуюся только к сотруднику организации


import org.example.lesson6.homework.department.Department;

public class Staffs {
    private String name;
    private int staffID;
    private Department department;
    private String post;
    private double salary;


    public Staffs() {
    }

    public Staffs(String name, int staffID, Department department, String post, double salary) {
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
                ", ФИО: " + name +
                ", Отдел: " + department +
                ", Оклад: " + salary +
                ')';
    }
}
