# Classes and Objects in Java

Classes and objects form the **core of Object-Oriented Programming (OOP)** in Java. They help model real‑world entities and structure programs logically.

* A **class** is a blueprint that defines properties and behaviors.
* An **object** is an instance of a class, representing a real entity.

Example: *Dog* → class, *Tommy* → object.

---

# Java Class

A class groups related **fields** (data) and **methods** (functions). Memory for fields is allocated **only when an object is created**.

### Example:

```java
class Student {
    int id;
    String n;

    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Alice");
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}
```

**Output:**

```
10
Alice
```

---

# Java Objects

An **object** is created from a class and contains:

* **State** → field values
* **Behavior** → methods
* **Identity** → unique reference in memory

Objects live on the **heap**, while references live on the **stack**.

---

# Object Instantiation

Declaring an object reference:

```java
Dog tuffy;
```

No object is created yet.

Creating (initializing) the object:

```java
tuffy = new Dog("Tuffy", "Papillon", 5, "White");
```

`new` allocates memory and calls the constructor.

---

# Example: Defining and Using a Class

```java
public class Dog {

    String name;
    String breed;
    int age;
    String color;

    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Name is: " + name + "\nBreed age and color are: " + breed + " " + age + " " + color;
    }

    public static void ex2(String[] args) {
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy);
    }
}
```

**Output:**

```
Name is: tuffy
Breed age and color are: papillon 5 white
```

> **Note:** If no constructor is defined, Java automatically provides a default constructor.

---

# Initializing Objects Using Methods

```java
public class ex3 {
    static String name;
    static float price;

    static void set(String n, float p) {
        name = n;
        price = p;
    }

    static void get() {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String[] args) {
        ex3.set("Visual Studio", 0.0f);
        ex3.get();
    }
}
```

**Output:**

```
Software name is: Visual Studio
Software price is: 0.0
```

---

# Ways to Create Objects in Java

Java supports **four standard approaches**.

## 1. Using `new` keyword (most common)

```java
Test t = new Test();
```

---

## 2. Using Reflection

Used in frameworks (Spring, Hibernate).

```java
class Student { public Student() {} }

public class ex4 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("Student");
            Student s = (Student) c.getDeclaredConstructor().newInstance();
            System.out.println(s);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
```

**Output:**

```
Student@1dbd16a6
```

---

## 3. Using `clone()` method

Creates a copy of an existing object. Class must implement `Cloneable`.

```java
class ex5 implements Cloneable {
    String name = "Hello";

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            ex5 e1 = new ex5();
            ex5 e2 = (ex5) e1.clone();
            System.out.println(e2.name);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
```

**Output:**

```
Hello
```

---

## 4. Using Deserialization

Recreates an object from a saved byte stream.

```java
import java.io.*;

class Student implements Serializable {
    private String name;
    public Student(String name) { this.name = name; }
    public String toString() { return "Student: " + name; }
}

public class ex6 {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(new Student("Alice"));
        } catch (IOException e) { e.printStackTrace(); }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s = (Student) in.readObject();
            System.out.println(s);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
```

**Output:**

```
Student: Alice
```

---

# Using One Reference for Multiple Objects

```java
Test test = new Test();
test = new Test();
```

In inheritance:

```java
Animal obj = new Dog();
obj = new Cat();
```

Objects with no reference become **eligible for garbage collection**.

---

# Anonymous Objects

* Created without a reference.
* Used once and discarded.
* Saves memory for short-lived operations.

Example:

```java
new Dog("Max", "Labrador", 3, "Black").getName();
```

Common in GUI/event-handling scenarios.

---