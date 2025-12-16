# 🧵 Java Strings

In Java, a String is an object that represents a sequence of characters. It is immutable (cannot be changed once created).

## Creation
```java
String s1 = "Hello"; // String Literal (Intern Pool)
String s2 = new String("World"); // Heap Object
```

## Common Methods
- `length()`: Returns length.
- `charAt(index)`: Returns char at index.
- `substring(start, end)`: Returns part of string.
- `indexOf(str)`: Returns index of first occurrence.
- `equals(str)`: Compares content.

## Immutability
When you modify a String, a new object is created.
```java
String s = "Hello";
s.concat(" World"); // "Hello World" is created but lost
s = s.concat(" World"); // Now s points to "Hello World"
```