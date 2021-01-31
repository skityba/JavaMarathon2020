package day18;

public class Task2 {

    public static void main(String[] args) {
    int number = 717771237;
    System.out.println(count7(number));
    }

    public static int count7(int number){

//        int countNumber = number % 10;      мое решение со счетчиком
//        int count = 0;
//        if (countNumber == 7) count = 1;
//        if(number / 10 < 1 && number != 7) return 0;
//        return count + count7(number / 10);

            if (number == 0) return 0;   // правильное решение без счетчика
            if (number % 10 == 7)
                return 1 + count7(number / 10);
            else
                return count7(number / 10);
        }
    }

