package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code
        char ch='z'; // enter the input
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print(ch + " is a vowels");
                break;
            default:
                System.out.print(ch+ " is a consonants");
        }
    }
}












