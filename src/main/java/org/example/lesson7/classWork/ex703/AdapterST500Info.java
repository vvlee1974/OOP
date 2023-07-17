package org.example.lesson7.classWork.ex703;

import java.time.LocalDateTime;

public class AdapterST500Info implements MeteoSensor{

    private SensorTemperature adaptea;

    public AdapterST500Info() {
        ;
    }

    public AdapterST500Info(SensorTemperature adaptea) {
        this.adaptea = adaptea;
    }

    @Override
    public int getId() {
        return adaptea.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adaptea.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(adaptea.year(), 1, 1, 0, 0, 0);
        dateTime.plusDays(adaptea.day());
        dateTime.plusSeconds(adaptea.second());
        return dateTime;
    }
}
