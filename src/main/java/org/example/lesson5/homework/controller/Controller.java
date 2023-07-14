package org.example.lesson5.homework.controller;

import org.example.lesson5.homework.data.Staff;
import org.example.lesson5.homework.model.UserData;

import java.util.List;

public class Controller {
    UserData userService = new UserData();

    public void send(Staff staff) {
        userService.create(staff);
    }

    public List<Staff> show() {
        return userService.read();
    }

    public void recBase() {
        userService.recBaseFile();
    }

    public void readerBase(){
        userService.readerBaseFile();
    }
}