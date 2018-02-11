package home.agaponov;

import java.util.Scanner;



public class HW07Name_table {
    public static void main(String[] args) {

        String line1 = "Course of Java";
        String line2 = "Group: ";
        String line3 = "Full Name: ";
        String star = "*";
        String space[];
        String result1;
        String result2;
        String result3;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = inputUser.nextLine();
        System.out.print("Enter your group name: ");
        String group = inputUser.nextLine();

        space = new String[line3.length() + name.length()];
        int sizeOfFrame = line3.length() + name.length() + space.length;

        drawStar(sizeOfFrame, star);
        String resultSpace = "";

        for(int j = 0; j < sizeOfFrame - space.length; j++) {
            space[j] = " ";
            resultSpace = String.join("", space);
        }

        result1 = resultSpace + line1 + resultSpace;
        result2 = resultSpace + line2.concat(group) + resultSpace;
        result3 = resultSpace + line3.concat(name) + resultSpace;

        System.out.print("\n");
        System.out.println(star +result1+ star);
        System.out.println(star +result2+ star);
        System.out.println(star +result3+ star);

        drawStar(sizeOfFrame, star);
    }

    private static void drawStar(int length, String star) {
        for (int i = 0; i < length; i++) {
            print(star);
        }
    }

    private static void print(String string) {
        System.out.print(string);
    }

}
