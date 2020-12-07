package day5;

public class Task2 {
    public static void main(String[] args) {
     Motorbike bike = new Motorbike(1980, "black", "Yamaha");
        System.out.println("Мой мотоцикл марки " + bike.getModel() + ", он цвета " + bike.getColor() + " и собран в " + bike.getYear());
    }

}
