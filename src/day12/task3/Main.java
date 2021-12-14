package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static day12.task3.MusicBand.groupsAfter2000;

//          Создать класс Музыкальная Группа (англ. MusicBand ) с полями name и year
//        (название музыкальной группы и год основания). Создать 10 или более экземпляров
//        класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
//        которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
//        список. Создать статический метод в классе Task3 :
//          public static List<MusicBand> groupsAfter2000(List<MusicBand>
//          bands)
//        Этот метод принимает список групп в качестве аргумента и возвращает новый список,
//        состоящий из групп, основанных после 2000 года. Вызвать метод
//        groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
//        из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
//        после 2000 года).
//        4.
public class Main {
    public static void main(String[] args) {
        MusicBand abba = new MusicBand("ABBA", 1976);
        MusicBand splin = new MusicBand("Сплин", 1998);
        MusicBand bi2 = new MusicBand("БИ-2", 1997);
        MusicBand mummiTroll = new MusicBand("Муммй Тролль", 1983);
        MusicBand secondsMars = new MusicBand("30 Seconds to Mars", 1998);
        MusicBand strokes = new MusicBand("The Strokes", 2005);
        MusicBand whiteStripes = new MusicBand("The white stripes", 2002);
        MusicBand vines = new MusicBand("The vines", 2007);
        MusicBand kingsOfLeon = new MusicBand("Kings of Leon", 2006);
        MusicBand monkeys = new MusicBand("Arctic Monkeys", 2010);

        List<MusicBand> fullList = new ArrayList<>();
        fullList.add(abba);
        fullList.add(splin);
        fullList.add(bi2);
        fullList.add(mummiTroll);
        fullList.add(secondsMars);
        fullList.add(strokes);
        fullList.add(whiteStripes);
        fullList.add(vines);
        fullList.add(kingsOfLeon);
        fullList.add(monkeys);

        for (MusicBand temp : fullList) {
            System.out.print(temp.name + " ");
        }
        System.out.println();

        Collections.shuffle(fullList);


        List<MusicBand> after2000 = groupsAfter2000(fullList);

        for (MusicBand temp : after2000) {
            System.out.print(temp.name + " ");

        }


    }
}
