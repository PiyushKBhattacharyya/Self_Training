# 🏗️ Constructors

A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.

## Rules
1.  Constructor name must match the class name.
2.  It cannot have a return type (not even void).
3.  It is called automatically when creating an object.

## Types
1.  **No-Arg Constructor**: Constructor with no parameters.
2.  **Parameterized Constructor**: Constructor with parameters.

## Example
```java
public class MyClass {
  int x;

  // Constructor
  public MyClass(int y) {
    x = y;
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(5);
    System.out.println(myObj.x); // Outputs 5
  }
}
```