package oops;

class Parents {
    String name;
}

public class InheritanceAccessParentUsingSuperKeyword extends Parents {
    String name;

    public void displayDetails() {
        //refers to parent class member;
        super.name="Parent";
        name="Child";
        System.out.println(super.name+" and "+name);
    }

    public static void main(String[] args) {
        InheritanceAccessParentUsingSuperKeyword obj=new InheritanceAccessParentUsingSuperKeyword();
        obj.displayDetails();
    }
}
