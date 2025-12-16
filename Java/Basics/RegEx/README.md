# 🧩 Java Regular Expressions (RegEx)

Regular Expressions are a sequence of characters that define a search pattern.

## Key Classes
1.  **Pattern**: Defines a pattern (to be used in a search).
2.  **Matcher**: Used to search for the pattern.
3.  **PatternSyntaxException**: Indicates a syntax error in the regex pattern.

## Syntax
```java
Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
Matcher matcher = pattern.matcher("Visit W3Schools!");
boolean matchFound = matcher.find();
```

## Common Patterns
- `[abc]`: Find a, b, or c.
- `[^abc]`: Find any except a, b, or c.
- `[0-9]`: Find digits 0-9.
- `\s`: Whitespace.
- `\d`: Digit.