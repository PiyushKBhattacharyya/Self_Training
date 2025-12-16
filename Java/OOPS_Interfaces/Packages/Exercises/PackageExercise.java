package OOPS_Interfaces.Packages.Exercises;

/*
 * Exercise: User Package
 * 
 * Note: This code is already in a package 'OOPS_Interfaces.Packages.Exercises'.
 * 
 * 1. Create a simple class 'Message' with a method 'sayHello()'.
 * 2. In 'Main', import it (if in different package) or use it.
 * 3. Verify directory structure created by 'package' keyword.
 */

class Message {
    public void sayHello() {
        System.out.println("Hello from a package!");
    }
}

public class PackageExercise {
    public static void main(String[] args) {
        Message msg = new Message();
        msg.sayHello();
        
        System.out.println("Current Package: " + PackageExercise.class.getPackage().getName());
    }
}
