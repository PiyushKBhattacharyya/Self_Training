# Java Methods

*Last Updated: 07 Oct, 2025*

Java **methods** are blocks of code that perform a specific task. Methods allow code reusability and better organization. All methods in Java must belong to a class. They are similar to functions in other languages and represent the **behavior of objects**.

---

## 📌 Basic Example of a Method

Java program to demonstrate how to create and call a method:

```java
public class Hello
{
    // An example method
    public void printMessage() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        Hello obj = new Hello();  // Create instance
        obj.printMessage();       // Calling the method
    }
}
```

### **Output**

```
Hello!
```

### **Explanation**

* `printMessage()` is a simple method.
* It prints a message and **takes no parameters**.
* It **returns nothing** (`void`).

---

## 🧱 Syntax of a Method

A method consists of:

* **Modifier** → Access level (public, private, etc.)
* **Return Type** → Data type returned (or `void`)
* **Method Name** → camelCase naming
* **Parameters** → Optional inputs
* **Method Body** → The logic

---

## 🎯 Why Use Methods?

* **Code Reusability:** Write once, use many times
* **Modularity:** Divide program into smaller parts
* **Readability:** Easier to understand
* **Maintainability:** Easy to update or debug

---

## 📚 Method Call Stack in Java

Java manages method execution using a **call stack**, a LIFO (Last-In-First-Out) structure.

### **How It Works:**

1. A method is called → a **stack frame** is added.
2. The method executes.
3. The frame is removed → control returns to the caller.

JVM automatically handles this stack.

---

## 📌 Call Stack Example

```java
public class CallStackExample {

    public static void D() {
        float d = 40.5f;
        System.out.println("In Method D");
    }

    public static void C() {
        double c = 30.5;
        System.out.println("In Method C");
    }

    public static void B() {
        int b = 20;
        C(); // Calling C
        System.out.println("In Method B");
    }

    public static void A() {
        int a = 10;
        B(); // Calling B
        System.out.println("In Method A");
    }

    public static void main(String[] args) {
        A(); // Start with function A
        D(); // Then call D
    }
}
```

### **Output**

```
In Method C
In Method B
In Method A
In Method D
```

---

## 🏷️ Types of Methods in Java

### **1. Predefined Method**

Methods already available in Java libraries.

```java
Math.random();  // Returns random value
Math.PI;        // Returns value of π
```

### **2. User-defined Method**

Created by the programmer.

Example methods:

* `sayHello()`
* `Greet()`
* `setName()`

---

## 🛠️ Ways to Create Methods in Java

### **1. Instance Method**

Access using an object.

```java
// Instance Method
void method_name() {
    // body
}
```

### **2. Static Method**

Access using class name.

```java
// Static Method
static void method_name() {
    // body
}
```

---

## ✍️ Method Signature

A method signature includes:

* Method name
* Parameter list (number, type, and order)

> Note: **Return type is NOT part** of the method signature.

Example:

```
max(int x, int y)
```

---

## 🧾 Naming a Method

Rules:

* Should start with a **lowercase verb**
* Multi-word names must follow **camelCase**
* Names must be unique within a class (unless overloading)

---

## 📞 Calling Different Types of Methods

### **1. Calling a User-Defined Method**

```java
class userDefmeth {
    void hello() {
        System.out.println("This is a user-defined method.");
    }

    public static void main(String[] args) {
        userDefmeth obj = new userDefmeth();
        obj.hello();
    }
}
```

**Output:**

```
This is a user-defined method.
```

---

### **2. Calling an Abstract Method**

```java
abstract class absMeth {
    abstract void check(String name);
}

public class abs extends absMeth {
    @Override
    void check(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        abs obj = new abs();
        obj.check("Abstract Method");
    }
}
```

**Output:**

```
GeeksforGeeks
```

---

### **3. Calling Predefined Methods**

```java
public class preMeth {
    public static void main(String[] args) {
        preMeth obj = new preMeth();
        System.out.println(obj.hashCode());
    }
}
```

**Output Example:**

```
1510467688
```

---

### **4. Calling a Static Method**

```java
class Test {
    static void hello() {
        System.out.println("Hello");
    }
}

public class statMeth {
    public static void main(String[] args) {
        Test.hello();
    }
}
```

**Output:**

```
Hello
```

---