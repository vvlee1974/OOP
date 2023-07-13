package org.example.lesson5.homework.view;

import org.example.lesson5.homework.controller.Controller;
import org.example.lesson5.homework.data.Staff;
import org.example.lesson5.homework.model.UserData;

import java.time.LocalDate;
import java.util.Scanner;

public class StaffView {
    public static void main(String[] args) {
        UserData userData = new UserData();
        Controller controller = new Controller();
        System.out.println("ОТДЕЛ КАДРОВ");
        System.out.println("============");
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
                    String staffName = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Введите отдел: ");
                    String department = scanner.nextLine();
                    System.out.println("Введите должность: ");
                    String post = scanner.nextLine();
                    System.out.println("Введите размер оклада: ");
                    double salary = scanner.nextDouble();
                    Staff staff = new Staff(staffID, staffName, LocalDate.now(), department, post, salary);
                    controller.send(staff);
                    System.out.println("Введённые данные = " + controller.show());
                }
                case 2 -> System.out.println("Полный список = " + userData.getStaffBaseList());
            }
        } else {
            System.out.println("Некорректный ввод. Повторите выбор.");
        }
    }
}