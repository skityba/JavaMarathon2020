package day14;

import java.io.*;
import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("numbers1.txt");
        try {
            printSumDigits(file);
        } catch (NumberFormatException e ) {
            System.out.println("Некорректный входной файл");
        } catch (NullPointerException e){
        }
    }

    public static void printSumDigits(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException  e) {
            System.out.println("Файл не найден");
        }
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ", 10);
        int[] numbers = new int[10];
        int counter = 0;
        int sum = 0;
        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
            sum += Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);

        scanner.close();
    }
}
