package oops;

class SuperClass {
    void display() {
        System.out.println("Hello Superclass");
    }
}
public class PolymorphismMethodOverriding extends SuperClass {
    void display() {
        System.out.println("Hello Subclass");
    }

    public static void main(String[] args) {
        // this is called upcasting;
        SuperClass s=new PolymorphismMethodOverriding();
        s.display();
    }
}
