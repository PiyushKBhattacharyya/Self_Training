package Java.Basics.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ex2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("hello");
        Matcher m = p.matcher("hello World");

        while (m.find()) {
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
        }
    }
}