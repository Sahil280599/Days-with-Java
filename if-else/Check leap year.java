package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year = ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.print("leap yearr");
        } else if (year % 100 == 0) {
            System.out.print("lear year");
        } else if (year % 400 == 0) {
            System.out.print("leap year");
        } else {
            System.out.print("Nahi hai bhai");
        }
    }
}
