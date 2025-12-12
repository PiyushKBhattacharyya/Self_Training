# Java OOP (Object Oriented Programming) Concepts

Before Object-Oriented Programming (OOP), most programs used a **procedural approach**, where the focus was on step-by-step functions. This created problems in large applications such as poor maintainability and limited reusability.

To overcome these issues, **OOP was introduced**, and Java is built entirely around OOP principles.

## ⭐ Key Features of OOP in Java

* Organizes code into logical units (**classes & objects**)
* Keeps related data and methods together (**encapsulation**)
* Makes code modular, reusable, and scalable
* Provides data security
* Follows **DRY (Don’t Repeat Yourself)**

---

## 🧩 Characteristics of OOP

### 1. **Class**

A **class** is a blueprint or prototype from which objects are created. It defines the properties (variables) and behaviors (methods) that its objects will have.

**Class Syntax includes:**

* Modifiers (public, default)
* Class name (Capitalized by convention)
* Class body `{ }`

### 2. **Object**

An **object** is an instance of a class. It represents a real-world entity.

**Objects have:**

* **State** → attributes/variables
* **Behavior** → methods
* **Identity** → unique reference in memory

Example:

```java
public class ex1 {
    private String name;
    private float salary;

    public ex1(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public float getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSalary(float salary) { this.salary = salary; }

    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        ex1 emp = new ex1("Employee", 10000.0f);
        emp.displayDetails();
    }
}
```

**Output:**

```
Employee: Employee
Salary: 10000.0
```

---

### 3. **Abstraction**

Abstraction hides the implementation details and shows only the essential features.

Achieved through:

* **Interfaces**
* **Abstract classes**

Example:

```java
abstract class Vehicle {
    abstract void accelerate();
    abstract void brake();

    void startEngine() {
        System.out.println("Engine started!");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car: Pressing gas pedal...");
    }

    void brake() {
        System.out.println("Car: Applying brakes...");
    }
}

public class ex2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
    }
}
```

---

### 4. **Encapsulation**

Encapsulation is the wrapping of data and methods into a single unit (class).

* Data is kept **private**.
* Access is provided through **getters and setters**.

Example:

```java
class Employee {
    private int id;
    private String name;

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public String getName() { return name; }
}

public class ex3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Employee");

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}
```

---

### 5. **Inheritance**

Inheritance allows a class (child/subclass) to inherit fields and methods from another class (parent/superclass).

Uses **extends** keyword.

Example:

```java
class Animal {
    void eat() { System.out.println("Animal is eating..."); }
    void sleep() { System.out.println("Animal is sleeping..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog is barking!"); }
}

public class ex4 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}
```

**Output:**

```
Animal is eating...
Animal is sleeping...
Dog is barking!
```

---

### 6. **Polymorphism**

Polymorphism means **many forms**. It allows methods to behave differently based on the runtime object.

Two types:

* **Method Overloading (Compile-time)**
* **Method Overriding (Runtime)**

Example demonstrating both:

```java
class Parent {
    public void func() {
        System.out.println("Parent.func()");
    }

    public void func(int a) {
        System.out.println("Parent.func(int): " + a);
    }
}

class Child extends Parent {
    @Override
    public void func(int a) {
        System.out.println("Child.func(int): " + a);
    }
}

public class ex5 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent obj = new Child();

        parent.func();
        parent.func(10);
        child.func(20);
        obj.func(30);
    }
}
```

**Output:**

```
Parent.func()
Parent.func(int): 10
Child.func(int): 20
Child.func(int): 30
```

---

## ✅ Advantages of OOP over Procedural Programming

* Better code reusability
* Cleaner structure → easier maintenance
* Follows DRY principle
* Faster development using reusable components

## ❌ Disadvantages of OOP

* Harder for beginners
* Not ideal for very small programs
* More memory usage due to object creation
* Debugging complex object interactions can be difficult

---