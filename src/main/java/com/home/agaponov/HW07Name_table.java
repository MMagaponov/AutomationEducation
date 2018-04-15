package com.home.agaponov;
import java.util.Scanner;

public class HW07Name_table {

    public static void main(String[] args) {

        String line1 = "Course of Java";
        String line2 = "Group: ";
        String line3 = "Full Name: ";
        String lineBlank = " ";

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = inputUser.nextLine();
        System.out.print("Enter your group name: ");
        String group = inputUser.nextLine();

        displayResult(line1, lineBlank, line2 + group, lineBlank, line3 + name);


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

    private static String fillString(String str, int lengthA) {
        StringBuilder sb = new StringBuilder(str);
        return sb.append(fill(' ',lengthA - str.length())).toString();
    }

    private static String fill(char ch, int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    private static void displayResult(String... strings) {
        int maxBoxWidth = getMaxLength(strings)+10;
        String line = "*" + fill('*', maxBoxWidth + 2) + "*";
        println(" ");
        println(line);
        println(" ");
        for (String str : strings) {
            if(str.equals(" ")){
                println(" ");
            } else {
                System.out.printf("* %s *%n", fillString("     "+str, maxBoxWidth));
            }
        }
        println(" ");
        println(line);
        println(" ");
    }
}


