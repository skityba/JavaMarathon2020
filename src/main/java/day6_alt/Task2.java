package day6_alt;

public class Task2 {
    public static void main(String[] args) {
        Airplaine aircraft = new Airplaine("Fokker", 1999, 15, 20, 0);
        aircraft.info();
        aircraft.fillUp(5);
        aircraft.info();
        System.out.println();
        Airplaine airship = new Airplaine("Boeing", 2005, 54, 60, 2);
        airship.info();
        airship.setYear(2007);
        airship.setLength(56);
        airship.fillUp(3);
        airship.fillUp(4);
        airship.info();
    }
}
