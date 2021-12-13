package day11;

/*
На складе происходит сборка и упаковка интернет-заказа.
Создайте классы:
- “Склад” (англ. Warehouse ). Поля: countOrder (количество собранных
заказов), balance (доход от доставленных заказов). Get и set методы для
обоих полей. Для получения информации о значениях полей склада
переопределите метод toString() .
- “Сборщик” (англ. Picker ), с полем salary , только get метод.
- “Курьер” (англ. Courier ), с полем salary , только get метод.
Каждый класс-сотрудник должен реализовывать интерфейс Worker , в котором
необходимо объявить методы doWork() и bonus() .
Каждый раз когда сотрудник выполняет свою работу (вызов метод doWork() ), ему
выплачивается заработная плата (сокр. ЗП) (80 - сборщику, 100 - курьеру).
А также при вызове doWork() у Сборщика, происходит увеличение значения поля
countOrder в классе Warehouse на 1. При вызове doWork() у Курьера, происходит
увеличение переменной balance в классе Warehouse на 1000.
Сотрудникам полагается бонус (индивидуальный расчет для каждого): когда на складе
отгружен 1500-й заказ, заработанная к тому моменту ЗП сборщика утраивается. Когда
складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.
Для демонстрации и тестирования работы программы создайте склад и по 1 рабочему,
вызовите у каждого методы doWork() и bonus() , столько раз, чтобы каждый из
сотрудников получил бонус. Выведите в консоль баланс и количество выполненных
заказов на складе и ЗП каждого из сотрудников.
Создать второй склад, также принять по 1 сотруднику с однократным вызовом
doWork() у каждого. Проконтролировать, что у склада 1 и его сотрудников при этом
значения не меняются.
Рекомендации: для получения данных склада внутри классов сотрудников реализуйте
хранение ссылки на объект Warehouse и передавайте ее с помощью конструктора или
set метода.
 */
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
