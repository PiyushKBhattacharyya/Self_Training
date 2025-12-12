package Java.OOPS_Interfaces.Access_modifiers;

class Car {
    String model; // default access
}

public class ex2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "Tesla"; // allowed (same package)
        System.out.println(c.model);
    }
}