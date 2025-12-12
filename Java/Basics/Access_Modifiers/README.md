# Access Modifiers in Java

In Java, **access modifiers** define how class members (variables, methods, constructors, and even classes) can be accessed in other parts of the program. They are crucial for **encapsulation, security**, and **code organization**.

Java provides **4 types of access modifiers**:

* `private`
* *default* (no keyword)
* `protected`
* `public`

---

# 1. Private Access Modifier

The `private` keyword restricts access to **within the same class only**.

### Example:

```java
class Person {
    private String name;   // private variable

    public void setName(String name) {
        this.name = name;  // accessible within class
    }

    public String getName() { return name; }
}

public class pvtModifier {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice");

        // p.name;  // ❌ Error: name has private access
        System.out.println(p.getName());
    }
}
```

### Output

```
Alice
```

**Explanation:** Direct access to `name` from outside the class is not allowed. This enforces **encapsulation**.

---

# 2. Default (Package-Private) Access Modifier

If no modifier is specified, Java applies **default access**, meaning the member is accessible **only within the same package**.

### Example:

```java
class Car {
    String model; // default access
}

public class defModifier {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "Tesla"; // accessible in same package
        System.out.println(c.model);
    }
}
```

### Output

```
Tesla
```

### Example: Default class in the same package

```java
// p1/Geeks.java
package p1;

class ex {   // default class
    void display() {
        System.out.println("Hello World!");
    }
}
```

### Trying to access from another package:

```java
// p2/GeeksNew.java
package p2;
import p1.*;

class HelloNew {
    public static void main(String args[]) {
        Hello = new Hello();  // ❌ compile-time error
        o.display();          // cannot access default class from p1
    }
}
```

**Explanation:** Default members are **not accessible outside the package**.

---

# 3. Protected Access Modifier

The `protected` keyword allows access:

* within the same package
* in subclasses (even in different packages)

### Example:

```java
class Vehicle {
    protected int speed;  // protected member
}

class Bike extends Vehicle {
    void setSpeed(int s) {
        speed = s;  // accessible in subclass
    }

    int getSpeed() {
        return speed;
    }
}

public class protModifier {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.setSpeed(100);
        System.out.println("Access via subclass method: " + b.getSpeed());

        Vehicle v = new Vehicle();
        System.out.println(v.speed); // accessible only if same package
    }
}
```

### Output

```
Access via subclass method: 100
0
```

**Explanation:** `speed` is accessible in subclasses but not directly from unrelated classes in other packages.

---

# 4. Public Access Modifier

The `public` keyword allows access **from anywhere in the program**.

### Example:

```java
class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class pubModifier {
    public static void main(String[] args) {
        System.out.println(MathUtils.add(5, 10));
    }
}
```

### Output

```
15
```

**Explanation:** `add()` is globally accessible.

> **Note:** A top-level class cannot be `private` because private would mean "visible only within an enclosing class", which is not applicable.

---

# Comparison Table of Access Modifiers

| Modifier  | Same Class | Same Package | Subclass (Different Package) | Everywhere |
| --------- | ---------- | ------------ | ---------------------------- | ---------- |
| private   | ✔️         | ❌            | ❌                            | ❌          |
| default   | ✔️         | ✔️           | ❌                            | ❌          |
| protected | ✔️         | ✔️           | ✔️                           | ❌          |
| public    | ✔️         | ✔️           | ✔️                           | ✔️         |

---

# When to Use Each Access Modifier

### **Private**

✔ Use as **restrictive as possible** to protect internal data.
✔ Ideal for **encapsulation**, sensitive variables, helper methods.

### **Default (Package-Private)**

✔ Useful for **package-level helpers** or utility classes.

### **Protected**

✔ Best for **inheritance**, framework extensions, or shared base classes.

### **Public**

✔ Use for **APIs**, utility classes, main application interfaces.

---