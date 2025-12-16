# 🛠️ Java Methods

A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.

## Syntax
```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}
```

## Key Concepts
1.  **Parameters/Arguments**: Data passed to methods.
2.  **Return Type**: The data type the method returns (`void` if nothing).
3.  **Method Overloading**: Multiple methods with same name but different parameters.
4.  **Scope**: Variables are only accessible inside the region they are created.

## Recursion
Recursion is the technique of making a function call itself.
```java
// Sum from 0 to k
public static int sum(int k) {
  if (k > 0) {
    return k + sum(k - 1);
  } else {
    return 0;
  }
}
```