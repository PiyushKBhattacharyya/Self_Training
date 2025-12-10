# 🐚 Shell Scripting – Shell Variables  
**Last Updated: 17 Nov, 2025**

A **shell variable** is a small container in memory used to store a value — such as a string, number, filename, or command output.  
Variables make shell scripts powerful, flexible, and reusable.

You will use variables to:

- 💾 Store temporary data (e.g., `GREETING="Hello"`).  
- 👤 Hold user input (e.g., `read USER_NAME`).  
- 🖥️ Store command output (e.g., `TODAY=$(date)`).  
- 🔁 Control logic in loops and conditionals.

---

# 🎯 Understanding Variable Types

Shell scripting mainly deals with **three types of variables**:

---

## 1️⃣ Local Variables  
**Scope:** Only inside the current script or shell session.

Example:
```sh
my_var="Hello"
```
Used for general scripting and temporary values.

---

## 2️⃣ Environment Variables 🌍

**Scope:** Available system-wide and inherited by all child processes.

Characteristics:

- Always UPPERCASE

- Used for system configuration

Examples: `PATH`, `HOME`, `USER`, `PWD`

Create one using export:
```sh
export MY_API_KEY="abc-123"
```

---

## 3️⃣ Built-in Shell Variables ⚙️

Automatically set by the shell.

Examples:

| Variable    | Meaning                         |
| ----------- | ------------------------------- |
| `$SHELL`    | Path to shell (`/bin/bash`)     |
| `$HOSTNAME` | Device hostname                 |
| `$?`        | Exit status of last command     |
| `$1`, `$2`  | Positional parameters to script |

---

# ✍️ How to Define Variables

### ✔ Rules

1. ❌ **No spaces** around `=`
```sh
VAR="Hello"   # correct  
VAR = "Hello" # ❌ error
```

2. ✔ Variables are assigned using `=`

3. ✔ Naming rules:
    - Can contain: letters, numbers, `_`
    - Must start with a letter or underscore
    - Convention:
        - local vars → **lowercase**
        - environment vars → **UPPERCASE**

---

# 🧪 Accessing Variables

### 1️⃣ Access a Variable

Use `$` before the variable name.
```sh
#!/bin/bash

VAR_1="Devil"
VAR_2="OWL"

echo "$VAR_1$VAR_2"
```
Output:
```bash
DevilOWL
```

---

### 🗑️ 2️⃣ Unsetting Variables

unset deletes a variable.
```sh
#!/bin/bash

var1="Devil"
var2=23
echo $var1 $var2

unset var1

echo $var1 $var2
```
Output:
```bash
Devil 23
23
```
> 🚫 Note: Read-only variables cannot be unset.

---

### 🔒 3️⃣ Read-Only Variables

```sh
#!/bin/bash
var1="Devil"
var2=23
readonly var1
echo $var1 $var2

var1=23   # ❌ will fail
```
Output:
```bash
Devil 23
./bash1: line 8: var1: readonly variable
Devil 23
```

---

### 🧩 Full Example: All Variable Types in One Script

```sh
#!/bin/bash

# variable definitions
Var_name="Devil"
Var_age=23

# accessing variables
echo "Name is $Var_name, and age is $Var_age."

# read-only variables
var_blood_group="O-"
readonly var_blood_group
echo "Blood group is $var_blood_group and read only."
echo "Trying to modify read-only variable now:"
var_blood_group="B+"     # error

# unsetting variables
unset Var_age
echo "After unsetting var_age..."
echo "Name is $Var_name, blood group is $var_blood_group and age is $Var_age..."
```

---

# 📘 Sample Programs

---

### 🧮 Example: Area of Rectangle

```sh
#!/bin/bash
echo "Enter the length of the rectangle"
read length

echo "Enter the width of the rectangle"
read width

area=$((length * width))
echo "The area of the rectangle is: $area"
```
- `read` → gets input
- `$((..))` → arithmetic operations

---

### ⏰ Example: Display Message Based on Time

```sh
#!/bin/bash
time=$(date +%H)

if [ $time -lt 12 ]; then
    message="Good Morning User"
elif [ $time -lt 18 ]; then
    message="Good Afternoon User"
else
    message="Good Evening User"
fi

echo "$message"
```

- 🌞 Before 12 → Good Morning
- 🌤️ Before 18 → Good Afternoon
- 🌙 Otherwise → Good Evening

---

# 🐚 What is Shell & Its Types?

A shell is a program providing a user interface to the OS.

### Common Shell Types:

- **sh** — Original Bourne Shell

- **csh** — C-like syntax

- **bash** — Most popular on Linux/macOS

- **zsh** — Modern shell with plugins

- **ksh** — KornShell

---

# 📝 Shell Commands Cheat Sheet

| Syntax              | What It Does                 |
| ------------------- | ---------------------------- |
| `MY_VAR="value"`    | Define variable (no spaces!) |
| `echo "$MY_VAR"`    | Safe variable expansion      |
| `echo '$MY_VAR'`    | Print literal string         |
| `echo $MY_VAR`      | Expands, but word-splits     |
| `NOW=$(command)`    | Store command output         |
| `read -p "Q: " VAR` | Take user input              |
| `readonly VAR`      | Make variable read-only      |
| `unset VAR`         | Delete variable              |
| `export VAR`        | Create environment variable  |
| `$?, $1`            | Exit status, script args     |

---