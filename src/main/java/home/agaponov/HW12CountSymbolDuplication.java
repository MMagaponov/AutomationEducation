package home.agaponov;

import java.util.Scanner;

public class HW12CountSymbolDuplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Add your String");


        String s = scan.nextLine();
        s = s.toLowerCase();
        int[] arr = new int[255];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        // вывод
        for (int i = 97; i < 123; i++) {
            System.out.println((char) i + " встречается " + arr[i] + " раз");
        }
    }

}
