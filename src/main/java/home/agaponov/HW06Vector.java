package home.agaponov;


import java.util.Scanner;

public class HW06Vector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x");
        double x = scan.nextDouble();

        System.out.println("Enter y");
        double y = scan.nextDouble();

        System.out.println("Enter z");
        double z = scan.nextDouble();

        double result = (x*x) + (y*y) + (z*z);

        System.out.println("Длина вектора " +"("+x + " ;" + y + " ;" +z+")"+" = "+Math.sqrt(result));
    }
}
