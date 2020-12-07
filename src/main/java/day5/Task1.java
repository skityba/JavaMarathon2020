package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1968);
        car.setColor("white");
        car.setModel("Citroen");
        System.out.println("Год производства: " + car.getYear());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Модель: " + car.getModel());
    }
}
