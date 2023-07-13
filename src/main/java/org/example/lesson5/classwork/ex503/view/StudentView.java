package org.example.lesson5.classwork.ex503.view;

import org.example.lesson5.classwork.ex503.controller.Controller;
import org.example.lesson5.classwork.ex503.data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentView {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student("Ivan Petrov", LocalDate.now(), i);
            students.add(student);
        }
//        System.out.println("students = " + students);
        Controller controller = new Controller();
        controller.send(students);
        System.out.println("controller.show() = \n" + controller.show());
    }
}
