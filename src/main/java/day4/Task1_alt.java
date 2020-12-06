package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1_alt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        Random random = new Random();
        int[] arr = new int[index];
        System.out.println("Введено число: " + index + "." + "Сгенерирован следующий массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Информация о массиве: ");
        System.out.println("Длина массива: " + arr.length);
        int count8 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 8) {
                count8++;
            }
        }
            System.out.println("Количество чисел больше 8: " + count8);
            int count1 = 0;
            for(int i = 0; i < arr.length; i++){
            if (arr[i] == 1) {
                count1++;
            }
            }
            System.out.println("Количество чисел равных 1: " + count1);
            int count2 = 0;
            for(int i = 0;i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count2++;
                }
            }
            System.out.println("Количество четных чисел: " + count2);
            int countNo2 = 0;
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    countNo2++;
                }
            }
            System.out.println("Количество нечетных чисел: " + countNo2);
            int sum = 0;
            for (int x : arr) {
                sum += x;
            }
            System.out.println("Сумма всех элеметов массива: " + sum);
            scan.close();
        }
    }
