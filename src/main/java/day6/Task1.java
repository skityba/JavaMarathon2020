package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike bike = new Motorbike(1980, "black", "Yamaha", 1965);
        car.setYear(1980);
        car.setInputYear(1945);
        car.info();
        car.yearDiffirent(car.getInputYear());
        bike.info();
        bike.yearDiffirent(bike.getInputYear());
    }

}
