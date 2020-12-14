package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i = 0; i <= 350; i++) {
            if (i % 2 == 0 && i <= 30) {
                arrList.add(i);
            }
            if (i % 2 == 0 && i >= 300) {
                arrList.add(i);
            }
        }
        System.out.println(arrList);
    }
}
