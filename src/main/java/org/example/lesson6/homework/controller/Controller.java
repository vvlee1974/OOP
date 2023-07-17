package org.example.lesson6.homework.controller;

import org.example.lesson6.homework.data.Staffs;
import org.example.lesson6.homework.services.StaffData;

import java.util.List;

public class Controller {
    private StaffData staffData = new StaffData();

    public void send(Staffs staff) {
        staffData.create(staff);
    }

    public List<Staffs> show() {
        return staffData.read();
    }

    public void recBase() {
        staffData.recBaseFile();
    }

    public void readerBase() {
        staffData.readerBaseFile();
    }
}
