package basics;

import java.util.Scanner;   // import Scanner class from util package;
public class AddTwoNumbers {
    public static void main(String[] args) {
        // create object of Scanner class;
        Scanner scanner=new Scanner(System.in);

        // declare two variable of which we will take input from the user;
        double firstNumber;
        double secondNumber;

        // Ask the user to input first number;
        System.out.print("Enter 1st number: ");
        // by this command we take input for double type;
        firstNumber=scanner.nextDouble();

        // same way we will take input of second number;
        System.out.print("Enter 2nd number: ");
        secondNumber=scanner.nextDouble();

        // logic to add two numbers and hold it in a variable of double type;
        double additionOfTwoNumber=firstNumber+secondNumber;

        // display the output of addition of two number;
        System.out.println(firstNumber+"+"+secondNumber+"="+additionOfTwoNumber);

        // close() method to terminate the Scanner class.
        scanner.close();
    }
}
