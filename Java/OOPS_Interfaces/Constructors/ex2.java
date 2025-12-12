package Java.OOPS_Interfaces.Constructors;

class ex2 {
    String name;
    int id;

    // Parameterized Constructor
    ex2 (String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("GeekName: " + name + " and GeekId: " + id);
    }

    public static void main(String[] args) {
        ex2 ex2 = new ex2("Sweta", 68);
        ex2.display();
    }
}