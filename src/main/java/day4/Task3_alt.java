package day4;

import java.util.Random;

public class Task3_alt {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
            }

        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println("Сумма максимальной строки: " + maxSum);
        System.out.println("Индекс максимальной строки: " + maxSumIndex);
    }
}