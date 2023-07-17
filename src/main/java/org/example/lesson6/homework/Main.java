package org.example.lesson6.homework;

import org.example.lesson6.homework.controller.Controller;
import org.example.lesson6.homework.data.Staffs;
import org.example.lesson6.homework.department.Department;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        System.out.println("===============================");
        System.out.println("\t\t ОТДЕЛ КАДРОВ");
        System.out.println("===============================");
        System.out.println("1 - Добавить нового сотрудника.");
        System.out.println("2 - Посмотреть всех сотрудников.");
        System.out.println("_______________________________");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice <= 2 && choice > 0) {
            switch (choice) {
                case 1 -> {
                    System.out.println("Введите табельный номер: ");
                    int staffID = scanner.nextInt();
                    System.out.println("Введите ФИО: ");
                    scanner.nextLine();
                    String staffName = scanner.nextLine();
                    System.out.println("Введите отдел: ");
                    Department department = new Department(scanner.nextLine());
                    System.out.println("Введите должность: ");
                    String post = scanner.nextLine();
                    System.out.println("Введите размер оклада: ");
                    double salary = scanner.nextDouble();
                    Staffs staff = new Staffs(staffName, staffID, department, post, salary);
                    controller.send(staff);
                    System.out.println("Введённые данные: " + controller.show());
                    System.out.println("_______________________________");
                    System.out.println("1 - Добавить запись");
                    System.out.println("2 - Начать заново");
                    System.out.println("_______________________________");
                    int choice2 = scanner.nextInt();
                    if (choice2 <= 2 && choice2 > 0) {
                        switch (choice2) {
                            case 1 -> {
                                controller.recBase();
                                System.out.println("_______________________________");
                                System.out.println("Запись добавлена!");
                                System.out.println("_______________________________");
                            }
                            case 2 -> System.exit(0);
                        }
                    } else System.out.println("Некорректный ввод. Повторите выбор.");
                }
                case 2 -> controller.readerBase();
            }
        } else System.out.println("Некорректный ввод. Повторите выбор.");
        scanner.close();
    }
}