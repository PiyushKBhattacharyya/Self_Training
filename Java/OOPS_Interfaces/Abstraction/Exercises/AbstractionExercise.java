package OOPS_Interfaces.Abstraction.Exercises;

/*
 * Exercise: Abstract Bank
 * 
 * 1. Create abstract class 'Bank' with abstract method 'getRateOfInterest()'.
 * 2. Create subclasses 'SBI' (7%) and 'PNB' (5%).
 * 3. Implement the method.
 * 4. Test in main.
 */

abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() { return 7; }
}

class PNB extends Bank {
    int getRateOfInterest() { return 5; }
}

public class AbstractionExercise {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate: " + b.getRateOfInterest() + "%");
        
        b = new PNB();
        System.out.println("PNB Rate: " + b.getRateOfInterest() + "%");
    }
}
