 public static void main(String[] args) {
        // write your code
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks = ");
        int marks = sc.nextInt();

        if (marks < 50) {
            System.out.print("fail");
        }
        else if (marks >= 50 && marks < 60)
        {
            System.out.print("D grade");
        }

        else if (marks >= 60 && marks < 70) {
            System.out.print("C Grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.print("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.print("A+ grade");
        } else {
            System.out.print("dhang se daal nmber");
        }
    }
}
