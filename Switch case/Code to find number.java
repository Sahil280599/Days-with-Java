package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number = ");
        int num = sc.nextInt();

        switch (num) {
            case 10:
                System.out.print("10");
                break;
            case 20:
                System.out.print("20");
                break;
            case 30:
                System.out.print("30");
                break;
            default:
                System.out.print("nahi hai isme se");
        }
    }
}






