package org.example.lesson5.classwork.ex503.service;

import org.example.lesson5.classwork.ex503.data.Student;

import java.util.List;

public interface DataService {
    void create(List<Student> students);

    List<Student> read();
}
