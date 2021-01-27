import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the age=");
        int age=sc.nextInt();
        if (age > 18) {
            System.out.print("age is 18 eligible to vote");
        } else {
            System.out.print("false");
        }
    }
}
