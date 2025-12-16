# 👻 Java Abstraction

Data abstraction is the process of hiding certain details and showing only essential information to the user.

## Abstract Class
- Referenced by `abstract` keyword.
- Cannot be instantiated.
- Can have both abstract and regular methods.

## Abstract Method
- Declared without an implementation (no braces).
- Must be implemented by the subclass.

## Syntax
```java
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}
```
