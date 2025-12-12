# Arrays in Java

In Java, an **array** is a linear data structure used to store multiple values of the same type in a single variable. Arrays in Java are **objects**, meaning they inherit from the `java.lang.Object` class, giving them access to methods like `toString()`, `equals()`, and `hashCode()`.

Arrays also have a built-in **length** property that stores the number of elements.

---

## Basic Array Example

```java
public class ex1 {
    public static void main(String[] args) {

        int[] arr = {40, 55, 63, 17, 22};  // initializing array
        int n = arr.length;                // size of array

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
```

### Output

```
40 55 63 17 22
```

---

# Key Features of Arrays

* **Store primitives and objects** (e.g., int, char, String, Integer, etc.)
* **Contiguous memory allocation** (for primitives; object references stored contiguously)
* **Zero-based indexing** (first element at index 0)
* **Fixed length** (size cannot change after creation)

---

# Basic Operations on Arrays

## 1. Declaring an Array

```java
int arr[];   // Method 1
int[] arr;   // Method 2
```

This only creates a **reference**. No memory allocated yet.

---

## 2. Initializing an Array

```java
int arr[] = new int[size];
```

* Memory is allocated on the **heap**.
* Default initialization:

  * Numeric → 0
  * Boolean → false
  * Object references → null

### Array Literal

```java
int[] arr = {1,2,3,4,5,6,7,8,9,10};
```

Array size determined automatically.

---

## 3. Changing an Array Element

```java
arr[0] = 90; // change first element
```

---

## 4. Array Length

```java
int n = arr.length;
```

---

## 5. Accessing and Updating All Array Elements

```java
class ex2 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];   // allocating memory

        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 8;
        arr[3] = 12;
        arr[4] = 16;

        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + " : " + arr[i]);
    }
}
```

### Output

```
Element at index 0 : 2
Element at index 1 : 4
Element at index 2 : 8
Element at index 3 : 12
Element at index 4 : 16
```

---

# Arrays of Objects in Java

You can create arrays that store **objects** as well.

### Example

```java
class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ex3 {
    public static void main(String[] args) {

        Student[] arr = new Student[5]; // array of 5 Student objects

        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");

        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { " + arr[i].roll_no + " " + arr[i].name + " }");
    }
}
```

### Output

```
Element at 0 : { 1 aman }
Element at 1 : { 2 vaibhav }
Element at 2 : { 3 shikar }
Element at 3 : { 4 dharmesh }
Element at 4 : { 5 mohit }
```

---

# Accessing Out-of-Bounds Index

If an invalid index is accessed, Java throws **ArrayIndexOutOfBoundsException**.

### Example

```java
public class ex4 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println("Trying to access element outside the size of array");
        System.out.println(arr[5]); // error
    }
}
```

---

# Passing Arrays to Methods

```java
public class ex5 {

    public static void main(String args[]) {
        int arr[] = {3, 1, 2, 5, 4};
        sum(arr); // passing array to method
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }
}
```

### Output

```
sum of array values : 15
```

---

# Returning Arrays from Methods

```java
class ex6 {
    public static void main(String args[]) {
        int arr[] = m1();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] m1() {
        return new int[] {1, 2, 3}; // returning array
    }
}
```

### Output

```
1 2 3
```

---

# Advantages of Java Arrays

* **Fast Access:** O(1) time to access elements
* **Predictable Memory Usage:** Fixed size
* **Structured Data Organization**

---

# Disadvantages of Java Arrays

* **Fixed Size:** Cannot grow or shrink dynamically
* **Type Homogeneity:** Only one data type allowed
* **Costly insertions/deletions:** Shifting required

---