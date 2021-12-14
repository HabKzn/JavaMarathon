package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    String name;
    int year;

    MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
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
}
