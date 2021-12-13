package day11;

public class Courier implements Worker {
    public double salary;
    Warehouse warehouse;
    boolean bonusPaid = false;

    Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);


    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() >= 1000000 && bonusPaid == false) {
            salary *= 2;
            bonusPaid = true;

        }

    }
}
