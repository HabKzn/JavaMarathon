//        Объявите переменную типа int , имя переменной - year . Присвойте этой
//        переменной значение 1980. Используя цикл while , выведите в столбик строки вида
//        “Олимпиада X года”, где X - это число, которое принимает значения, начиная от 1980
//        до 2020 с шагом увеличения равным 4.
//        То есть на первой итерации цикла, X равен 1980, а на каждой следующей итерации,
//        значение X увеличивается на 4. Строки такого вида выводятся до тех пор, пока
//        значение X не станет больше 2020.
//        Пример:

package day1;

public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        while (year!=2024) {
            System.out.println("Олимпиада "+year+" года");
            year+=4;

        }
    }
}
