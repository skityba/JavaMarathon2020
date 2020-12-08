package day6_alt;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike bike = new Motorbike(1980, "black", "Yamaha");
        car.setYear(1980);
        car.info();
        car.yearDiffirent(1945);
        bike.info();
        bike.yearDiffirent(1965);
    }

}
