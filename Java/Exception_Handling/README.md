# ⚠️ Java Exception Handling

Exception handling in Java allows you to handle runtime errors so that the normal flow of the application can be maintained.

## Key Concepts

1.  **Exception**: An event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
2.  **Try-Catch Block**: Used to enclose the code that might throw an exception.
3.  **Finally Block**: Used to execute important code such as closing connections, etc.
4.  **Throw**: Used to explicitly throw an exception.
5.  **Throws**: Used to declare an exception.

## Hierarchy
- `Throwable`
    - `Error` (e.g., StackOverflowError - usually unrecoverable)
    - `Exception`
        - `RuntimeException` (Unchecked - e.g., NullPointerException)
        - Other Exceptions (Checked - e.g., IOException)

## Common Exceptions
- `ArithmeticException`
- `NullPointerException`
- `ArrayIndexOutOfBoundsException`
- `FileNotFoundException`

## Syntax
```java
try {
    // Code that may throw an exception
} catch (ExceptionTypeName e) {
    // Catch block
} finally {
    // The finally block always executes
}
```
