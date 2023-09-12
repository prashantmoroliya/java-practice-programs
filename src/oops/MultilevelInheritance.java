package oops;

class Car {
    public Car() {
        System.out.println("Class Car");
    }

    public void vehicleType() {
        System.out.println("Vehicle Type: Car");
    }
}

class Ford extends Car {
    public Ford() {
        System.out.println("Class Ford");
    }

    public void brand() {
        System.out.println("Brand: Ford");
    }

    public void speed() {
        System.out.println("Max: 290 KMph");
    }
}

class Endeavour extends Ford {
    public Endeavour() {
        System.out.println("Ford Model: Endeavour");
    }

    public void speed() {
        System.out.println("Max: 190 KMph");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Endeavour obj=new Endeavour();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}
