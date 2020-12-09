package day7;

public class Task1 {

    public static void main(String[] args) {
        Airplaine aircraft = new Airplaine("Fokker", 1999, 15, 20, 0);
        Airplaine airship = new Airplaine("Boeing", 2005, 54, 60, 2);

        Airplaine.compareAirplaines(aircraft, airship);
    }

}