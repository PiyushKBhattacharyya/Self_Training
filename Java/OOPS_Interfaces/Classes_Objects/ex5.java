package Java.OOPS_Interfaces.Classes_Objects;

class ex5 implements Cloneable {
    String name = "Hello";

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            ex5 e1 = new ex5();
            ex5 e2 = (ex5) e1.clone();
            System.out.println(e2.name);
        } catch (Exception e) { e.printStackTrace(); }
    }
}