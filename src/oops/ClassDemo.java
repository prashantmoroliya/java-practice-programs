package oops;
// This example shows how to create an object of a class and call its method;

class ClassDemo {
    public static void main(String[] args) {
        // Creating an object;
        CircleTest c=new CircleTest();
        // accessing object method with dot(.) operator;
        String color=c.getColor();
        // print color;
        System.out.println(color);
    }
}

// class name;
class CircleTest {
    double radius=2.3;  // double variables;
    String color="purple color";   // String variable;

    //methods;
    double getRadius() {
        // method body;
        return radius;  // return statement;
    }

    String getColor() {
        // method body;
        return color;   // return statement;
    }
}
