# 🐚 Introduction to Linux Shell and Shell Scripting

Interacting with any modern OS — Linux, macOS, or Windows — involves using a **shell**, which interprets and executes commands.  
In Linux, this interaction usually happens through the **terminal**, where users type commands for the shell to process.

Before learning shell scripting, you must understand three core components:

- 🧠 Kernel  
- 🐚 Shell  
- 🖥️ Terminal  

---

# 🧠 Kernel

The **kernel** is the core of the operating system. It has complete control over system resources and manages:

- 📁 File management  
- 🔁 Process management  
- ⌨️ I/O management  
- 🧮 Memory management  
- 🖥️ Device management  

A complete Linux system consists of:

➡️ **Kernel + GNU utilities + libraries + system scripts + installation tools**

---

# 🐚 Shell

A **shell** is a user program that provides an interface to access OS services.

✔️ Accepts human-readable commands  
✔️ Converts them into kernel-understandable instructions  
✔️ Acts as a command interpreter  

A shell starts automatically when a user logs in or opens a terminal.

---

# 🐧 Linux Shell Types

Shells are broadly categorized into:

### 1️⃣ Command Line Shell (CLI)
The user interacts via text commands using tools like:

- **Terminal** (Linux/macOS)  
- **Command Prompt / PowerShell** (Windows)


CLI seems hard at first, but it is extremely powerful.  
You can automate tasks using stored command lists — called **shell scripts** in Linux and **batch files** in Windows.

---

### 2️⃣ Graphical Shell (GUI)
Provides a **graphical interface** to interact with files and applications using:

- Windows  
- Buttons  
- Dialog boxes  

Example: Ubuntu GNOME Desktop  
Users don’t need to type commands for every action.

---

# 🐚 Popular Shells in Linux

| Shell | Description |
|-------|-------------|
| **BASH (Bourne Again Shell)** 🏆 | Default shell in most Linux systems & macOS |
| **CSH (C Shell)** 🧩 | C-like syntax; preferred by C programmers |
| **KSH (Korn Shell)** 📌 | POSIX-compatible; feature-rich |

Each shell performs the same job but has different syntax and built-in features.

---

# 🖥️ Terminal

The **terminal** is the program that provides an interface to the shell.

Functions:
- Allows users to enter commands  
- Displays output  
- Runs long scripts and automation  

To open a terminal:
Search → **"Terminal"** → Open


---

# 🚀 Getting Started With Shell Scripting

In DevOps and system administration, automation is everything.  
Shell scripting enables you to execute multiple commands at once — like a mini-program.

## 📄 What is a Shell Script?

A **shell script** is a file containing commands for the shell to execute.

Typically saved with `.sh` extension:
```makefile
myscript.sh
```

---

# ⭐ Why Use Shell Scripts?

### 1️⃣ Automate Repetitive Tasks  
Backups, cleanup, server setup — everything becomes one command.

### 2️⃣ Reliable & Consistent  
Scripts run the same way every time → fewer human mistakes.

### 3️⃣ Built-in on Linux  
No installation required; shells like Bash are preinstalled.

### 4️⃣ Link Commands Together  
You can pipe (`|`), filter, and chain commands easily.

### 5️⃣ DevOps & System Administration  
Great for:
- Server provisioning  
- Monitoring  
- Cron jobs  
- Deployments  

### 6️⃣ Lightweight & Easy  
No compilation — write and run instantly.

---

# 🧩 Structure of a Shell Script

A shell script contains:

- **Keywords** → `if`, `else`, `break`, etc.  
- **Commands** → `cd`, `echo`, `ls`, `pwd`  
- **Functions**  
- **Control flow** → loops, conditions  

---

# ✨ Example: Shell Script to "Jump" to Any Directory

Often when working deep inside directories, returning to a previous directory requires repeated:
```bash
cd ../../../../
```

Let’s fix that with a script named **jump.sh** 👇

---

## 📜 Script: `jump.sh`

```bash
#!/bin/bash

# A simple bash script to move up to desired directory level directly

function jump()
{
    # original value of Internal Field Separator
    OLDIFS=$IFS

    # setting field separator to "/"
    IFS=/

    # converting working path into array of directories
    path_arr=($PWD)

    # restoring IFS
    IFS=$OLDIFS

    local pos=-1

    for dir in "${path_arr[@]}"
    do
        pos=$[$pos+1]
        if [ "$1" = "$dir" ]; then
            dir_in_path=${#path_arr[@]}
            cwd=$PWD
            limit=$[$dir_in_path-$pos-1]

            for ((i=0; i<limit; i++))
            do
                cwd=$cwd/..
            done

            cd $cwd
            break
        fi
    done
}
```

---

### 🛠️ Step 1: Make Script Executable

```bash
chmod +x path/to/jump.sh
```

---

### Step 2: Add Script to .bashrc for Auto-Loading

`.bashrc` runs automatically when a new Bash session starts.

Add this line:
```bash
echo "source ~/path/to/jump.sh" >> ~/.bashrc
```

Reload terminal → and use the new command:
```bash
jump dir_name
```

---