# 🧬 Java Inheritance

Inheritance is a mechanism where one class acquires the properties and behaviors of a parent class.

## Key Terms
1.  **Subclass (Child)**: The class that inherits.
2.  **Superclass (Parent)**: The class being inherited from.
3.  **extends**: Keyword used to inherit.

## Syntax
```java
class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.honk();
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
```
