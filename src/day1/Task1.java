//Вывести на экран слово “JAVA” , в строку, чтобы оно повторилось 10 раз, используя
//        цикл while .
//        Вывод в консоль должен быть таким:
//        JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA


package day1;

public class Task1 {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            if (i == 1) {
                System.out.println("JAVA");
                i--;
            } else {
                System.out.print("JAVA ");
                i--;
            }
        }
    }
}
