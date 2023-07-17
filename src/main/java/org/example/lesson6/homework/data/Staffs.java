package org.example.lesson6.homework.data;

/* (единственная ответственность -> Single Responsibility Principle)
* класс хранит только информацию о сотруднике организации
*/

import org.example.lesson6.homework.department.Department;

public class Staffs  {
     String name;
     int staffID;
     Department department;
     String post;
     double salary;


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
