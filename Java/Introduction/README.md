# Introduction to Java

Java is a **high-level, object-oriented programming language** developed by Sun Microsystems in 1995. It is widely used for building desktop applications, web applications, Android apps, and enterprise systems.

---

## Features of Java

* **Object-Oriented Programming (OOP):** Supports OOP concepts to create modular, reusable code.
* **Platform Independence:** Java programs can run on any OS with a JVM.
* **Robust and Secure:** Strong memory management and exception handling.
* **Multithreading & Concurrency:** Executes multiple tasks concurrently.
* **Rich API & Standard Libraries:** Extensive built-in libraries.
* **Enterprise & Web Frameworks:** Supports Spring, Hibernate, Struts, etc.
* **Open-Source Libraries:** Huge ecosystem to speed up development.
* **Maintainability & Scalability:** Structured and easy to maintain.

---

## Understanding the "Hello World" Program

The first program in Java usually prints **Hello World**.

```java
// A Java program to print Hello World!
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

### **Output:**

```
Hello World!
```

---

## Explanation of the Hello World Program

1. Write the code in a file named **HelloWorld.java**.
2. The compiler `javac` converts it to bytecode **HelloWorld.class**.
3. The JVM reads the `.class` file.
4. JVM converts the bytecode into binary machine code and executes it.

---

## Comments in Java

Comments help explain code and are ignored during execution.

### **Single-line comment:**

```java
// This is a comment
```

### **Multi-line comment:**

```java
/*
This is a multi-line comment.
Useful for explaining large code sections.
*/
```

---

## Curly Braces and Indentation

Curly braces `{}` define a block of code.

Example:

```java
public class Block{
    public static void main(String[] args) {
        {
            System.out.println("This is inside the block.");
        }

        System.out.println("This is outside the block.");
    }
}
```

* The inner block executes unconditionally.
* `{}` groups multiple statements as a single unit.

---

## Famous Applications Built Using Java

* **Android Apps** – Majority of Android apps
* **Netflix** – Backend and content delivery
* **Amazon** – Backend systems
* **LinkedIn** – High-traffic handling
* **Minecraft** – One of the world’s most popular games
* **Spotify** – Server-side infrastructure
* **Uber** – Trip management backend
* **NASA WorldWind** – Virtual globe software

---

## What Can We Build With Java?

* **Mobile Apps** (Android Studio)
* **Web Apps** (Spring, Spring Boot)
* **Desktop Apps** (JavaFX, Swing)
* **Enterprise Applications** (banking, ERP)
* **Game Development** (LibGDX, jMonkeyEngine)
* **Big Data Tools** (Hadoop, Kafka)
* **IoT Devices**
* **Cloud Applications** (AWS, Azure, GCP)
* **Scientific Tools**

---