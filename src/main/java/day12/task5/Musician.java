package day12.task5;

import java.util.List;

public class Musician {
    private List<MusicArtist> artist;

    public Musician(List<MusicArtist> artist) {
        this.artist = artist;

    }

    @Override
    public String toString() {
        return artist.toString();
    }
}