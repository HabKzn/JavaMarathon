package day11;

public class Main {
    public static void main(String[] args) {
        Warehouse wh1 = new Warehouse();
        Picker sborshik1 = new Picker(wh1);
        Courier courier1 = new Courier(wh1);
        for (int i = 0; i < 1510; i++) {
            sborshik1.doWork();
            sborshik1.bonus();
            courier1.doWork();
            courier1.bonus();

        }

        System.out.println(wh1.toString());
        System.out.println(sborshik1.getSalary());
        System.out.println(courier1.getSalary());

        Warehouse wh2 = new Warehouse();
        Picker sborshik2 = new Picker(wh2);
        Courier courier2 = new Courier(wh2);

        sborshik2.doWork();
        sborshik2.bonus();

        courier2.doWork();
        courier2.bonus();

        System.out.println(wh1.toString());
        System.out.println(sborshik1.getSalary());
        System.out.println(courier1.getSalary());


    }
}
