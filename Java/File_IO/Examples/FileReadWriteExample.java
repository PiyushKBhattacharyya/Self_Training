package File_IO.Examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileReadWriteExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("example_file.txt");
        List<String> contentToAdd = Arrays.asList("Line 1: Hello", "Line 2: Java I/O", "Line 3: End");

        try {
            // Write to file
            System.out.println("Writing to file: " + filePath.toAbsolutePath());
            Files.write(filePath, contentToAdd);
            
            // Read from file
            System.out.println("\nReading from file:");
            if (Files.exists(filePath)) {
                List<String> lines = Files.readAllLines(filePath);
                lines.forEach(System.out::println);
            } else {
                System.out.println("File does not exist.");
            }
            
            // Cleanup (Optional)
            Files.delete(filePath);
            System.out.println("\nFile deleted.");
            
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
