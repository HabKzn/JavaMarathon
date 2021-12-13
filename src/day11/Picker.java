package day11;

public class Picker implements Worker {
    private double salary = 0;
    Warehouse warehouse;
    boolean bonusPaid = false;

    Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);

    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() >= 1500 && bonusPaid == false) {
            salary *= 3;
            bonusPaid = true;
        }

    }
}
