package File_IO.Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Exercise: Log Parser
 * 
 * 1. Create a dummy log file "server.log" with lines containing "INFO", "WARN", "ERROR".
 * 2. Read the file.
 * 3. Filter only lines containing "ERROR".
 * 4. Write these lines to a new file "error_report.txt".
 */

public class LogParserExercise {
    public static void main(String[] args) {
        Path sourceLog = Paths.get("server.log");
        Path errorReport = Paths.get("error_report.txt");
        
        // 1. Setup dummy data
        List<String> logs = new ArrayList<>();
        logs.add("2023-10-01 10:00:00 [INFO] Server started.");
        logs.add("2023-10-01 10:05:00 [WARN] Memory high.");
        logs.add("2023-10-01 10:10:00 [ERROR] Database connection failed.");
        logs.add("2023-10-01 10:15:00 [INFO] Request received.");
        logs.add("2023-10-01 10:20:00 [ERROR] NullPointerException in module X.");
        
        try {
            Files.write(sourceLog, logs);
            System.out.println("Created dummy log file: " + sourceLog);
            
            // 2. Read and Filter
            List<String> allLines = Files.readAllLines(sourceLog);
            List<String> errorLines = allLines.stream()
                .filter(line -> line.contains("[ERROR]"))
                .collect(Collectors.toList());
                
            System.out.println("Found " + errorLines.size() + " errors.");
            
            // 3. Write Report
            Files.write(errorReport, errorLines);
            System.out.println("Error report written to: " + errorReport);
            
            // Verification
            System.out.println("\n--- Report Content ---");
            Files.readAllLines(errorReport).forEach(System.out::println);
            
            // Cleanup
            Files.delete(sourceLog);
            Files.delete(errorReport);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
