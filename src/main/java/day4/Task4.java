package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sumTree = 0;
        int max = 0;
        int stringIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
            //System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            for (int x : arr) {
                if (i < arr.length - 2) {
                    sumTree = arr[i] + arr[i + 1] + arr[i + 2];
                    max = Math.max(max, sumTree);
                    if (sumTree == max){
                        stringIndex = i;
                    }
                }
            }
            //System.out.println("Тройки " + sumTree);
        }
        System.out.println("Максимальная сумма тройки: " + max);
        System.out.println("Индекс первого элемента тройки " + stringIndex);
    }
}
