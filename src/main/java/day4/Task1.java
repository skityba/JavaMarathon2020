package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        int[] arr = new int[index];
        int count = 0, count1 = 0, count2 = 0, count3 = 0, sum = 0;
        System.out.println("Введено число: " + index + "." + "Сгенерирован следующий массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            if (arr[i] > 8) {
                count++;
            }
            if (arr[i] == 1) {
                count1++;
            }
            if (arr[i] % 2 == 0) {
                count2++;
            }
            if (arr[i] % 2 != 0) {
                count3++;
            }
        }
        for (int x : arr) {
            sum += x;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + index);
        System.out.println("Количество чисел больше 8: " + count);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + count2);
        System.out.println("Количество нечетных чисел: " + count3);
        System.out.println("Сумма всех элеметов массива: " + sum);
        scan.close();
    }
}

