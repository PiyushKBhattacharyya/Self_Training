package Java.OOPS_Interfaces.Packages;

import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100); // 0–99
        System.out.println("Random number: " + number);
    }
}