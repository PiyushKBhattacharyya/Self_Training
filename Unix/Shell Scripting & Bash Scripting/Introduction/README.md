# 🐚 Shell Scripting Introduction

A shell script is a computer program designed to be run by the Unix shell, a command-line interpreter.

## Key Concepts
1.  **Shebang (`#!`)**: The first line of the script that tells the system which interpreter to use (e.g., `#!/bin/bash`).
2.  **Execution**: Scripts need execution permission (`chmod +x script.sh`).
3.  **Comments**: Lines starting with `#` are ignored.

## Simple Example
```bash
#!/bin/bash
# This is a comment
echo "Hello World"
```

## Running a Script
1.  Make executable: `chmod +x script.sh`
2.  Run: `./script.sh`