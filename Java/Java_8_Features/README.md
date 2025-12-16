# ☕ Java 8 Features

Java 8 introduced several groundbreaking features that changed how we write Java code, focusing on functional programming styles.

## Key Features

1.  **Lambda Expressions**: A way to implement a functional interface (an interface with a single abstract method) in a concise way.
    - Syntax: `(parameters) -> expression` or `(parameters) -> { statements; }`
2.  **Functional Interfaces**: An interface with exactly one abstract method.
    - Examples: `Runnable`, `Callable`, `Comparator`, `Consumer`, `Predicate`.
3.  **Stream API**: A sequence of elements supporting sequential and parallel aggregate operations.
    - Operations: `filter`, `map`, `reduce`, `collect`, `forEach`.
4.  **Optional Class**: A container object which may or may not contain a non-null value. Helps avoid `NullPointerException`.
5.  **Default Methods**: Methods in interfaces that have an implementation.

## Stream Example
```java
List<String> list = Arrays.asList("a", "b", "c");
list.stream()
    .filter(s -> s.startsWith("a"))
    .map(String::toUpperCase)
    .forEach(System.out::println);
```
