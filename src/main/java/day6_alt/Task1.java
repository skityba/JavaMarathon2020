package day6_alt;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike bike = new Motorbike(1980, "black", "Yamaha");
        car.setYear(1980);
        car.info();
        System.out.println("Разница между введенным годом и годом производства автомобиля - " + car.yearDiffirent(1945));
        bike.info();
        System.out.println("Разница между введенным годом и годом производства мотоцикла - " + bike.yearDiffirent(1965));
    }
}
