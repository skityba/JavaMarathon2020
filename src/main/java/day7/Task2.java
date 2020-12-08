package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int [6];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(11) + 90;
        }

        Player player1 = new Player(arr[0]);
        Player player2 = new Player(arr[1]);
        Player player3 = new Player(arr[2]);
        Player player4 = new Player(arr[3]);
        Player player5 = new Player(arr[4]);
        Player player6 = new Player(arr[5]);

        player1.run();
        player1.info();

        player2.run();
        player2.info();

        player3.run();
        player3.info();

        player4.run();
        player4.info();

        player5.run();
        player5.info();

        player6.run();
        player6.info();


        for (int i = 0; player1.getStamina() > 0; i++) {
            player1.run();
            player1.info();
        }
    }
}
