package org.example.lesson1.classWork.ex103;

public class Main103 {
    public static void main(String[] args) {
        CreditAccount credit1 = new CreditAccount("Иван Иванов", 12451, 1000, 10.0);
        SafeAccount safe = new SafeAccount("Иван Иванов", 34561, 3000, 10.0);

        System.out.println(credit1.getBalance());
        credit1.calculate_interest();
        System.out.println(credit1.getBalance());
        System.out.println(safe.getBalance());
        safe.addInterest();
        System.out.println(safe.getBalance());
    }
}
