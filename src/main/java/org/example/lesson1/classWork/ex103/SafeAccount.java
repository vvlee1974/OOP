package org.example.lesson1.classWork.ex103;

//- addInterest() - метод для добавления процентов к балансу. Рассчитывает процентную ставку от текущего баланса и добавляет полученную сумму к балансу.
public class SafeAccount extends Account {
    private double percent;

    public SafeAccount(String owner, int number, double balance, double percent) {
        super(owner, number, balance);
        this.percent = percent;
    }


    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public void addInterest() {
        double result = (getBalance() * this.percent / 100) + getBalance();
        deposit(result);
    }

    @Override
    public String toString() {
        return "SafeAccount{" +
                "percent=" + percent +
                '}';
    }
}