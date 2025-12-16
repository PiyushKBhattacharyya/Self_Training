# 🎭 Java Polymorphism

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

## Types
1.  **Compile-time Polymorphism** (Method Overloading): Same method name, different parameters.
2.  **Runtime Polymorphism** (Method Overriding): Same method name and parameters in subclass.

## Example
```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
```
