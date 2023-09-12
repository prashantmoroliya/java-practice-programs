package oops;

import java.io.*;

class Students {
    private int rollNo;
    private String name;

    void getData(int rollNo, String name) {
        this.rollNo=rollNo;
        this.name=name;
    }

    void display() {
        System.out.print("\nThe Student Details are: ");
        System.out.print("\nRoll No.: "+rollNo);
        System.out.print("\nName: "+name);
    }
}

class Marks extends Students {
    private final int mark1;
    private final int mark2;

    Marks(int mark1, int mark2) {
        this.mark1=mark1;
        this.mark2=mark2;
    }

    void displayMarks() {
        System.out.print("\nMarks1: "+ mark1);
        System.out.print("\nMarks2: "+mark2);

        float avg;
        avg=(float)(mark1+mark2)/2;
        System.out.print("\nAverage:"+avg);
    }
}
public class SingleInheritance {
    public static void main(String[] args) throws Exception {
        int rollNo, mark1, mark2;
        String name;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter Roll Number: ");
        rollNo=Integer.parseInt(br.readLine());

        System.out.print("\nEnter Name: ");
        name=br.readLine();

        System.out.print("\nEnter Marks1:");
        mark1=Integer.parseInt(br.readLine());

        System.out.print("\nEnter Marks2:");
        mark2=Integer.parseInt(br.readLine());

        Marks m=new Marks(mark1, mark2);
        m.getData(rollNo, name);
        m.display();
        m.displayMarks();
    }
}
