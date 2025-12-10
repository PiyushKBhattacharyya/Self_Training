# 🐚 Create a Shell Script in Linux  

A **shell** is the interface between the user and the operating system. It accepts commands, interprets them, and passes them to the kernel.  
If you repeatedly run a group of commands, you can save them inside a **shell script** and execute them together — perfect for automation such as backups, monitoring, deployments, etc.

---

# 📝 Creating a Shell Script

### 1️⃣ Step 1: Create a Script File  

Shell scripts typically end with the extension `.sh`.

```bash
touch script.sh
```

---

### 2️⃣ Step 2: Make the Script Executable

```bash
chmod +x script.sh
```

---

### 3️⃣ Step 3: Add Commands into the Script

Open the file using any editor (nano in this example):
```bash
nano script.sh
```
Add commands:
```sh
echo "This is my first shell script"
touch testfile
ls
echo "End of my shell script"
```

---

### 4️⃣ Step 4: Run the Script

```bash
./script.sh
```

✔ All commands inside the script are executed sequentially.

---

# 🗒️ Comments in Shell Scripts

Any line beginning with `#` is treated as a comment and ignored during execution.

Example:
```sh
# This is a comment
echo "Testing comments"
```
> 🔥 Exception: The **shebang** line (`#!/bin/bash`) is NOT a comment — it specifies the script interpreter.

---

# 💾 Variables in Shell Scripts

Shell supports two types of variables:

### 1️⃣ System-defined Variables

Also called **environment variables**. They are usually uppercase.

View all environment variables:
```bash
printenv
```


### 2️⃣ User-defined Variables

Created directly inside the script.

Example:
```sh
# Accessing an environment variable
echo $USER

# User-defined variable
variable_name="Hello World!"
echo $variable_name
```

---

# 🐚 Defining the Script Interpreter (Shebang)

To specify which shell should execute the script:
```sh
#!/bin/bash
```
This must be the **first line** of the script.

Common shells:
| Shell  | Description                          |
| ------ | ------------------------------------ |
| `sh`   | Original Bourne Shell                |
| `bash` | GNU Bourne-Again Shell (most common) |
| `ksh`  | Korn Shell                           |
| `zsh`  | Z Shell                              |

---

# 🔁 Comparison Operators

### 🧮 Integer Comparison

| Operator | Meaning          |
| -------- | ---------------- |
| `-eq`    | is equal to      |
| `-ne`    | is not equal to  |
| `-gt`    | greater than     |
| `-ge`    | greater or equal |
| `-lt`    | less than        |
| `-le`    | less or equal    |

---

### 🔤 String Comparison

| Operator | Meaning               |
| -------- | --------------------- |
| `==`     | equal                 |
| `!=`     | not equal             |
| `\<`     | less (ASCII order)    |
| `\>`     | greater (ASCII order) |

> ⚠ `<` and `>` must be escaped inside `[ ]`.

---

# 🔀 Conditional Statements

### ✔️ If Statement

```sh
if [ condition ]
then
    # statements
fi
```
Example:
```sh
#!/bin/sh
x=10
y=10

if [ $x -ne $y ]
then
    echo "Not equal"
else
    echo "They are equal"
fi
```
> ⚠ IMPORTANT: You **must** put spaces after `[` and before `]`.

---

# 🔄 Loops in Shell Scripts

### 🔁 While Loop

```sh
while [ condition ]
do
    # statements
done
```
Example:
```sh
#!/bin/sh
x=2

while [ $x -lt 6 ]
do
    echo $x
    x=`expr $x + 1`
done
```

---

### 🔁 For Loop

```sh
for var in val1 val2 val3
do
    # statements
done
```
Example:
```sh
#!/bin/sh
for var in 2 4 5 8
do
    echo $var
done
```

---

# 🎯 Positional Arguments

Arguments passed to a script are accessed using `$1`, `$2`, `$3` ...
`$#` → number of arguments
`$0` → script name

Example:
```sh
#!/bin/sh
echo "No of arguments: $#"
echo "Script name: $0"
echo "1st argument: $1"
echo "2nd argument: $2"
```
Run it like:
```bash
./script.sh hello world
```

---

# 📦 Storing Command Output

Two ways to store output:
```sh
var=$(command)
var2=`command`
```
Example:
```sh
b=$(pwd)
c=`pwd`

echo $b
echo $c

d=$(ls /bin | grep bash)
echo $d
```

---

# 🚦 Exit Codes in Shell Scripts

Every command returns an **exit code**:

- `0` → success

- `1–255` → error

Check exit code:
```bash
echo $?
```

---

# ✔️ Manually Setting Exit Codes

```sh
#!/bin/sh
read x

if [ $x -ne 10 ]
then
    echo "failed"
    exit 1
else
    echo "passed"
    exit 0
fi
```