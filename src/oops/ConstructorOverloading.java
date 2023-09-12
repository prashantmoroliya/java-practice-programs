package oops;

public class ConstructorOverloading {
    int id;
    String name;
    int age;
    ConstructorOverloading(int i, String s) {
        id=i;
        name=s;
    }
    ConstructorOverloading(int i, String s, int a) {
        id=i;
        name=s;
        age=a;
    }
    void display() {
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        ConstructorOverloading co1=new ConstructorOverloading(1, "Naruto Uzumaki");
        ConstructorOverloading co2=new ConstructorOverloading(2, "Sasuke Uchiha", 18);
        co1.display();
        co2.display();
    }
}
