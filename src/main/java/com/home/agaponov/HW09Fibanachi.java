package com.home.agaponov;


import java.util.Scanner;

public class HW09Fibanachi {

        private static int f(int index) {
            if (index <= 0) {
                return 0;
            } else if (index == 1) {
                return 1;
            } else if (index == 2) {
                return 1;
            } else {
                return f(index - 1) + f(index - 2);
            }
        }

        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter the index needed");
            int numIndex = scanner.nextInt();
            int n = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(f(numIndex) + " ");
            }
        }
    }

