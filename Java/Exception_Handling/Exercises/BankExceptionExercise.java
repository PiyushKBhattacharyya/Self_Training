package Exception_Handling.Exercises;

/*
 * Exercise: Bank Account Exception
 * 
 * 1. Create a custom exception class named 'InsufficientFundsException'.
 * 2. Create a 'BankAccount' class with a balance.
 * 3. Implement a 'withdraw(double amount)' method.
 * 4. If amount > balance, throw InsufficientFundsException.
 * 5. In main, try to withdraw more than the balance and catch the exception.
 */

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount exceeds balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class BankExceptionExercise {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);

        try {
            System.out.println("Attempting to withdraw $600...");
            account.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
