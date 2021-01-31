package com.company;

public class Methods {

    // method so that to avoid DRY concept
    int logic(int x,int y) {
        int z;
        if(x >y){
            z=x+y;
        }
        else {
            z=(x+y) * 5;
        }
        return z;

    }
    public static void main(String[] args) {
        // write your code here
        int a = 5;
        int b = 10;
        int c;
        // method invocation using object creation
        Methods obj = new Methods(); // creating object
        c = obj.logic(a, b);
        System.out.println(c);
