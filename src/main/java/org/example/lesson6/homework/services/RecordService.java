package org.example.lesson6.homework.services;

// todo: (Принцип разделения интерфейса -> Interface Segregation Principle)
//  разбиение толстых интерфейсов на более мелкие, чтобы мелкие интерфейсы знали только о методах, необходимых в работе.
//  запись новой записи о сотруднике

public interface RecordService {
    void recBaseFile();
}
