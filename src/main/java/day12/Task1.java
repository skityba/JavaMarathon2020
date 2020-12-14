package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Bugatti");
        arrList.add("Citroen");
        arrList.add("BMW");
        arrList.add("Audi");
        arrList.add("Fiat");
        System.out.println(arrList);
        arrList.add(3, "Seat");
        arrList.remove(0);
        System.out.println(arrList);
    }
}
