package oops;

abstract class Shape {
    abstract void draw();
}

// In real scenario, implementation is provided by others i.e. unknown by end user;
class Rectangle extends Shape {
    void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Draw Triangle");
    }
}

// In real scenario, method is called by programmer or user;
public class AbstractTest {
    public static void main(String[] args) {
        Shape s1=new Rectangle();
        s1.draw();

        s1=new Triangle();
        s1.draw();
    }
}

/**
 * In this example, Shape is the abstract class, and its implementation is provided by the Rectangle and Triangle classes.
 * Mostly, we don't know about the implementation class (which is hidden to the end user),
 * and an object of the implementation class is provided by the factory method.
 * A factory method is a method that returns the instance of the class.
 * In this example, if you create the instance of Rectangle class, draw() method of Rectangle class will be invoked.
 *
 */

