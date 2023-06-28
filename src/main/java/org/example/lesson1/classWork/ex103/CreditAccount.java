package org.example.lesson1.classWork.ex103;
//calculate_interest() - метод для расчета процентов по кредиту.
// Должен рассчитывать процентную ставку от текущего баланса и вычитать полученную сумму из баланса.
// Если баланс отрицательный, то проценты начисляются на отрицательный баланс.
public class CreditAccount extends Account{
    private double degreePercent;

    public CreditAccount(String name,int number, double balance, double degreePercent) {
        super(name, number, balance);
        this.degreePercent = degreePercent;
    }

    public double getDegreePercent() {
        return degreePercent;
    }

    public void setDegreePercent(double degreePercent) {
        this.degreePercent = degreePercent;
    }

    public void calculate_interest(){
        double result = getBalance() * degreePercent / 100;
        withdraw(result);
    }
}
