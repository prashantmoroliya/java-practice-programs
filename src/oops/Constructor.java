package oops;

class Student {
    String studentName;
    public Student(String studentName) {
        this.studentName=studentName;
    }

    public String getName() {
        return studentName;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s=new Student("Naruto Uzumaki");
        System.out.println(s.studentName);
        System.out.println(s.getName());
    }
}
