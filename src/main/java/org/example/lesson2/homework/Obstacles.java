package org.example.lesson2.homework;


public class Obstacles implements ObstacleCourse{
    private String name;
    private int size;
    //private static int height = 3;
    //private static int length = 750;


    public Obstacles(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
    //    public static int getHeight() {
//        return height;
//    }
//
//    public static int getLength() {
//        return length;
//    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }



}
