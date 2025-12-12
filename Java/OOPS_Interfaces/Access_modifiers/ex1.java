package Java.OOPS_Interfaces.Access_modifiers;

class Person {
    private String name;  // private variable

    public void setName(String name) {
        this.name = name; // accessible inside class
    }

    public String getName() {
        return name;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice");

        // System.out.println(p.name); // ❌ Error: private access
        System.out.println(p.getName());
    }
}