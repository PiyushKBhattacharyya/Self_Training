package Java.Methods;

public class Hello
{
    // An example method
    public void printMessage() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        Hello obj = new Hello();  // Create instance
        obj.printMessage();       // Calling the method
    }
}