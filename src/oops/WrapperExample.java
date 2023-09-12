package oops;

public class WrapperExample {
    public static void main(String[] args) {
        byte b=3;
        int i=10;
        float f=4.5f;
        double d=90.7;

        // data types to objects = wrapping;
        Byte byteObject=new Byte(b);        // Byte(byte) is deprecated and marked for removal;
        Integer intObject=new Integer(i);        // Integer(int) is deprecated and marked for removal;
        Float floatObject=new Float(f);        // Float(float) is deprecated and marked for removal;
        Double doubleObject=new Double(d);        // Double(double) is deprecated and marked for removal;

        // printing the values from objects;
        System.out.println("Values of Wrapper objects");
        System.out.println("Byte object: "+byteObject);
        System.out.println("Integer object: "+intObject);
        System.out.println("Float object: "+floatObject);
        System.out.println("Double object: "+doubleObject);

        // objects to data types (retrieving data types from objects) - unwrapping
        byte bv=byteObject.byteValue();
        int iv=intObject.intValue();
        float fv=floatObject.floatValue();
        double dv=doubleObject.doubleValue();

        // printing the values from data types
        System.out.println("\nUnwrapped values");
        System.out.println("byte values: "+bv);
        System.out.println("int value: "+iv);
        System.out.println("float value: "+fv);
        System.out.println("double value: "+dv);
    }
}
