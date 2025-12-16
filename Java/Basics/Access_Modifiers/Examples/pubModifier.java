package Java.Basics.Access_Modifiers;

class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class pubModifier {
    public static void main(String[] args) {
        System.out.println(MathUtils.add(5, 10));
    }
}
