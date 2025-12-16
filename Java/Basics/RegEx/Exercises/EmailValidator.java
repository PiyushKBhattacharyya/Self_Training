package Basics.RegEx.Exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Exercise: Email Validator
 * 
 * 1. Create a class 'EmailValidator'.
 * 2. Define a regex pattern for a valid email (simplified).
 * 3. Test with: "user@example.com", "invalid-email", "name@domain.co.in".
 */

public class EmailValidator {
    
    // Simple email regex
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static boolean isValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] emails = {"user@example.com", "invalid-email", "name@domain.co.in", "user.name@com"};
        
        for (String e : emails) {
            System.out.println(e + ": " + (isValid(e) ? "Valid" : "Invalid"));
        }
    }
}
