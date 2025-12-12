# Java Programming Basics

*Last Updated: 20 Aug, 2025*

Java is a **class-based, object-oriented programming language** designed to be secure and portable. Its core philosophy is **WORA (Write Once, Run Anywhere)**, meaning Java code can run on any device with a Java Virtual Machine (JVM).

---

## Java Development Environment

To run Java, you must configure environment variables such as **PATH** and **JAVA_HOME**.

### Components of the Java Environment

* **JVM (Java Virtual Machine):** Executes Java bytecode.
* **JRE (Java Runtime Environment):** JVM + libraries required to run Java programs.
* **JDK (Java Development Kit):** JRE + development tools (compiler, debugger, etc.).

---

## Java Basic Syntax

A simple Java program:

```java
public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("Hello, World");
    }
}
```

### **Output**

```
Hello, World
```

### Explanation

* `public class HelloWorld` – Declares a class.
* `public static void main(String[] args)` – Program entry point.
* `System.out.println()` – Prints output.

---

## Comments in Java

Comments explain the code and are ignored by the compiler.

```java
public class CommentsExample {
    public static void main(String[] args) {
        // Single-line comment
        System.out.println("Hello, World");

        /* Multi-line comment */

        /**
         * Documentation comment (Javadoc)
         */
        int x = 10;
        System.out.println("Value of x: " + x);
    }
}
```

---

## Data Types in Java

### **Primitive Types:**

`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`

### **Non-Primitive Types:**

`String`, arrays, classes, interfaces, objects

```java
public class DataTypesDemo {
    public static void main(String[] args) {
        byte b = 100;
        short s = 30000;
        int i = 100000;
        long l = 10000000000L;

        float f = 3.14f;
        double d = 3.14159265359;

        char c = 'A';
        boolean flag = true;

        String str = "Hello, Java";
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
        System.out.println("String: " + str);
    }
}
```

---

## Variables in Java

### Types of Variables:

* **Local Variables** – inside methods/blocks
* **Instance Variables** – unique to each object
* **Static Variables** – shared across objects
* **Final Variables** – value cannot change

```java
public class VariablesDemo {
    int instanceVar = 10;           // Instance variable
    static String staticVar = "I am static"; // Static variable

    public void showVariables() {
        int localVar = 5; // Local variable
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariablesDemo obj1 = new VariablesDemo();
        obj1.showVariables();

        System.out.println("Accessing Static Variable via class: " + VariablesDemo.staticVar);
    }
}
```

---

## Keywords in Java

Reserved words with predefined meanings.
Examples: `class`, `public`, `static`, `new`, `return`, `private`, `package`, etc.

---

## Operators in Java

Seven categories of operators:

* **Arithmetic**: `+ - * / %`
* **Relational**: `== != > < >= <=`
* **Logical**: `&& || !`
* **Assignment**: `= += -= *= /= %=`
* **Unary**: `++ -- ! + -`
* **Ternary**: `condition ? value1 : value2`
* **Bitwise**: `& | ^ ~ << >> >>>`

```java
public class SimpleOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        // Relational
        System.out.println("a > b ? " + (a > b));

        // Logical
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));

        // Assignment
        a += 5;
        System.out.println("a after += 5 : " + a);

        // Ternary
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
    }
}
```

---

## Decision Making (Control Statements)

Used to execute different code blocks based on conditions.

### Types:

* `if`
* `if-else`
* `if-else-if`
* `switch`

```java
public class DecisionMakingDemo {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }

        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }
    }
}
```

---

## Loops in Java

Four types of loops:

* `for`
* `while`
* `do-while`
* `for-each`

```java
public class LoopsDemo {
    public static void main(String[] args) {

        // For loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // While loop
        System.out.println("While Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // Do-While loop
        System.out.println("Do-While Loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        // For-each loop
        System.out.println("Enhanced For Loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("num = " + num);
        }
    }
}
```

---
