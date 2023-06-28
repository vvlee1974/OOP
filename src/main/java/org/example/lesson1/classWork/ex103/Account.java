package org.example.lesson1.classWork.ex103;

public class Account {
    private  String name;
    private  int number;
    private double balance;

    public Account(){

    }

    public Account(String name, int number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance =+ amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }else {
            System.out.println("Недостаточно средств \n Остаток на счёте: " + balance);
        }
    }



    @Override
    public String toString() {
        return "Accaunt{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }

}
