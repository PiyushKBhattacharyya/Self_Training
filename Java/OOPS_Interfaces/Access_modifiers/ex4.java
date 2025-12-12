package Java.OOPS_Interfaces.Access_modifiers;

class Vehicle {
    protected int speed;
}

class Bike extends Vehicle {
    void setSpeed(int s) {
        speed = s; // accessible here
    }

    int getSpeed() {
        return speed;
    }
}

public class ex4 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.setSpeed(100);
        System.out.println("Access via subclass method: " + b.getSpeed());

        Vehicle v = new Vehicle();
        System.out.println(v.speed); // allowed only if same package
    }
}