package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            double dividend = scan.nextDouble();
            double divider = scan.nextDouble();
        if (divider == 0) break;
            System.out.println(dividend / divider);
        }
    }
}
