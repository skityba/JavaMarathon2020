package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y;
        double z = Math.pow(x, 2);
        if(x >= 5){
            y = (z - 10) / (x + 7);
        }else if(x > -3 && x < 5){
            y = (x + 3) * (z - 2);
        }else{
            y = 420;
        }
        System.out.println(y);
    }
}
