package org.example.lesson5.classwork.ex503.service;

import org.example.lesson5.classwork.ex503.data.Student;

import java.util.List;

public class UserService implements DataService{
    List<Student> studentList;

    @Override
    public void create(List<Student> studentList) {
       this.studentList = studentList;
    }

    @Override
    public List<Student> read(List<Student> studentList) {
      return studentList;
    }
}
