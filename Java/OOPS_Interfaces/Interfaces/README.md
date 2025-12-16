# 🔌 Java Interfaces

An interface is a completely "abstract class" that is used to group related methods with empty bodies.

## Key Properties
- Interfaces cannot be used to create objects.
- Interface methods do not have a body (Java 8 allows default/static methods).
- Interface variants are `public`, `static`, and `final` by default.
- A class "implements" an interface.

## Syntax
```java
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    System.out.println("Zzz");
  }
}
```

## Multiple Inheritance (via Interfaces)
Java doesn't support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces.
