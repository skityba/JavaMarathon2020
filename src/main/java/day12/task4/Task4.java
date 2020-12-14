package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<MusicBand> musicBands = new ArrayList<>();

        List<String> musiciansRadiohead = new ArrayList<>();
        musiciansRadiohead.add(0, "Thom Yorke");
        musiciansRadiohead.add(1, "Jonny Greenwood");
        List<String> musiciansMercuryRev = new ArrayList<>();
        musiciansMercuryRev.add(0, "Jonathan Donahue");
        musiciansMercuryRev.add(1, "Jesse Chandler");

        musicBands.add(new MusicBand("Radiohead", 1985, musiciansRadiohead));
        musicBands.add(new MusicBand("Mercury Rev", 1989, musiciansMercuryRev));

        MusicBand.printMembers(musiciansRadiohead, musiciansMercuryRev);

        MusicBand.transferMembers(musicBands.get(0), musicBands.get(1));

        MusicBand.getMembers(musiciansRadiohead, musiciansMercuryRev);
    }


}


