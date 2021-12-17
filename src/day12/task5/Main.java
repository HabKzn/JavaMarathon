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

import org.w3c.dom.ls.LSOutput;

import static day12.task5.MusicBand.transferMembers;

public class Main {

    public static void printBandParticipants(MusicBand band) {
        for (MusicArtist artist : band.participants) {
            System.out.println("Имя участника группы "+band.name+" : " + artist.name + " его возраст: " + artist.age);
        }
        System.out.println();


    }


    public static void main(String[] args) {
        MusicBand koshki = new MusicBand("Cats", 2021);
        MusicBand sobaki = new MusicBand("Dogs", 2020);
        koshki.participants.add(new MusicArtist("Pushok", 2));
        koshki.participants.add(new MusicArtist("Persik", 4));
        koshki.participants.add(new MusicArtist("Murka", 1));
        koshki.participants.add(new MusicArtist("Barsik", 3));

        sobaki.participants.add(new MusicArtist("Druzhok", 6));
        sobaki.participants.add(new MusicArtist("Reks", 7));
        sobaki.participants.add(new MusicArtist("Alpha", 4));
        sobaki.participants.add(new MusicArtist("Dzhek", 9));


        printBandParticipants(koshki);
        printBandParticipants(sobaki);

        transferMembers(koshki, sobaki);
        System.out.println("\nУчастники групы кошки переходят в группу собаки");

        printBandParticipants(koshki);
        printBandParticipants(sobaki);


    }
}
