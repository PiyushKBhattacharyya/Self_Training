package Java.Basics.Access_Modifiers;

class Car {
    String model; // default access
}

public class defModifier {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "Tesla"; // accessible in same package
        System.out.println(c.model);
    }
}
