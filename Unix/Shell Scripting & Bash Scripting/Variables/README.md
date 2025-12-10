# 🐚 Variables  

The **shell** is a command-line interpreter in Linux/Unix that provides an interface between the user and the kernel.  
You can write multiple commands inside a file — a **shell script** — allowing automation of tasks in Linux.

Just like other programming languages, shell scripting also supports **different types of variables**.

---

# 🔠 Types of Variables in Shell Scripting

Shell scripting has **three main types of variables**:

1. **Local Variables**
2. **Global (Environment) Variables**
3. **Shell (System) Variables**

Let’s understand each of them in detail.

---

# 1️⃣ Local Variables

A **local variable** is a variable whose scope is limited **only within a function** or block of code.  
It is not accessible outside that function.

### ✅ Example: Local Variable

```sh
#!/bin/sh

getName() {
    NAME=HELLO   # local variable
    echo "$NAME (from function)"   # valid inside function
}

echo "$NAME - (outside function)"   # invalid here
getName
```
🔍 Output:
```bash
 - (outside function)
HELLO (from function)
```
✔ NAME exists only inside the function.
❌ Calling it outside produces no value.

---

# 2️⃣ Global Variables

A global variable is accessible throughout the entire script, inside or outside functions.

✅ Example: Global Variable
```sh
#!/bin/sh

NAME=HELLO   # global variable

getName() {
    echo "$NAME (from function)"
}

echo "$NAME - (outside function)"
getName
```
🔍 Output:
```bash
HELLO - (outside function)
HELLO (from function)
```
✔ Declaring the variable outside any function makes it global.

---

### 🌍 Making a Global Variable Available to Other Scripts (`export`)

By default, global variables are not passed to child scripts.
To make a variable available outside the current shell, use **export**.

Example with Two Scripts

---

📄 `ex_1.sh`
```sh
#!/bin/sh
NUM=9
echo "ex_1 : The value is $NUM"
export NUM
./ex_1.sh
```

📄 `ex_2.sh`
```sh
#!/bin/sh
echo "ex_2 : The value is $NUM"
```
🔍 Output:
```bash
ex_1 : The value is 9
ex_2 : The value is 9
```
✔ `export NUM` made the variable available to `ex_2.sh`.
If `export` is removed → `NUM` will not be visible to the second script.

---

# 3️⃣ Shell Variables (System Variables)

These are special variables **created and maintained by the shell itself**.
They help the shell function correctly.

💡 They are usually in **uppercase**.

🖥️ View Shell Variables:
```sh
set        # or
env
printenv
```

---

# ⭐ Common Shell Variables

| **Variable**   | **Description**                | **Usage**            |
| -------------- | ------------------------------ | -------------------- |
| `BASH_VERSION` | Shows the Bash version         | `echo $BASH_VERSION` |
| `HOME`         | Home directory of current user | `echo $HOME`         |
| `HOSTNAME`     | System's hostname              | `echo $HOSTNAME`     |
| `USERNAME`     | Currently logged-in username   | `echo $USERNAME`     |

These are automatically set by the shell whenever a session starts.

---

# 🎯 Summary

| Type of Variable         | Scope                       | Set By     | Passed to Child Processes? |
| ------------------------ | --------------------------- | ---------- | -------------------------- |
| **Local Variable**       | Inside function only        | User       | ❌ No                       |
| **Global Variable**      | Entire script               | User       | ❌ No (unless exported)     |
| **Environment Variable** | Shell + all child processes | Shell/User | ✔ Yes                      |

---