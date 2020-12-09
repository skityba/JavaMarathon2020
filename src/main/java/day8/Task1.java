package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < 20001; i++) {
            s = s + i  + " ";
        }
        System.out.print(s);
        long finish = System.nanoTime();

        long start2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20001; i++) {
            sb.append(i + " ");
        }
        System.out.print(sb);
        long finish2 = System.nanoTime();
        System.out.println();
        System.out.println(start);
        System.out.println(finish);
        System.out.println("Время выполнения конкатенации строк: " + (finish - start));
        System.out.println();
        System.out.println(start2);
        System.out.println(finish2);
        System.out.println("Время выполнения обьединения строк при помощи StringBuilder: " + (finish2 - start2));
    }
}
