package day12.task5;
//        Скопировать MusicBand из прошлого задания и доработать - теперь у участника
//        музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
//        участником понимается не строка, а объект класса MusicArtist . Необходимо
//        реализовать класс MusicArtist и доработать класс MusicBand (создать копию
//        класса) таким образом, чтобы участники были - объекты класса MusicArtist . После
//        этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
//        проверить состав групп после слияния. Методы для слияния и для вывода участников
//        в консоль необходимо тоже переработать, чтобы они работали с объектами класса
//        MusicArtist .
import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    String name;
    int year;
    List <MusicArtist> participants;

    MusicBand(String name, int year) {
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
        for(MusicArtist participant:band.participants){
            System.out.print(participant.name+" ");
        }
    }
    public static void transferMembers (MusicBand A, MusicBand B){
        B.participants.addAll(A.participants);
       A.participants.clear();

    }
}
