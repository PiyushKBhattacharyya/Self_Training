# Java Strings

In Java, a **String** is an object that stores a sequence of characters enclosed in double quotes. Each character in a String uses **16-bit UTF encoding**. A string behaves similarly to a character array, but Java provides a rich API for operations like concatenation, comparison, searching, and modification.

Examples:

```java
String name = "Hello";
String num = "1234";
```

---

# Basic String Example

```java
public class ex1 {
    public static void main(String args[]) {
        String str = new String("Hello");
        System.out.println(str);
    }
}
```

### Output

```
Hello
```

---

# Ways of Creating a String in Java

There are **two ways** to create strings:

## 1. **String Literal** (Stored in String Constant Pool)

```java
String str = "GeeksforGeeks";
```

* If the literal already exists in the pool, it **reuses** the same object.
* Saves memory.

## 2. **Using new Keyword** (Stored in Heap Memory)

```java
String s = new String("Welcome");
```

* Creates a **new object** in heap memory.
* Literal is stored separately in the string constant pool.

This creates one object in heap and uses/references literal from pool.

---

# Interfaces and Classes Related to Strings

Java provides multiple classes for handling sequences of characters.

## **CharSequence Interface**

Implemented by:

* **String** (immutable)
* **StringBuffer** (mutable, thread-safe)
* **StringBuilder** (mutable, not thread-safe)

Methods include: `length()`, `charAt()`, `subSequence()`, `toString()`.

---

# 1. String (Immutable)

Once created, String values **cannot be changed**.

```java
String str = "Hello";
String str2 = new String("World");
```

---

# 2. StringBuffer (Mutable & Thread-Safe)

Best for **multithreaded environments**.

```java
StringBuffer demo = new StringBuffer("Hello World!");
```

---

# 3. StringBuilder (Mutable & Faster)

Used in **single-threaded applications**.

```java
StringBuilder demo = new StringBuilder();
demo.append("Hello");
```

---

# 4. StringTokenizer

Used to break a string into tokens.

```java
StringTokenizer st = new StringTokenizer("Java String Example");
```

---

# Immutable String in Java

```java
class ex2 {
    public static void main(String[] args) {
        String s = "Sachin";
        s.concat(" Tendulkar");
        System.out.println(s); // prints Sachin
    }
}
```

### Output

```
Sachin
```

`concat()` creates a new object but `s` still refers to the original.

### Assigning reference explicitly

```java
String name = "Sachin";
name = name.concat(" Tendulkar");
System.out.println(name);
```

Output:

```
Sachin Tendulkar
```

---

# How Strings Are Stored in Memory

## 1. **String Literals → Stored in String Constant Pool**

```java
String str1 = "Hello";
String str2 = "Hello";
```

Both refer to the same object.

## 2. **Using new Keyword → Stored on Heap**

```java
String str1 = new String("John");
String str2 = new String("Deo");
```

Creates new separate objects in heap.

### Storing string in constant pool using `intern()`

```java
String interned = str1.intern();
```

---

# Example Demonstrating String Creation

```java
class ex3 {
    public static void main(String[] args) {
        String name = "Helllo";
        System.out.println("String name = " + name);

        String newString = new String("Hello");
        System.out.println("String newString = " + newString);
    }
}
```

### Output

```
String name = GeeksforGeeks
String newString = GeeksforGeeks
```

---

# String Pool Migration: PermGen → Heap

Earlier, string pool was stored in **PermGen**, which had limited memory (~64MB).
Now, the string pool is stored in the **Heap**, allowing better memory utilization.

Example:

```java
String s1 = "TAT";
String s2 = "TAT";
String s3 = new String("TAT");
String s4 = new String("TAT");
```

All print the same value but refer to different memory locations.

---

# Creating Strings from Byte Arrays

### Example 1

```java
byte ascii[] = {65, 66, 67};
String firstString = new String(ascii);
System.out.println(firstString);

String secondString = new String(ascii, 65, 66);
System.out.println(secondString);
```

### Output

```
ABC
AB
```

---

# Creating Strings from Character Arrays

### Example 2

```java
char characters[] = {'A', 'B', 'C'};
String firstString = new String(characters);
String secondString = new String(firstString);

System.out.println(firstString);
System.out.println(secondString);
```

### Output

```
ABC
ABC
```

---