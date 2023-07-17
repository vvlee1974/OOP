package org.example.lesson7.classWork.ex703;

// Интерфейс дополнительного датчика 
interface SensorTemperature{
	int identifier(); // идентификатор датчика
	double temperature(); // температура датчика
	int year();			 // Год
	int day();			 // День года
	int second();		 // Секунда дня
}
	