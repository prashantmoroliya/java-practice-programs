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

/**
 * Wrapper classes in Java
 * -----------------------
 * The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
 * Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically.
 * The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.
 *
 * Use of Wrapper classes in Java
 * ------------------------------
 * Java is an object-oriented programming language, so we need to deal with objects many times like in Collections,
 * Serialization, Synchronization, etc. Let us see the different scenarios, where we need to use the wrapper classes.
 *
 * Change the value in Method:
 *      Java supports only call by value. So, if we pass a primitive value, it will not change the original value.
 *      But, if we convert the primitive value in an object, it will change the original value.
 *
 * Serialization:
 *      We need to convert the objects into streams to perform the serialization.
 *      If we have a primitive value, we can convert it in objects through the wrapper classes.
 *
 * Synchronization:
 *      Java synchronization works with objects in Multithreading.
 *
 * java.util package:
 *      The java.util package provides the utility classes to deal with objects.
 *
 * Collection Framework:
 *      Java collection framework works with objects only. All classes of the collection framework
 *      (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.)
 *      deal with objects only.
 *
 * The eight classes of the java.lang package are known as wrapper classes in Java.
 * The list of eight wrapper classes are given below:
 * Primitive Type	        Wrapper class
 *      boolean	                Boolean
 *      char	                Character
 *      byte	                Byte
 *      short	                Short
 *      int	                    Integer
 *      long	                Long
 *      float	                Float
 *      double	                Double
 *
 * Autoboxing
 * ----------
 * The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing,
 * for example,
 * byte to Byte,
 * char to Character,
 * int to Integer,
 * long to Long,
 * float to Float,
 * boolean to Boolean,
 * double to Double, and
 * short to Short.
 *
 * Since Java 5, we do not need to use the valueOf() method of wrapper classes to convert the primitive into objects.
 *
 * Unboxing
 * --------
 * The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing.
 * It is the reverse process of autoboxing.
 *
 * Since Java 5, we do not need to use the intValue() method of wrapper classes to convert the wrapper type into primitives.
 */
