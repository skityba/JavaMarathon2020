package day4;

import java.util.Random;

public class Task4_alt {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < arr.length - 2; i++){
            int sum = 0;
            for (int j = i; j < i + 3; j++){
                sum += arr[j];
            }
            if(sum > maxSum){
                  maxSum = sum;
                  maxSumIndex = i;
              }
            }
        System.out.println("Максимальная сумма тройки: " + maxSum);
        System.out.println("Индекс первого элемента тройки " + maxSumIndex);
        }
    }
