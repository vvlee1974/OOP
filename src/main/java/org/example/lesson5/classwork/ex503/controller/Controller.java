package org.example.lesson5.classwork.ex503.controller;

import org.example.lesson5.classwork.ex503.data.Student;
import org.example.lesson5.classwork.ex503.service.UserService;

import java.util.List;

public class Controller {
    public void send(List<Student> students) {
        UserService userService = new UserService();
        userService.create(students);
    }

    public List<Student> show(List<Student> students){
        UserService userService = new UserService();
        return userService.read( students);
    }
}
