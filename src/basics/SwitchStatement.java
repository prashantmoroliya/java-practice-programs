package basics;

import java.util.Scanner;   // import Scanner class from util package;
public class SwitchStatement {
    public static void main(String[] args) {
        // create object of Scanner class;
        Scanner scanner=new Scanner(System.in);

        // declare two variable of which we will take input from the user;
        double firstNumber;
        double secondNumber;

        // creating a calculator and asking user what they want to do;
        System.out.println("=+=+=+=+=+=+=+ CALCULATOR +=+=+=+=+=+=+=");
        System.out.println("Addition (Press +)");
        System.out.println("Subtraction (Press -)");
        System.out.println("Multiplication (Press x");
        System.out.println("Division (Press /)");
        System.out.println("Remainder or Modulo (Press %)");

        // taking input from user on basis of above display menu [+, -, x, /, %];
        System.out.print("What operation you want to perform? Enter [+, -, x, /, %] : ");
        // input type will be char for one character type input only;
        char input=scanner.next().charAt(0);

        // switch statement starts here;
        // switch statement execute cases according to input and then execute the logic;
        // in this program, I am using enhanced switch case;
        switch (input) {
            // for performing addition;
            case '+' -> {
                System.out.print("Enter 1st number: ");
                firstNumber = scanner.nextDouble();
                System.out.print("Enter 2nd number: ");
                secondNumber = scanner.nextDouble();
                double additionOfTwoNumbers = firstNumber + secondNumber;
                System.out.println(firstNumber + "+" + secondNumber + "=" + additionOfTwoNumbers);
            }
            // break is important otherwise switch will execute next cases (if there is any) until a break is found or switch statement is completed;
            // for performing subtraction;
            case '-' -> {
                System.out.print("Enter 1st number: ");
                firstNumber = scanner.nextDouble();
                System.out.print("Enter 2nd number: ");
                secondNumber = scanner.nextDouble();
                double subtractionOfTwoNumbers = firstNumber - secondNumber;
                System.out.println(firstNumber + "-" + secondNumber + "=" + subtractionOfTwoNumbers);
            }
            // break is important otherwise switch will execute next cases (if there is any) until a break is found or switch statement is completed;
            // for performing multiplication;
            case 'x' -> {
                System.out.print("Enter 1st number: ");
                firstNumber = scanner.nextDouble();
                System.out.print("Enter 2nd number: ");
                secondNumber = scanner.nextDouble();
                double multiplicationOfTwoNumbers = firstNumber * secondNumber;
                System.out.println(firstNumber + "x" + secondNumber + "=" + multiplicationOfTwoNumbers);
            }
            // break is important otherwise switch will execute next cases (if there is any) until a break is found or switch statement is completed;
            // for performing division;
            case '/' -> {
                System.out.print("Enter 1st number: ");
                firstNumber = scanner.nextDouble();
                System.out.print("Enter 2nd number: ");
                secondNumber = scanner.nextDouble();
                if(secondNumber!=0) {
                    double divisionOfTwoNumbers = firstNumber / secondNumber;
                    System.out.println(firstNumber + "/" + secondNumber + "=" + divisionOfTwoNumbers);
                } else {
                    System.out.println(firstNumber + " can't be divided by " + secondNumber);
                }
            }
            // break is important otherwise switch will execute next cases (if there is any) until a break is found or switch statement is completed;
            // for performing remainder or modulo;
            case '%' -> {
                System.out.print("Enter 1st number: ");
                firstNumber = scanner.nextDouble();
                System.out.print("Enter 2nd number: ");
                secondNumber = scanner.nextDouble();
                double moduloOfTwoNumbers = firstNumber % secondNumber;
                System.out.println(firstNumber + "%" + secondNumber + "=" + moduloOfTwoNumbers);
            }
            // break is important otherwise switch will execute next cases (if there is any) until a break is found or switch statement is completed;
            default -> System.out.println("Enter correct input [+, -, x, /, %]");
        }

        // close() method to terminate the Scanner class.
        scanner.close();
    }
}
