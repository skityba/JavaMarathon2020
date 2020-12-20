package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        parseFileToStringList(file);
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        try {
            for (int i = 0; true; i++) {

                String line = scanner.next();
                String line2 = scanner.next();
                int lineNew = Integer.parseInt(line2);

                if (lineNew > 0) {
                    String line3 = line + " " + line2;
                    list.add(line3);
                } else {
                    list = null;
                    throw new IllegalArgumentException();
                }
            }
        } catch (NoSuchElementException | NullPointerException e) {
            System.out.println("Пустота");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        System.out.println(list);
        return list;
    }
}
