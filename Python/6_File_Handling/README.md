# 📄 File Handling

## Opening Files
Use `open(filename, mode)`.
- `r`: Read (default).
- `w`: Write (overwrites).
- `a`: Append.

## Context Manager (Recommended)
Automatically closes the file.
```python
with open("file.txt", "w") as f:
    f.write("Hello")
```

## Reading
- `read()`: Entire content.
- `readline()`: Single line.
- `readlines()`: List of lines.
