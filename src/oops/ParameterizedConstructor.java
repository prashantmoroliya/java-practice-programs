package oops;

class ParameterConstructor {
    ParameterConstructor(int num1, int num2) {
        int addition;
        addition=num1+num2;
        System.out.println("Addition of Numbers: "+addition);
    }
}
class ParameterizedConstructor {
    public static void main(String[] args) {
        new ParameterConstructor(30, 40);
    }
}
