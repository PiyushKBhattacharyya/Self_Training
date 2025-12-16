# 💲 Bash Variables

Variables are used to store data that can be used later in the script.

## Types
1.  **System Strings**: Defined by Linux (e.g., `$SHELL`, `$HOME`).
2.  **User Defined**: Defined by users (e.g., `NAME="Pro"`).

## Rules
- Variable names generally in UPPERCASE.
- No spaces around `=`.
- Access using `$`.

## Example
```bash
MY_VAL=100
echo "Value is $MY_VAL"
```