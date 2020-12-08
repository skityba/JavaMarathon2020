package day6_alt;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void yearDiffirent(int inputYear){
        System.out.println("Разница между переданным годом и годом выпуска мотоцикла составляет: " + "\n"
                + Math.abs((year - inputYear)) + " лет.");
    }
    public void info(){
        System.out.println("Это мотоцикл");
    }
}

