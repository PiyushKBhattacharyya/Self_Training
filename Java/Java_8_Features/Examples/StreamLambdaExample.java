package Java_8_Features.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");
        
        System.out.println("Original List: " + names);
        
        // Filter names strictly greater than 4 characters
        List<String> longNames = names.stream()
            .filter(name -> name.length() > 4)
            .collect(Collectors.toList());
            
        System.out.println("Names > 4 chars: " + longNames);
        
        // Map names to uppercase
        List<String> upperNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
            
        System.out.println("Uppercase Names: " + upperNames);
        
        // Iterating using Method Reference
        System.out.println("\nPrinting all names:");
        names.forEach(System.out::println);
    }
}
