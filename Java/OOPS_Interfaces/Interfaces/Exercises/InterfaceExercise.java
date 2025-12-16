package OOPS_Interfaces.Interfaces.Exercises;

/*
 * Exercise: Remote Control
 * 
 * 1. Create interface 'RemoteControl' with methods 'powerOn()', 'powerOff()'.
 * 2. Implement it in 'TV' and 'AC' classes.
 * 3. Test both in main.
 */

interface RemoteControl {
    void powerOn();
    void powerOff();
}

class TV implements RemoteControl {
    public void powerOn() { System.out.println("TV is ON"); }
    public void powerOff() { System.out.println("TV is OFF"); }
}

class AC implements RemoteControl {
    public void powerOn() { System.out.println("AC is ON"); }
    public void powerOff() { System.out.println("AC is OFF"); }
}

public class InterfaceExercise {
    public static void main(String[] args) {
        RemoteControl rc;
        
        rc = new TV();
        rc.powerOn();
        
        rc = new AC();
        rc.powerOn();
    }
}
