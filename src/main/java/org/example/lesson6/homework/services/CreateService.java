package org.example.lesson6.homework.services;


import org.example.lesson6.homework.data.Staffs;

import java.util.List;

// todo: (Принцип разделения интерфейса -> Interface Segregation Principle)
//  предварительные создание и просмотр новой записи о сотруднике

public interface CreateService {
    void create(Staffs staff);

    List<Staffs> read();
}
