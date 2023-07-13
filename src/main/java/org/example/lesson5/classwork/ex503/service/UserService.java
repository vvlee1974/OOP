package org.example.lesson5.classwork.ex503.service;

import org.example.lesson5.classwork.ex503.data.Student;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    List<Student> studentList = new ArrayList<>();

    @Override
    public void create(List<Student> studentList) {
       this.studentList.addAll(studentList);
    }

    @Override
    public List<Student> read() {
      return studentList;
    }
}
