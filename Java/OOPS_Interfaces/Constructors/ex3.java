package Java.OOPS_Interfaces.Constructors;

class copycons {
    String name;
    int id;

    copycons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    copycons(copycons obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

class ex3 {
    public static void main(String[] args) {
        System.out.println("First Object");
        copycons cons1 = new copycons("Sweta", 68);
        System.out.println("Name: " + cons1.name + " and Id: " + cons1.id);

        System.out.println();

        copycons cons2 = new copycons(cons1); // Copy constructor invoked
        System.out.println("Copy Constructor used Second Object");
        System.out.println("Name: " + cons2.name + " and Id: " + cons2.id);
    }
}