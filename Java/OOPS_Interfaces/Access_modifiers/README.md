# Access Modifiers in Java

Access modifiers in Java define how class members (variables, methods, constructors) and even classes themselves can be accessed from other parts of the program. They are key to **encapsulation**, **security**, and **modular design**.

Java provides **four types** of access modifiers:

* **private**
* **default** (no keyword)
* **protected**
* **public**

---

# 1. Private Access Modifier

The `private` keyword restricts access to **within the same class only**.

### Example:

```java
class Person {
    private String name;  // private variable

    public void setName(String name) {
        this.name = name; // accessible inside class
    }

    public String getName() {
        return name;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice");

        // System.out.println(p.name); // ❌ Error: private access
        System.out.println(p.getName());
    }
}
```

### Output

```
Alice
```

**Explanation:** Direct access to `name` is not allowed outside the class.

---

# 2. Default (Package-Private) Access Modifier

If no access modifier is specified, Java applies **default access**, meaning the member is accessible **only within the same package**.

### Example:

```java
class Car {
    String model; // default access
}

public class ex2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "Tesla"; // allowed (same package)
        System.out.println(c.model);
    }
}
```

### Output

```
Tesla
```

### Example: Default Class in a Package

```java
// p1/Geeks.java
package p1;

class ex3 { // default class
    void display() {
        System.out.println("Hello World!");
    }
}
```

Attempting access from another package:

```java
// p2/GeeksNew.java
package p2;
import p1.*;

class access {
    public static void main(String[] args) {
        access o = new access();  // ❌ compile-time error
        o.display();
    }
}
```

**Explanation:** Default classes/members are NOT accessible outside the package.

---

# 3. Protected Access Modifier

The `protected` keyword allows access:

* within the same package
* in subclasses (even in different packages)

### Example:

```java
class Vehicle {
    protected int speed;
}

class Bike extends Vehicle {
    void setSpeed(int s) {
        speed = s; // accessible here
    }

    int getSpeed() {
        return speed;
    }
}

public class ex4 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.setSpeed(100);
        System.out.println("Access via subclass method: " + b.getSpeed());

        Vehicle v = new Vehicle();
        System.out.println(v.speed); // allowed only if same package
    }
}
```

### Output

```
Access via subclass method: 100
0
```

**Explanation:** `speed` is accessible in subclasses but **not directly** from unrelated classes in different packages.

---

# 4. Public Access Modifier

Members declared with `public` can be accessed **from anywhere**.

### Example:

```java
class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class ex5 {
    public static void main(String[] args) {
        System.out.println(MathUtils.add(5, 10)); // accessible globally
    }
}
```

### Output

```
15
```

> **Note:** Top-level classes cannot be `private` because private restricts visibility to within an enclosing class.

---

# Comparison Table of Access Modifiers in Java

| Access Modifier | Same Class | Same Package | Subclass (diff package) | Everywhere |
| --------------- | ---------- | ------------ | ----------------------- | ---------- |
| **private**     | ✔️         | ❌            | ❌                       | ❌          |
| **default**     | ✔️         | ✔️           | ❌                       | ❌          |
| **protected**   | ✔️         | ✔️           | ✔️                      | ❌          |
| **public**      | ✔️         | ✔️           | ✔️                      | ✔️         |

---

# When to Use Each Access Modifier

### **Private**

* Use as much as possible for data security.
* Ideal for encapsulation.

### **Default (Package-Private)**

* Use for internal utilities within a package.
* Good for helper classes not meant for external use.

### **Protected**

* Best for inheritance-based designs.
* Common in frameworks, abstract classes, and libraries.

### **Public**

* Use for APIs, services, utilities.
* Methods intended for external access.

---