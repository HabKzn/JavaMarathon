package day12.task4;
//        Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
//        группу можно было добавлять и удалять участников. Под участником понимается
//        строка ( String ) с именем и фамилией. Реализовать статический метод слияния групп
//        (в классе MusicBand ), т.е. все участники группы А переходят в группу B . Название
//        метода: transferMembers . Этот метод принимает в качестве аргументов два
//        экземпляра класса MusicBand . Реализовать метод printMembers (в классе
//        MusicBand ), выводящий список участников в консоль. Проверить состав групп после
//        слияния.
import static day12.task4.MusicBand.transferMembers;

public class Main {
    public static void main(String[] args) {
        MusicBand koshki = new MusicBand("Cats", 2021);
        MusicBand sobaki = new MusicBand("Dogs", 2020);
        koshki.participants.add("Murka");
        koshki.participants.add("Pushok");
        koshki.participants.add("Barsik");
        koshki.participants.add("Persik");

        sobaki.participants.add("Druzhok");
        sobaki.participants.add("Bobik");
        sobaki.participants.add("Dzhek");
        sobaki.participants.add("Alpha");

        for(String catsParticipant: koshki.participants){
            System.out.print(catsParticipant+" ");
        }
        System.out.println();

        for(String dogsParticipant: sobaki.participants){
            System.out.print(dogsParticipant+" ");
        }
        transferMembers(koshki, sobaki);

        for(String catsParticipant: koshki.participants){
            System.out.print(catsParticipant+" ");
        }
        System.out.println();

        for(String dogsParticipant: sobaki.participants){
            System.out.print(dogsParticipant+" ");
        }



    }
}
