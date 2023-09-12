package oops;

class Aa {
    void display() {
        System.out.println("Aa");
    }
}

class Bb extends Aa {
    void display() {
        System.out.println("Bb");
    }
}

class Cc extends Aa {
    void display() {
        System.out.println("Cc");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Aa a=new Aa();
        Bb b=new Bb();
        Cc c=new Cc();

        a.display();
        b.display();
        c.display();
    }
}
