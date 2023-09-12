package oops;

// the following Bicycle class is one possible implementation of bicycle;
// this class shows how to use methods in a class;

class Bicycle {
    int cadence=0;
    int speed=0;
    int gear=1;

    void changeCadence(int newValue) {
        cadence=newValue;
    }
    void changeGear(int newValue) {
        gear=newValue;
    }
    void speedUp(int increment) {
        speed+=increment;
    }
    void applyBrakes(int decrement) {
        speed-=decrement;
    }

    void printStates() {
        System.out.println("cadence: "+cadence+" speed: "+speed+" gear: "+gear);
    }
}

class BicycleDemo {
    BicycleDemo() {

        // create two different Bicycle object;
        Bicycle bike1=new Bicycle();
        Bicycle bike2=new Bicycle();

        // invoke methods on those objects;
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}

public class MethodExample {
    public static void main(String[] args) {
        new BicycleDemo();
    }
}
