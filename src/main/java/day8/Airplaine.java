package day8;

public class Airplaine {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplaine(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    private int n;
    public void fillUp(int n){
        fuel = fuel + n;
        System.out.println("Топливный бак заправили на " + n + " тонн топлива");
    }
//    public void info(){
//        System.out.println("Изготовитель: " + producer + " , год выпуска: " + year + ","
//                + " длина: " + length + " , вес: " + weight + " ,"
//                + " количество топлива в баке: " + fuel);
//    }
    public String toString(){
        return "Изготовитель: " + producer + " , год выпуска: " + year + ","
                + " длина: " + length + " , вес: " + weight + " ,"
                + " количество топлива в баке: " + fuel;
    }
}
