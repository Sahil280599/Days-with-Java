package com.company;

public class Methods {

    // method so that to avoid DRY concept
    static int logic(int x,int y) {
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
        c = logic(a, b);
        System.out.println(c);

        int a1=2;
        int b1=6;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);






    }

    }

