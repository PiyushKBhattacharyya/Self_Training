# 🔒 Java Access Modifiers

Access modifiers control the visibility of classes, methods, and variables.

## Categories

1.  **Private**: Visible only within the class.
2.  **Default** (no modifier): Visible only within the package.
3.  **Protected**: Visible within package and subclasses.
4.  **Public**: Visible to the world.

## Summary Table

| Modifier    | Class | Package | Subclass | World |
|:------------|:-----:|:-------:|:--------:|:-----:|
| public      |  Yes  |   Yes   |   Yes    |  Yes  |
| protected   |  Yes  |   Yes   |   Yes    |  No   |
| default     |  Yes  |   Yes   |    No    |  No   |
| private     |  Yes  |   No    |    No    |  No   |

## Usage
```java
public class MyClass {
    private int secret = 10;
    public int data = 20;
    
    protected void display() {
        System.out.println(data);
    }
}
```