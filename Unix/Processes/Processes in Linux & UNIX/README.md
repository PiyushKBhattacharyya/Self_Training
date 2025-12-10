# ⚙️ Processes in Linux/Unix

A **process** is an executing instance of a program.  
Whenever a command is executed in Linux/Unix, the system creates a new process and assigns necessary resources to run it.

Examples:
- Running `pwd` starts a new process.
- Every process gets a unique **PID (Process ID)** — a 5-digit number used by the OS to track it.
- Once a PID is freed, Linux may reuse it for future processes.
- At any time, **no two running processes share the same PID**.

---

# 🟦 Initializing a Process

A process can run in two ways:

---

## 1️⃣ Foreground Process

- Runs by default.
- Receives input from the keyboard.
- Sends output to the terminal.
- The terminal is **blocked** until the process finishes.

Example:
```bash
pwd
```
Output:
```bash
file
```

You cannot run another command until this finishes.

---

## 2️⃣ Background Process

- Runs independently of the terminal.
- Allows multitasking — you can run other commands simultaneously.
- Does **not** require keyboard input.
- Started using `&` at the end of a command.

Example:
```bash
pwd &
```

Output:
```bash
[1] 2345
```

Where:
- **1** → Job number  
- **2345** → PID of the background job

The shell becomes ready for a new command immediately.

---

# 📌 Tracking Running Processes

## ▶️ `ps` — Process Status

List all running processes:
```bash
ps
```

Full detailed list:
```bash
ps -f
```

Output shows fields like:
- **UID** — User ID  
- **PID** — Process ID  
- **PPID** — Parent Process ID  
- **C** — CPU usage  
- **STIME** — Start time  
- **TTY** — Terminal  
- **TIME** — CPU time used  
- **CMD** — Command that started the process

View a single process by PID:
```bash
ps 19
```

Find PID of a running program:
```bash
pidof <process-name>
```

Other `ps` options:
- `-a` → All users’ processes  
- `-x` → Processes without terminals  
- `-u` → Detailed information  
- `-e` → Extended list

---

# 🛑 Stopping a Process

## 1️⃣ Foreground Process
Press:
CTRL + C

## 2️⃣ Background Process

Find process using:
```bash
ps -f
```

Kill a process:
```bash
kill <pid>
```

If it doesn't stop:
```bash
kill -9 <pid>
```

---

# 🧰 Other Important Process Commands

## 🔹 1. `bg` — Resume Job in Background

```bash
bg %job_id
```

## 🔹 2. `fg` — Bring Job to Foreground

```bash
fg %job_id
```

## 🔹 3. `top` — Live Process Viewer

```bash
top
```

## 🔹 4. `nice` — Start a Process with Priority

```bash
nice -n <value> command
```
Range:  
- `-20` → Highest priority  
- `19` → Lowest priority  

## 🔹 5. `renice` — Change Priority of Running Process

```bash
renice -n <value> <pid>
```

## 🔹 6. `df` — Disk Usage of Filesystems

```bash
df
```


## 🔹 7. `free` — Memory Usage Summary

```bash
free
```


---

# 🧱 Types of Processes in Linux

## 1️⃣ Parent & Child Processes

- Every process is created by another process (its **parent**).
- The new process is the **child**.
- `ps -f` shows both PID and PPID.
- Most user processes are children of the **shell**.

---

## 2️⃣ Zombie & Orphan Processes

### 🧟 Zombie Process
- A process that has finished execution **but remains** in the process table.
- Occurs when the parent hasn't read the child's exit status.
- Uses minimal system resources.

### 👶 Orphan Process
- A child whose parent terminated before it finished.
- Automatically adopted by `init` (PID 1).

---

## 3️⃣ 👻 Daemon Processes

- Background system processes that run continuously.
- Usually run with **root privileges**.
- Do **not** have a terminal (TTY shows `?` in `ps -ef`).
- Examples:  
  - Print daemon  
  - Web server daemon  

They handle system tasks quietly in the background.

---