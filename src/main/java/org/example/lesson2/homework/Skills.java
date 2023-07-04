package org.example.lesson2.homework;

public interface Skills {
    boolean jump(int limit);
    boolean run(int limit);

    void start(Obstacle obstacle);
    void stop(Obstacle obstacle);
}