package Java.OOPS_Interfaces.OOPS;

abstract class Vehicle {
    abstract void accelerate();
    abstract void brake();

    void startEngine() {
        System.out.println("Engine started!");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car: Pressing gas pedal...");
    }

    void brake() {
        System.out.println("Car: Applying brakes...");
    }
}

public class ex2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
    }
}