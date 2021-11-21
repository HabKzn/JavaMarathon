//        Создайте класс Человек (англ. Human ). У человека должно быть поле “имя” (англ.
//        name ). На это поле в классе должен быть конструктор, get и set методы. Также, у
//        Человека должен быть метод printInfo() , который выводит в консоль информацию
//        о человеке в формате: “Этот человек с именем ИМЯ” .
//        Затем, создайте класс Студент (англ. Student ), который наследуется от класса
//        Человек. У студента есть дополнительное строковое поле - название его учебной
//        группы. Для этого поля тоже необходимо создать геттер и сеттер. Конструктор в
//        классе Студент должен принимать на вход два аргумента - имя и название учебной
//        группы. Метод printInfo() в классе Студент должен быть переопределен таким
//        образом, чтобы формат выводимого в консоль сообщения был таким:
//        “Этот человек с именем ИМЯ”
//        “Этот студент с именем ИМЯ”
//        (должно выводиться именно две строки - необходимо использовать ключевое слово
//        super )
//        И наконец, в нашей программе должна быть еще одна сущность - Преподаватель
//        (англ. Teacher ). Преподаватель должен тоже наследоваться от класса Человек. При
//        этом, у преподавателя есть дополнительное строковое поле - название предмета,
//        который ведет этот преподаватель. Для этого поля необходимо создать get и set
//        методы. Конструктор в классе Преподаватель должен принимать на вход два
//        аргумента - имя преподавателя и название преподаваемого предмета. Метод
//        printInfo() в классе Преподаватель должен быть переопределен таким образом,
//        чтобы формат выводимого в консоль сообщения был таким:
//        “Этот человек с именем ИМЯ”
//        “Этот преподаватель с именем ИМЯ”.
//        (должно выводиться именно две строки - необходимо использовать ключевое слово
//        super )
//        Создайте в методе main() класса Task1 объект класса Студент и объект класса
//        Преподаватель. Выведите в консоль название учебной группы у объекта-студента и
//        название предмета у объекта-преподавателя. Затем, вызовите printInfo() на
//        объектах и посмотрите на результат.

package day9;

public class task1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", "101");
        Teacher tchr1 = new Teacher("Abram Moiseevich", "Computer Science");
        System.out.println(st1.getGroupName());
        System.out.println(tchr1.getClassName());
        st1.printInfo();
        tchr1.printInfo();
    }
}
