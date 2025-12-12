public class SimpleOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        // Relational
        System.out.println("a > b ? " + (a > b));

        // Logical
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));

        // Assignment
        a += 5;
        System.out.println("a after += 5 : " + a);

        // Ternary
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
    }
}