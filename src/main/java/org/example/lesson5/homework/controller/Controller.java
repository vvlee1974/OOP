package org.example.lesson5.homework.controller;

import org.example.lesson5.homework.data.Staff;
import org.example.lesson5.homework.model.UserData;

import java.util.List;

public class Controller {
    UserData userData = new UserData();

    public void send(Staff staff) {
       userData.create(staff);
    }

    public List<Staff> show() {
        return userData.read();
    }
}
