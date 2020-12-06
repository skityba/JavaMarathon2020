package day4;

import java.util.Random;
import java.util.Arrays;

public class Task2_alt {
    public static void main(String[] args){
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(10000);
        }
        int max = 0;
        for (int x : arr){
            if (x > max){
                max = x;
            }
        }
        int min = 10000;
        for (int x : arr){
            if (x < min)
                min = x;
        }
        int counter10 = 0;
        for(int x : arr){
            if (x % 10 == 0){
                counter10++;
            }
        }
        int sum = 0;
        for (int x : arr){
            sum += x;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 10: " + counter10);
        System.out.println("Сумма элементов массива, оканчивающихся на 10: " + sum);
    }
}
