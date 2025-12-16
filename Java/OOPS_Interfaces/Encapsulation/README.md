# 💊 Java Encapsulation

Encapsulation is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
1.  Declare class variables/attributes as `private`.
2.  Provide public `get` and `set` methods to access and update the value of a private variable.

## Benefits
- **Better Control**: strict control over class attributes.
- **Flexibility**: easier to change one part of code without affecting other parts.
- **Security**: Hide implementation details.

## Example
```java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```
