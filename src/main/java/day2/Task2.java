package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int number = a + 1; number < b; number++) {
                if ((number % 5) == 0 && (number % 10) != 0) {
                    System.out.print(number + " ");
                }
            }
        }
    }
}
