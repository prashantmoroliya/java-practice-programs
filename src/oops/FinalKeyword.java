package oops;

class MySuperclass {
    // final variable;
    final int i=10;

    // final method;
    final void display() {
        System.out.println("Super Class Method");
        System.out.println("\nValue of final variable: "+i);
    }
}

public class FinalKeyword extends MySuperclass {
    public static void main(String[] args) {
        FinalKeyword obj=new FinalKeyword();
        obj.display();
    }
}
