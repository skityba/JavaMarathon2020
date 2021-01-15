package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        try {
            printResult(file);
        } catch (NumberFormatException e ) {
            System.out.println("Некорректный входной файл");
        } catch (NullPointerException | FileNotFoundException e){
            System.out.println("Файл отсутствует");
        }
    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] strArr = line.split("\\s");
        int i = 0;
        double number;
        double sum = 0.0;
        while(i < strArr.length) {
            number = Double.parseDouble(strArr[i]);
            sum += number;
            i++;
        }
        double result = sum / i;
        System.out.print(result);
        System.out.print(" " + "-->" + " ");
        System.out.printf(Locale.FRANCE,"%.3f", result);
        }
    }


