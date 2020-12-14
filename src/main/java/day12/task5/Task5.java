package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> artistRadiohead = new ArrayList<>();
        List<MusicArtist> artistMercuryRev = new ArrayList<>();

        artistRadiohead.add(new MusicArtist("Thom Yorke", 52));
        artistRadiohead.add(new MusicArtist("Jonny Greenwood", 49));
        artistMercuryRev.add(new MusicArtist("Jonathan Donahue", 54));
        artistMercuryRev.add(new MusicArtist("Jesse Chandler", 47));

        List<Musician> musiciansRadiohead = new ArrayList<>();
        musiciansRadiohead.add(new Musician(artistRadiohead));
        List<Musician> musiciansMercuryRev = new ArrayList<>();
        musiciansMercuryRev.add(new Musician(artistMercuryRev));

        List<MusicBand> musicBands = new ArrayList<>();

        musicBands.add(new MusicBand("Radiohead", 1985, musiciansRadiohead));
        musicBands.add(new MusicBand("Mercury Rev", 1989, musiciansMercuryRev));

        MusicBand.printMembers(musiciansRadiohead, musiciansMercuryRev);

        MusicBand.transferMembers(musicBands.get(0), musicBands.get(1));

        MusicBand.getMembers(musiciansRadiohead, musiciansMercuryRev);
    }
}


