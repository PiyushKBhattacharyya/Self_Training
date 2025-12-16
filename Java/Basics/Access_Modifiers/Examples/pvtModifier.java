package Java.Basics.Access_Modifiers;

class Person {
    private String name;   // private variable

    public void setName(String name) {
        this.name = name;  // accessible within class
    }

    public String getName() { return name; }
}

public class pvtModifier {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice");

        // p.name;  // ❌ Error: name has private access
        System.out.println(p.getName());
    }
}