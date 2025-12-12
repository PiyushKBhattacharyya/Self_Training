# Regular Expressions 

Regular Expressions (**Regex**) provide a powerful way to define string patterns used for validation, searching, and text manipulation. Common applications include:

* Email validation
* Password strength checking
* Parsing logs
* Search and replace operations

Java supports regex through the **java.util.regex** package.

---

## Classes in `java.util.regex`

### **1. Pattern Class**

Represents a compiled regex.

**Key Methods:**

* `compile(String regex)` – Compiles the regex into a Pattern
* `matcher(CharSequence input)` – Creates a Matcher
* `matches(String regex, CharSequence input)` – Full string match
* `split(CharSequence input)` – Splits text based on pattern

**Example:**

```java
import java.util.regex.Pattern;

class ex1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("Hello.*", "Hello")); // true
        System.out.println(Pattern.matches("Hello[0-9]+", "Hello12s"));  // false
    }
}
```

**Output:**

```
true
false
```

---

### **2. Matcher Class**

Performs matching operations on input strings.

**Key Methods:**

* `find()` – Finds next match
* `start()` / `end()` – Match indexes
* `group()` – Extracts matched text
* `matches()` – Validates whole input

**Example:**

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ex2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("hello");
        Matcher m = p.matcher("hello World");

        while (m.find()) {
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
        }
    }
}
```

**Output:**

```
Pattern found from 0 to 4
Pattern found from 8 to 12
```

---

## Regex Character Classes

* `[xyz]` → x, y, or z
* `[^xyz]` → any char except x, y, z
* `[a-zA-Z]` → any letter
* `[a-f[m-t]]` → union of ranges
* `[a-z && [^m-p]]` → intersection (exclude m–p)

**Example:**

```java
System.out.println(Pattern.matches("[a-z]", "g"));      // true
System.out.println(Pattern.matches("[a-zA-Z]", "Gfg")); // false
```

---

## Regex Quantifiers

| Quantifier | Meaning      | Example Matches     |
| ---------- | ------------ | ------------------- |
| `X?`       | 0 or 1 time  | "", "a"             |
| `X+`       | 1+ times     | "a", "aa"           |
| `X*`       | 0+ times     | "", "a", "aa"       |
| `X{n}`     | exactly n    | "aaa"               |
| `X{n,}`    | at least n   | "aa", "aaa"         |
| `X{n,m}`   | n to m times | "aa", "aaa", "aaaa" |

**Example:**

```java
System.out.println(Pattern.matches("\d{4}", "1234")); // true
System.out.println(Pattern.matches("\d{4}", "123"));  // false
System.out.println(Pattern.matches("[a-z]+", "hello")); // true
System.out.println(Pattern.matches("[a-z]+", ""));      // false
System.out.println(Pattern.matches("a*", "aaaa"));      // true
```

---

## Common Regex Patterns in Java

| Pattern | Meaning            |
| ------- | ------------------ |
| `.`     | any character      |
| `\d`    | digit              |
| `\D`    | non-digit          |
| `\s`    | whitespace         |
| `\S`    | non-whitespace     |
| `\w`    | word character     |
| `\W`    | non-word character |
| `\b`    | word boundary      |
| `\B`    | non-word boundary  |

**Example:**

```java
System.out.println(Pattern.matches("\d+", "1234")); // true
System.out.println(Pattern.matches("\D+", "1234")); // false
System.out.println(Pattern.matches("\D+", "Gfg"));  // true
System.out.println(Pattern.matches("\S+", "gfg"));  // true
```

---

## Important Notes

* Use **Pattern.compile()** for reusable patterns.
* `matcher()` runs search operations.
* `Pattern.matches()` checks the entire string.
* `Matcher.find()` locates repeated occurrences.
* Regex is efficient for validation & extraction.

---

# Quiz

### **1. Which class compiles and defines a regex pattern?**

✔️ C: Pattern

### **2. What does `Matcher.find()` do?**

✔️ C: Searches for the next occurrence

### **3. Result of `Pattern.matches("[a-zA-Z]+", "GfgTest")`?**

✔️ B: true

---