package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> musicians;

    public MusicBand(String name, int year, List<String> musicians) {
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

    public void setMusicians(List<String> musicians) {
        this.musicians = musicians;
    }

    public List<String> getMusicians() {
        return musicians;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year + ", musicians=" + musicians +
                '}';
    }

    public static void printMembers(List<String> musicians, List<String> musicians1) {
        System.out.println("Состав музыкантов группы А до переноса: " + musicians);
        System.out.println("Состав музыкантов группы B до переноса: " + musicians1);
    }

    public static void transferMembers(MusicBand musicBands, MusicBand musicBands1) {
        musicBands.getMusicians().get(0);
        musicBands.getMusicians().get(1);
        musicBands1.musicians.add(musicBands.getMusicians().get(0));
        musicBands1.musicians.add(musicBands.getMusicians().get(1));
        musicBands.musicians.remove(1);
        musicBands.musicians.remove(0);
    }

    public static void getMembers(List<String> musicians, List<String> musicians1) {
        System.out.println("Состав музыкантов группы А после переноса: " + musicians);
        System.out.println("Состав музыкантов группы B после переноса: " + musicians1);
    }
}
