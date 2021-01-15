package day16;

import java.io.*;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        PrintWriter printFile = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++) {
            printFile.print((int)(Math.random() * 100) + " ");
        }
        printFile.close();
        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter printFile2 = new PrintWriter("file2.txt");

        int sum = 0;
        int counter = 0;

        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
            counter++;
            if(counter == 20){
                printFile2.print(sum / 20.0 + " ");
                counter = 0;
                sum = 0;
            }
        }
        printFile2.close();
        scanner.close();

        printResult(file2);
    }

    public static void printResult(File file) throws IOException {
        Scanner scanner2 = new Scanner(file);
        double result = 0.0;
        while(scanner2.hasNextDouble()){
            result += scanner2.nextDouble();
        }
        scanner2.close();
        System.out.print((int)result);
    }
}
