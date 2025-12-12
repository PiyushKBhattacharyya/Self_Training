package Java.Basics.RegEx;
import java.util.regex.Pattern;

class ex1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("Hello.*", "Hello")); // true
        System.out.println(Pattern.matches("Hello[0-9]+", "Hello12s"));  // false
    }
}