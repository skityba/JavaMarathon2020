package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int number = a + 1;
        if(a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            while (number < b) {
                if ((number % 5) == 0 && (number % 10) != 0) {
                    System.out.print(number + " ");
                }
                number++;
            }
        }
    }
}
