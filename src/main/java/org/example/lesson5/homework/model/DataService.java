package org.example.lesson5.homework.model;

import org.example.lesson5.homework.data.Staff;

import java.util.List;

public interface DataService {
    void create(Staff staff);

    List<Staff> read();
}