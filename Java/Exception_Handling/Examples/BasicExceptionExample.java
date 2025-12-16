package Exception_Handling.Examples;

public class BasicExceptionExample {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // This will throw an error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        
        System.out.println("Program continues...");
    }
}
