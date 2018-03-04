package home.agaponov;

import java.util.Scanner;


//В задаче требовалось у пользователя запросить Full Name
// и выввести в рамке по середине
// В ришении же выводится в начале рамки
public class HW07Name_table {
    public static void main(String[] args) {

        String line1 = "Course of Java";
        String line2 = "Group: ";
        String line3 = "Full Name: ";
        String star = "*";

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = inputUser.nextLine();
        System.out.print("Enter your group name: ");
        String group = inputUser.nextLine();

        displayResult(line1, line2 + group, line3 + name);


    }

    private static void drawLine(int length, String star) {
        for (int i = 0; i < length; i++) {
            print(star);
        }
    }

    private static void print(String string) {
        System.out.println(string);
    }
    private static void println(String string) {
        System.out.println(string);
    }


    private static int getMaxLength(String[] strings) {
        int length = Integer.MIN_VALUE;
        for (String str : strings) {
            length = Math.max(str.length(), length);
        }
        return length;
    }

    private static String fillString(String str, int length) {
        StringBuilder sb = new StringBuilder(str);
        return sb.append(fill(' ', length - str.length())).toString();
    }

    private static String fill(char ch, int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    private static void displayResult(String... strings) {
        int maxBoxWidth = getMaxLength(strings);
        String line = "*" + fill('*', maxBoxWidth + 2) + "*";
        println(line);
        for (String str : strings) {
            System.out.printf("* %s *%n", fillString(str, maxBoxWidth));
        }
        println(line);
    }

}
