# 🧊 Java Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

## Properties
1.  **Fixed Size**: Once created, the size of an array cannot be changed.
2.  **Same Type**: All elements must be of the same data type.
3.  **Indexed**: Elements are accessed via an index (starting from 0).

## Syntax
```java
// Declaration and instantiation
int[] myNum = {10, 20, 30, 40};

// Accessing elements
System.out.println(myNum[0]); // Outputs 10

// Change an element
myNum[0] = 50;

// Loop through array
for (int i = 0; i < myNum.length; i++) {
  System.out.println(myNum[i]);
}
```

## Multidimensional Arrays
```java
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2]; // 7
```