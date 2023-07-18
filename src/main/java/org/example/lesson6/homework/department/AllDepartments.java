package org.example.lesson6.homework.department;

// todo: (открыт для расширения, но закрыт для изменения -> Open-Closed Principle)
//  должна быть возможность изменять внешнее поведение класса, не внося физические изменения в сам класс
//  интерфейс хранит информацию об отделах организации

public interface AllDepartments {

    String toDepartment();
}
