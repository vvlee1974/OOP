package org.example.lesson6.homework.department;

import org.example.lesson6.homework.department.AllDepartments;

public class Department implements AllDepartments {
    String nameDepartment;

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public Department() {
    }

    @Override
    public String toDepartment() {
        return nameDepartment;
    }

    @Override
    public String toString() {
        return nameDepartment;
    }
}
