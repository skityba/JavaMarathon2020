package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i <= 350; i++) {
            if ((i % 2 == 0) && ((i > 0 && i <= 30) || (i >= 300))) {
                arrList.add(i);
            }
        }
        System.out.println(arrList);
    }
}
