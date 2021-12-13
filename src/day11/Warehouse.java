package day11;

public class Warehouse {
    private int countOrder = 0;
    private double balance = 0;

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Баланс равен: " + balance + "/n Количество собранных заказов: " + countOrder;
    }
}
