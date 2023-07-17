package org.example.lesson7.classWork.ex702;

// Наблюдатель, он будет получать уведомления
// В данном случае это человек, ищущий работу, получает уведомления от рекрутинговского агентства

public interface Observer {
    void receiveOffer(String nameCompany, int salary);
}
