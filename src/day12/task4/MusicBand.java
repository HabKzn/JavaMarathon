package day12.task4;
//        Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
//        группу можно было добавлять и удалять участников. Под участником понимается
//        строка ( String ) с именем и фамилией. Реализовать статический метод слияния групп
//        (в классе MusicBand ), т.е. все участники группы А переходят в группу B . Название
//        метода: transferMembers . Этот метод принимает в качестве аргументов два
//        экземпляра класса MusicBand . Реализовать метод printMembers (в классе
//        MusicBand ), выводящий список участников в консоль. Проверить состав групп после
//        слияния.
import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    String name;
    int year;
    List <String> participants;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        participants = new ArrayList<>();
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> after2000 = new ArrayList<>();
        for (MusicBand temp : bands) {
            if (temp.year > 2000) {
                after2000.add(temp);
            }
        }
        return after2000;

    }
    void printMembers(MusicBand band){
        for(String participant:band.participants){
            System.out.print(participant+" ");
        }
    }
    public static void transferMembers (MusicBand A, MusicBand B){
        B.participants.addAll(A.participants);
        A.participants.clear();

    }
}
