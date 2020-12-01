package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int houseFloor = in.nextInt();
        if(houseFloor >= 1 && houseFloor <= 4){
            System.out.println("Малоэтажный дом");
        }else if(houseFloor >= 5 && houseFloor <= 8){
            System.out.println("Среднеэтажный дом");
        }else if(houseFloor >= 9){
            System.out.println("Многоэтажный дом");
        }else{
            System.out.println("Ошибка ввода");
        }
    }
}
