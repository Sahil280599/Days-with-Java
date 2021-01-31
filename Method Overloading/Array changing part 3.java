package com.company;

// if we dont want anyrthing return
public class Method_overloading {
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){ //refrence copy hogaaa
        arr[0]=98;
    }
    static void telljoke(){
        System.out.println("fuck");

    }

    public static void main(String[] args) {
        //int [] marks = {52,73,77,89,98,94};
        // Case 1: changing interger
        //int x=45;//isne apni copy dedi upar iska kuch nahi ukhdega
        //change(x);
        //System.out.println(x);

        // case 2: changing array
        int [] marks = {52,73,77,89,98,94}; //array object

        change2(marks);
        System.out.println(marks[0]);

    }
}

