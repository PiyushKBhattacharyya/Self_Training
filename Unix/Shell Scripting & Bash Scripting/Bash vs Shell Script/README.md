# 🐚 Difference Between Bash Script and Shell Script

In programming, a **script** is a sequence of instructions executed by another program.  
A **shell** is a command-line interpreter in Linux that acts as a bridge between the user and the kernel.  
A **shell script** is simply a file containing commands that the shell can execute.

---

# 🟩 What is a Bash Script?
A **Bash script** is a text file containing commands written specifically for the **Bash shell** (Bourne Again SHell).  
It may contain:

- Commands  
- Loops  
- Functions  
- Conditionals  
- Variables  
- Arrays  

### ⭐ Features of Bash
- Supports short (`-a`) and long (`--debugger`) command-line options  
- Built-in **key bindings**  
- Supports **one-dimensional arrays**  
- Powerful **control structures**  

### ✔️ Example Bash Script
```bash
#!/bin/bash

myString="var"
echo "myString: $myString"
```

---

# 🟦 What is a Shell Script?

A **shell** is a user program that provides an interface to the OS.
It takes human-readable commands, interprets them, and passes instructions to the kernel.

A **shell script** is a text file containing commands to be executed by any shell, depending on the interpreter defined in the **shebang**.

### Features of Shell

- Wildcard (pattern) matching

- Background processing

- Piping (`|`) to chain commands

- Variable substitution

### ✔️ Example Shell Script
```bash
#!/bin/sh

myString="var"
echo "myString: $myString"
```

---

# 🧾 Table of Differences Between Bash Script and Shell Script

| Sr. No. | Bash Script                                     | Shell Script                                             |
| ------- | ----------------------------------------------- | -------------------------------------------------------- |
| **01**  | Script specifically for **Bash**                | Script that runs on **any shell** (depending on shebang) |
| **02**  | Bash scripting ⬅️ **subset** of shell scripting | Shell scripting = automation using any shell             |
| **03**  | One type of shell script                        | Can be sh, bash, ksh, csh, etc.                          |
| **04**  | Bash = *Bourne Again SHell* by **Brian Fox**    | Original Bourne Shell (`sh`) by **Stephen Bourne**       |
| **05**  | More advanced features than `sh`                | Fewer features than Bash                                 |
| **06**  | Uses: `#!/bin/bash`                             | Uses: `#!/bin/sh`                                        |
| **07**  | More programmer-friendly                        | Less programmer-friendly                                 |

---

# 🏁 Conclusion

While Bash scripts and shell scripts are closely related, they are not the same:

- A Bash script is a specific type of shell script designed for the Bash environment.

- A shell script is a broad term—any script executed by a shell (`sh`, `bash`, `zsh`, `ksh`, `csh`, etc.).

### ✔️ When to use what?

| Use Case                                                | Best Choice           |
| ------------------------------------------------------- | --------------------- |
| Need portability across different Unix systems          | **sh (shell script)** |
| Want modern features (arrays, better syntax, functions) | **Bash script**       |
| Working on Linux systems (default Bash)                 | **Bash script**       |
| Writing simple automation                               | **Shell script**      |

---