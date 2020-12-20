package day14;

import java.io.*;
import java.util.*;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> persons = new ArrayList<>();
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
                    Person person = new Person(line, lineNew);
                    persons.add(person);
                } else {
                    persons = null;
                    throw new IllegalArgumentException();
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        } catch (NoSuchElementException | NullPointerException e) {
            System.out.println("пустота");
        }
            System.out.println(persons);
            return persons;
        }
    }

