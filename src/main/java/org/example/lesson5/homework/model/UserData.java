package org.example.lesson5.homework.model;

import org.example.lesson5.homework.data.Staff;

import java.util.ArrayList;
import java.util.List;

public class UserData implements DataService {
    List<Staff> staffBaseList = new ArrayList<>();

    public List<Staff> getStaffBaseList() {
        return staffBaseList;
    }

    @Override
    public void create(Staff staff) {
        staffBaseList.add(staff);
    }

    @Override
    public List<Staff> read() {
        return staffBaseList;
    }

}