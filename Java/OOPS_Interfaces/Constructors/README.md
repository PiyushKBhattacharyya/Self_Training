# Java Constructors

A **constructor** in Java is a special member of a class that is invoked automatically when an object is created. Its main purpose is to **initialize the object's state**.

### Key Features of Constructors

* Has the **same name** as the class.
* **No return type**, not even `void`.
* Can accept **parameters**.
* Called automatically when an object is created.

---

# Types of Constructors in Java

Java supports **four types** of constructors:

1. Default Constructor
2. Parameterized Constructor
3. Copy Constructor
4. Private Constructor

---

# 1. Default Constructor

A constructor with **no parameters**. If you don’t create any constructor, Java creates one automatically.

### Example:

```java
class ex1 {
    // Default Constructor
    ex1() {
        System.out.println("Default constructor");
    }

    public static void main(String[] args) {
        ex1 hello = new ex1();
    }
}
```

### Output

```
Default constructor
```

**Note:** Java provides a default constructor only when no user-defined constructor exists.

---

# 2. Parameterized Constructor

Used to initialize object fields with **user-defined values**.

### Example:

```java
class ex2 {
    String name;
    int id;

    // Parameterized Constructor
    ex2 (String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("GeekName: " + name + " and GeekId: " + id);
    }

    public static void main(String[] args) {
        ex2 ex2 = new ex2("Sweta", 68);
        ex2.display();
    }
}
```

### Output

```
GeekName: Sweta and GeekId: 68
```

---

# 3. Copy Constructor

Java does **not** have a built-in copy constructor, but you can create your own.

### Example:

```java
class copycons {
    String name;
    int id;

    copycons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    copycons(copycons obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

class ex3 {
    public static void main(String[] args) {
        System.out.println("First Object");
        copycons cons1 = new copycons("Sweta", 68);
        System.out.println("Name: " + cons1.name + " and Id: " + cons1.id);

        System.out.println();

        copycons cons2 = new copycons(cons1); // Copy constructor invoked
        System.out.println("Copy Constructor used Second Object");
        System.out.println("Name: " + cons2.name + " and Id: " + cons2.id);
    }
}
```

### Output

```
First Object
Name: Sweta and Id: 68

Copy Constructor used Second Object
Name: Sweta and Id: 68
```

---

# 4. Private Constructor

Prevents object creation from outside the class.

Used in:

* **Singleton Pattern**
* Utility classes (only static methods)

### Example:

```java
class pvt {
    private pvt() {
        System.out.println("Private constructor called");
    }

    public static void displayMessage() {
        System.out.println("Hello from Private class!");
    }
}

class ex4 {
    public static void main(String[] args) {
        // pvt u = new pvt(); // ❌ Error
        pvt.displayMessage();
    }
}
```

### Output

```
Hello from GFG class!
```

---

# Constructor Overloading

Constructor overloading means having **multiple constructors** with different parameter lists in the same class.

### Example:

```java
class over {
    over(String name) {
        System.out.println("Constructor with one argument - String: " + name);
    }

    over(String name, int age) {
        System.out.println("Constructor with two arguments: String and Integer: " + name + " " + age);
    }

    over(long id) {
        System.out.println("Constructor with one argument: Long: " + id);
    }
}

class ex5 {
    public static void main(String[] args) {
        over over1 = new over("Sweta");
        over over2 = new over("Amiya", 28);
        over over4 = new over(325614567L);
    }
}
```

### Output

```
Constructor with one argument - String: Sweta
Constructor with two arguments: String and Integer: Amiya 28
Constructor with one argument: Long: 325614567
```

---