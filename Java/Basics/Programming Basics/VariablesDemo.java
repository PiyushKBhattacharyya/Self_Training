public class VariablesDemo {
    int instanceVar = 10;           // Instance variable
    static String staticVar = "I am static"; // Static variable

    public void showVariables() {
        int localVar = 5; // Local variable
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariablesDemo obj1 = new VariablesDemo();
        obj1.showVariables();

        System.out.println("Accessing Static Variable via class: " + VariablesDemo.staticVar);
    }
}