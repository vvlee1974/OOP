package org.example.lesson6.homework.services;


import org.example.lesson6.homework.data.Staffs;

import java.util.List;



public interface CreateService {
    void create(Staffs staff);

    List<Staffs> read();
}
