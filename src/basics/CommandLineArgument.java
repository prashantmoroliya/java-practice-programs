package basics;

public class CommandLineArgument {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);

        if(a>b && a>c) {
            System.out.println("Largest number is "+a);
        } else if(b>c) {
            System.out.println("Largest number is "+b);
        } else {
            System.out.println("Largest number is "+c);
        }
    }
}

/*
To get an output from Command Line Arguments you have to do the following:
Step1: Make java program and save it with class name [CommandLineArgument] by using this line of code
        javac CommandLineArgument.java

Step2: Then run program along with parameters like this:
        java CommandLineArgument 2 5 7

Then on screen you will see the output:
        Largest number is 7


or in Intellij IDE
    press the three dots on top and then click on run "Run with parameters"
    in Parameters arguments section just type the parameters
    e.g., 2 5 7
    like this
    and then click on Run
    you will see the output as:
            Largest number is 7
 */