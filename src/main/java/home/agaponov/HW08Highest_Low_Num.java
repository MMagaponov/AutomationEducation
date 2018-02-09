package home.agaponov;


import java.util.Scanner;

public class HW08Highest_Low_Num {

    public static void main(String arg[]) {
        long min = 9;
        long max = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Add your number");
        long number = scan.nextLong();

        while (number > 0) {
            long littleNumber;
            littleNumber = number % 10;
            number = number / 10;
            if (littleNumber >= max) {
                max = littleNumber;
            }
            if (littleNumber <= min){
                min = littleNumber;
            }
        }
        System.out.println("Наибольшая цифра: " + max);
        System.out.println("Наименьшая цифра: " + min);
    }

}
