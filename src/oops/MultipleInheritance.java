package oops;

// java doesn't support Multiple Inheritance;
// to achieve multiple inheritance java has interface;
interface MyInterface {
    public String hello="hello";
    public void sayHello();
}

interface MyOtherInterface {
    public void sayGoodbye();
}

public class MultipleInheritance implements MyInterface, MyOtherInterface {
    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }

    public static void main(String[] args) {
        MultipleInheritance obj=new MultipleInheritance();
        obj.sayHello();
        obj.sayGoodbye();
    }
}
