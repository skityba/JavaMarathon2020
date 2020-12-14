package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<MusicBand> musicBands = new ArrayList<>();

        musicBands.add(new MusicBand("Radiohead", 1985));
        musicBands.add(new MusicBand("Mercury Rev", 1989));
        musicBands.add(new MusicBand("Arcade Fire", 2000));
        musicBands.add(new MusicBand("James", 1982));
        musicBands.add(new MusicBand("Antony and the Johnsons", 1998));
        musicBands.add(new MusicBand("Zbonics", 2013));
        musicBands.add(new MusicBand("TV on the Radio", 2001));
        musicBands.add(new MusicBand("Keane", 1995));
        musicBands.add(new MusicBand("Joan as Police Woman", 2002));
        musicBands.add(new MusicBand("Turin Brakes", 1999));

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        groupsAfter2000(musicBands);

        System.out.println(musicBands);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        for (int i = bands.size() - 1; i >= 0; i--) {
            int yearOfBand = bands.get(i).getYear();
            if (yearOfBand < 2000) {
                bands.remove(i);
            }
        }
        return bands;
    }
}
