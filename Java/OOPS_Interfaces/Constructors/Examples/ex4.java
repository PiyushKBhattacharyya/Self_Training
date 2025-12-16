package Java.OOPS_Interfaces.Constructors;

class pvt {
    private pvt() {
        System.out.println("Private constructor called");
    }

    public static void displayMessage() {
        System.out.println("Hello from Private class!");
    }
}

class ex4 {
    public static void main(String[] args) {
        // pvt u = new pvt(); // ❌ Error
        pvt.displayMessage();
    }
}