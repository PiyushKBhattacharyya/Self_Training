package Java.OOPS_Interfaces.Packages;

import java.util.Vector;

public class ex2 {
    public ex2() {
        Vector v = new Vector();

        java.util.ArrayList l = new java.util.ArrayList();
        l.add(3);
        l.add(5);
        l.add(7);

        System.out.println(l);
    }

    public static void main(String[] args) {
        new ex2();
    }
}