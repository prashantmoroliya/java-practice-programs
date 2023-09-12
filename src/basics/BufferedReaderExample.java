package basics;

// import Buffered Reader and InputStreamReader class from io package;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        // declaring different data types to take input of;
        String str;
        int i;
        float f;
        double d;
        long l;

        // we are connecting the BufferedReader stream with the InputStreamReader stream for reading the line by line data from the keyboard
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // taking String input;
        System.out.print("Enter String: ");
        str=br.readLine();
        // taking Integer input;
        System.out.print("Enter Integer: ");
        i=Integer.parseInt(br.readLine());
        // taking Float input;
        System.out.print("Enter Float: ");
        f=Float.parseFloat(br.readLine());
        // taking Double input;
        System.out.print("Enter Double: ");
        d=Double.parseDouble(br.readLine());
        // taking Long input;
        System.out.print("Enter Long: ");
        l=Long.parseLong(br.readLine());

        // displaying our different data types we took input in the output screen;
        System.out.println("String: "+str);
        System.out.println("Integer: "+i);
        System.out.println("Float: "+f);
        System.out.println("Double: "+d);
        System.out.println("Long: "+l);
    }
}
