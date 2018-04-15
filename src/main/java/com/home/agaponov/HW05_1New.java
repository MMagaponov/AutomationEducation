package com.home.agaponov;


public class HW05_1New {
    public static void main(String[] args) {
        int num = 456850987;
        while (num != 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}