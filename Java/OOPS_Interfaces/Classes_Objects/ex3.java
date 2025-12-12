package Java.OOPS_Interfaces.Classes_Objects;

public class ex3 {
    static String name;
    static float price;

    static void set(String n, float p) {
        name = n;
        price = p;
    }

    static void get() {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String[] args) {
        ex3.set("Visual Studio", 0.0f);
        ex3.get();
    }
}