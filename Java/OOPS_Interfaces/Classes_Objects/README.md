# 🏭 Classes and Objects

Java is an Object-Oriented Language. Everything differs from classes and objects.

## Key Concepts
1.  **Class**: A blueprint for creating objects.
2.  **Object**: An instance of a class.
3.  **Attributes**: Variables within a class.
4.  **Methods**: Functions within a class.

## Syntax
```java
// Create a Class
public class Car {
  String color = "Red";
  int maxSpeed = 200;
  
  public void drive() {
    System.out.println("Vroom!");
  }
}

// Create an Object
Car myCar = new Car();
System.out.println(myCar.color);
myCar.drive();
```