package oops;

public class AddressDetailsUsingThisKeyword {
    int flatNo;
    String building;
    String city;

    AddressDetailsUsingThisKeyword(int flatNo, String building) {
        this.flatNo=flatNo;
        this.building=building;
    }

    AddressDetailsUsingThisKeyword(int flatNo, String building, String city) {
        // now we don't need to initialize flatNo and building;
        this(flatNo, building);
        this.city=city;
    }

    void display() {
        System.out.println(flatNo+" "+building+" "+city);
    }

    public static void main(String[] args) {
        AddressDetailsUsingThisKeyword e1=new AddressDetailsUsingThisKeyword(1, "Eclipse Tower");
        AddressDetailsUsingThisKeyword e2=new AddressDetailsUsingThisKeyword(2, "Casino Penthouse", "Delhi");
        e1.display();
        e2.display();
    }
}
