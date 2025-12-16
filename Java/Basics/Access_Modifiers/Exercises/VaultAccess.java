package Basics.Access_Modifiers.Exercises;

/*
 * Exercise: Vault Access
 * 
 * 1. Create a class 'Vault' with a private variable 'secretCode' = 9999.
 * 2. Create a public method 'checkCode(int code)' which returns true if matches.
 * 3. Try to access 'secretCode' directly from a main class (should fail or not be possible in code).
 * 4. Use the public method to verify access.
 */

class Vault {
    private int secretCode = 9999;

    public boolean checkCode(int code) {
        return this.secretCode == code;
    }
}

public class VaultAccess {
    public static void main(String[] args) {
        Vault v = new Vault();
        
        // System.out.println(v.secretCode); // Compilation Error
        
        System.out.println("Trying 1234: " + v.checkCode(1234));
        System.out.println("Trying 9999: " + v.checkCode(9999));
    }
}
