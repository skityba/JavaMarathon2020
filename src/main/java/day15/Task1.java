package day15;

import java.io.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/shoes.csv");
        PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt");
        Scanner scanner = new Scanner(file);
        String textString = null;
        String name = null;
        int size = 0;
        int quatify = 0;
        try {
            for (int i = 0; true; i++) {
                textString = scanner.nextLine();
                String[] stringArr = textString.split(";");
                name = stringArr[0];
                size = Integer.parseInt(stringArr[1]);
                quatify = Integer.parseInt(stringArr[2]);
                if (quatify == 0) {
                    pw.print(name + ", ");
                    pw.print(size + ", ");
                    pw.println(quatify);
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Строки закончились");
        } finally {
            scanner.close();
            pw.close();
            System.out.println(name);
        }
    }
}
