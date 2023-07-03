package org.example.lesson3.classwork.ex302;
//2)Практика перечислений:
// Создать перечисление фруктов, сравнить их значение в switch case с различным выводом по каждому типу.
public class Main {
    public static void main(String[] args) {
        Fructs fruct = Fructs.valueOf("BANAN");
        System.out.println("fruct = " + fruct);
        switch (fruct){
            case APPLE, BANAN, ORANGE -> System.out.println("Этот фрукт - " + fruct.name);
            default -> System.out.println("Неопознанный фрукт");
        }
       /* for (Fructs value : Fructs.values()) {
            System.out.println(value);
        }*/
    }
}
