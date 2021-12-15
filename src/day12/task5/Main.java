package day12.task5;


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
