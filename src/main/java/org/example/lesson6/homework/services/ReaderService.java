package org.example.lesson6.homework.services;

// todo: (Принцип инверсии зависимостей -> Dependency Inversion Principle)
//  различные модули должны быть автономными и соединялись друг с другом с помощью абстракции
//  выводит все записи о сотрудниках

public interface ReaderService {
    void readerBaseFile();
}
