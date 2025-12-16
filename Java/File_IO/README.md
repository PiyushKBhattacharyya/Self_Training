# 📂 Java File I/O (NIO)

Java provides powerful APIs for reading and writing files. The **NIO (New I/O)** package (`java.nio.file`) is the modern preferred way over the legacy `java.io` package.

## Key Classes
1.  **Path**: Represents a file system path.
2.  **Files**: Static methods for operating on files and directories.
3.  **Paths**: Factory methods for `Path` instances.

## Common Operations
- **Paths.get("path/to/file")**: Create a Path object.
- **Files.exists(path)**: Check if file exists.
- **Files.createFile(path)**: Create a new empty file.
- **Files.write(path, content)**: Write data to a file.
- **Files.readAllLines(path)**: Read all lines into a List.

## Reading a File (NIO)
```java
Path path = Paths.get("data.txt");
try {
    List<String> lines = Files.readAllLines(path);
    lines.forEach(System.out::println);
} catch (IOException e) {
    e.printStackTrace();
}
```

## Writing to a File
```java
Path path = Paths.get("output.txt");
String content = "Hello, World!";
Files.write(path, content.getBytes());
```
