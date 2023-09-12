package oops;

class Box {
    double width;
    double height;
    double depth;

    Box() {

    }

    Box(double width, double height, double depth) {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    void getVolume() {
        System.out.println("Volume is: "+(width*height*depth));
    }
}

class MatchBox extends Box {
    double weight;
    MatchBox() {

    }
    MatchBox(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight=weight;
    }
}
public class InheritanceExampleTwo {
    public static void main(String[] args) {
        MatchBox mb=new MatchBox(10, 20, 30, 40);
        mb.getVolume();
        System.out.println("width of MathBox is "+mb.width);
        System.out.println("height of MatchBox is "+mb.height);
        System.out.println("depth of MatchBox is "+mb.depth);
        System.out.println("weight of MatchBox is "+mb.weight);
    }
}
