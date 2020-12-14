package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Musician> musicians;

    public MusicBand(String name, int year, List<Musician> musicians) {
        this.name = name;
        this.year = year;
        this.musicians = musicians;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public List<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Musician> musicians) {
        this.musicians = musicians;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year + ", musicians=" + musicians +
                '}';
    }

    public static void printMembers(List<Musician> musicians, List<Musician> musicians1) {
        System.out.println("Состав музыкантов группы А до переноса: " + musicians);
        System.out.println("Состав музыкантов группы B до переноса: " + musicians1);
    }

    public static void transferMembers(MusicBand musicBands, MusicBand musicBands1) {
        musicBands.getMusicians().get(0);
        musicBands1.musicians.add(musicBands.getMusicians().get(0));
        musicBands.musicians.remove(0);
    }

    public static void getMembers(List<Musician> musicians, List<Musician> musicians1) {
        System.out.println("Состав музыкантов группы А после переноса: " + musicians);
        System.out.println("Состав музыкантов группы B после переноса: " + musicians1);
    }
}
