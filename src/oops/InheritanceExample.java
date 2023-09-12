package oops;

class Parent {
    String name="Class A";
    public String getName() {
        return name;
    }
}

class Child extends Parent {
    String address="Connaught Place, Delhi";

    public String getAddress() {
        return address;
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Child obj=new Child();
        System.out.println(obj.getName());
        System.out.println(obj.getAddress());
    }
}
