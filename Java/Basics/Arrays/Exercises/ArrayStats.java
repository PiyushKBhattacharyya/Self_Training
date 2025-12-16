package Basics.Arrays.Exercises;

/*
 * Exercise: Array Statistics
 * 
 * 1. Create a class 'ArrayStats'.
 * 2. Define an int array: {20, 30, 25, 35, -16, 60, -100}.
 * 3. Calculate and print the Sum of all elements.
 * 4. Calculate and print the Average of all elements.
 */

public class ArrayStats {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        
        double average = (double) sum / numbers.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
