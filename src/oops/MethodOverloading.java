package oops;

class MethodOverload {
    public void display(int number) {
        System.out.println("Integer value: "+number);
    }

    public void display(float number) {
        System.out.println("Float value: "+number);
    }

    public void display(char character) {
        System.out.println("Character value: "+character);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverload obj=new MethodOverload();
        obj.display(20);
        obj.display(0.33f);
        obj.display('L');
    }
}
