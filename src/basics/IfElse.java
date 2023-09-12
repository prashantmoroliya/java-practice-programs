package basics;

import java.util.Scanner;   // import Scanner class from util package;
public class IfElse {
    public static void main(String[] args) {
        // creating object of Scanner class;
        Scanner scanner=new Scanner(System.in);

        // Take a number from user;
        System.out.print("Enter number[-100 to 100]: ");
        int x=scanner.nextInt();    // integer type input through Scanner class using nextInt() method;

        // making if-else logic;
        if(x>=-100 && x<=-1) {
            System.out.println(x+" is in range of -100 to -1");
        } else if(x==0) {
            System.out.println(x+" is zero.");
        } else if(x>=1 && x<=100) {
            System.out.println(x+" is in range of 1 to 100");
        } else {
            System.out.println(x+" is not in range of [-100, 100]");
        }

        // close() method to terminate the Scanner class.
        scanner.close();
    }
}
