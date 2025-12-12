# Java Packages

A **package** in Java is a mechanism to group related classes, interfaces, and sub-packages into a single unit. Packages help organize large applications, avoid naming conflicts, provide access control, and make code modular and maintainable.

## ⭐ Why Use Packages?

* Avoid naming conflicts (classes with same name can exist in different packages)
* Provide access control using public, protected, default
* Enable reusability and modular programming
* Organize large codebases neatly

---

## 📦 Types of Java Packages

1. **Built-in Packages** – provided by Java
2. **User-defined Packages** – created by programmers

---

## 1️⃣ Built-in Packages

Java provides many built-in packages as part of the Java API.

Common Examples:

* **java.lang** – fundamental classes (String, Math, Object). Auto-imported.
* **java.io** – input/output classes (File, InputStream).
* **java.util** – data structures, utilities (ArrayList, Random, Date).
* **java.awt** – GUI components.
* **java.applet** – creating Applets.

### Example: Using `java.util.Random`

```java
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100); // 0–99
        System.out.println("Random number: " + number);
    }
}
```

**Output:**

```
Random number: 59
```

---

## 2️⃣ User-defined Packages

These are packages created by the user.

### Example: Creating a Package

```java
package com.myapp;

public class Helper {
    public static void show() {
        System.out.println("Hello from Helper!");
    }
}
```

### Using It in Another Class

```java
import com.myapp.Helper;

public class Test {
    public static void main(String[] args) {
        Helper.show();
    }
}
```

---

## 📁 Folder Structure for Packages

```
project-folder/
 └── com/
      └── myapp/
            └── Helper.java
```

Package names must match the folder structure.

---

## 📥 Accessing Classes Inside a Package

There are 2 ways to import classes:

### 1️⃣ Import a Single Class

```java
import java.util.Vector;
```

### 2️⃣ Import the Entire Package

```java
import java.util.*;
```

> Note: `*` includes all classes in that package **but not sub-packages**.

    ### Example: Importing `Vector`

    ```java
    import java.util.Vector;

    public class ex2 {
        public ex2() {
            Vector v = new Vector();

            java.util.ArrayList l = new java.util.ArrayList();
            l.add(3);
            l.add(5);
            l.add(7);

            System.out.println(l);
        }

    public static void main(String[] args) {
        new ex2();
    }
}
```

**Output:**

```
[3, 5, 7]
```

---

## 🔐 Access Modifiers and Packages

Packages affect visibility of classes and members:

| Modifier      | Same Class | Same Package | Subclass | Other Package |
| ------------- | ---------- | ------------ | -------- | ------------- |
| **private**   | ✔️         | ❌            | ❌        | ❌             |
| **default**   | ✔️         | ✔️           | ❌        | ❌             |
| **protected** | ✔️         | ✔️           | ✔️       | ❌             |
| **public**    | ✔️         | ✔️           | ✔️       | ✔️            |

Packages combined with access modifiers help enforce security and proper encapsulation.

---