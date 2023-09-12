package oops;

abstract class Games {
    public abstract void start();

    public void stop() {
        System.out.println("Stopping game in Abstract class");
    }
}

class GameA extends Games {
    @Override
    public void start() {
        System.out.println("Starting Game A");
    }
}

class GameB extends Games {
    @Override
    public void start() {
        System.out.println("Startig Game B");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Games A=new GameA();
        Games B=new GameB();

        A.start();
        A.stop();

        B.start();
        B.stop();
    }
}


/**
 * Abstract class in Java
 * ----------------------
 * A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods.
 * It needs to be extended and its method implemented. It cannot be instantiated.
 *
 * Points to Remember
 *      - An abstract class must be declared with an abstract keyword.
 *      - It can have abstract and non-abstract methods.
 *      - It cannot be instantiated.
 *      - It can have constructors and static methods also.
 *      - It can have final methods which will force the subclass not to change the body of the method.
 *
 * Example of abstract class
 *     abstract class A{
 *
 *     }
 *
 * Abstract Method in Java
 * -----------------------
 * A method which is declared as abstract and does not have implementation is known as an abstract method.
 *
 * Example of abstract method
 *     abstract void printStatus();     //no method body and abstract
 *
 */