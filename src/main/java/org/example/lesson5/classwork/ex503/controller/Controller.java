package org.example.lesson5.classwork.ex503.controller;

import org.example.lesson5.classwork.ex503.data.Student;
import org.example.lesson5.classwork.ex503.service.UserService;

import java.util.List;

public class Controller {
    UserService userService = new UserService();

    public void send(List<Student> students) {
        userService.create(students);
    }

    public List<Student> show() {
        return userService.read();
    }
}
