package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        int max = 0;
        int stringMax = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50);
                System.out.print(arr[i][j] + " ");
            }
            int sum = 0;
            for (int x : arr[i]) {
                sum = sum + x;
                max = Math.max(max, sum);
                if (sum == max){
                    stringMax = i;
                }
            }
            System.out.println("Сумма значений строки: " + sum + " Номер строки: " + i);
            System.out.println();
        }
        System.out.println("Максимальная сумма строки: " + max);
        System.out.println();
        System.out.println("Номер строки: " + stringMax);
    }
}


