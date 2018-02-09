package home.agaponov;


public class HW05_1New {
    public static void main(String[] args) {
        int num = 45685;
        while (num != 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}