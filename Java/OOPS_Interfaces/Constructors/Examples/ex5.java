package Java.OOPS_Interfaces.Constructors;

class over {
    over(String name) {
        System.out.println("Constructor with one argument - String: " + name);
    }

    over(String name, int age) {
        System.out.println("Constructor with two arguments: String and Integer: " + name + " " + age);
    }

    over(long id) {
        System.out.println("Constructor with one argument: Long: " + id);
    }
}

class ex5 {
    public static void main(String[] args) {
        over over1 = new over("Sweta");
        over over2 = new over("Amiya", 28);
        over over4 = new over(325614567L);
    }
}