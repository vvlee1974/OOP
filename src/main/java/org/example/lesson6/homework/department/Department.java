package org.example.lesson6.homework.department;

public class Department implements AllDepartments {
    private String nameDepartment;

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
