package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int count = 0;
        int sum = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
            if(arr[i] % 10 == 0){
                count++;
            }
        }
        int[] value0 = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 10 == 0){
                value0[index] = arr[i];
                index++;
            }
        }
        for (int x : value0) {
            sum += x;
        }
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(max, arr[i]);
        }

        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.print(Arrays.toString(value0));
        System.out.println();
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);

    }
}
