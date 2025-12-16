package Basics.Strings.Exercises;

/*
 * Exercise: Palindrome Checker
 * 
 * 1. Create a class 'PalindromeCheck'.
 * 2. Write a method isPalindrome(String str).
 * 3. It should return true if the string is same forwards and backwards.
 * 4. Test with "madam", "hello", "racecar".
 */

public class PalindromeCheck {
    
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        System.out.println("madam: " + isPalindrome("madam"));
        System.out.println("hello: " + isPalindrome("hello"));
        System.out.println("racecar: " + isPalindrome("racecar"));
    }
}
