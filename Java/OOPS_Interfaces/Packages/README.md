# 📦 Java Packages

A package in Java is a mechanism to encapsulate a group of classes, sub-packages, and interfaces. Packages are used for:
- Preventing naming conflicts.
- Making searching/locating and usage of classes, interfaces, enumerations, and annotations easier.
- Providing controlled access (protected and default have package-level access control).

## Types
1.  **Built-in Packages** (e.g., `java.lang`, `java.util`).
2.  **User-defined Packages** (create your own).

## Creating a Package
Use the `package` keyword at the separate top line of the file.
```java
package mypack;
class MyPackageClass { ... }
```

## Compile and Run
`javac -d . MyPackageClass.java`
`java mypack.MyPackageClass`