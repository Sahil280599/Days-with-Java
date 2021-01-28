package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code
        for (int i = 1; i <= 16; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
