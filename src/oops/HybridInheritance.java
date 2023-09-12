package oops;

interface A {
    public void methodA();
}

interface B extends A {
    public void methodB();
}

interface C extends A {
    public void methodC();
}

public class HybridInheritance implements B, C {
    public void methodA() {
        System.out.println("MethodA");
    }

    public void methodB() {
        System.out.println("MethodB");
    }

    public void methodC() {
        System.out.println("MethodC");
    }

    public static void main(String[] args) {
        HybridInheritance obj=new HybridInheritance();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
