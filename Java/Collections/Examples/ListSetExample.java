package Collections.Examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetExample {
    public static void main(String[] args) {
        // List Example
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Lists allow duplicates
        
        System.out.println("List Elements:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Set Example
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple"); // Set ignores duplicates
        
        System.out.println("\nSet Elements:");
        for(String fruit : uniqueFruits) {
            System.out.println(fruit);
        }
    }
}
