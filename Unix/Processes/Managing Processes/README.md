# 🧩 How to Manage Processes in Linux

A **process** is a program in execution. It takes input, processes it, and produces output.  
Each time you run a command or open an application, Linux creates a process with a unique **PID (Process ID)**.

The **Linux kernel** manages all processes—allocating resources, scheduling CPU time, and ensuring smooth execution.

---

# 🔄 Types of Processes in Linux

## 1️⃣ Foreground Processes (Interactive)
- Initiated by the user directly.
- Take input from the terminal and output to the screen.
- Block the terminal until they finish.
- Example:
```bash
sleep 5
```

## 2️⃣ Background Processes (Non-interactive)
- Run independently of the terminal.
- Do **not** require user input.
- Can be started manually or by the system.
- Allow the user to run other commands while they execute.
- Example:
```bash
sleep 5 &
```

---

# 🔁 Process States in Linux

![Process States](process_state.webp)

A process moves through several states during its lifecycle:

| State | Meaning |
|--------|---------|
| 🟦 **Created** | Process structures are being initialized. |
| 🟧 **Ready** | Waiting for CPU time. |
| 🟩 **Running** | Actively executing instructions. |
| 🟨 **Sleeping** | Waiting for input/resource. |
| ⏸️ **Stopped** | Paused by the user (e.g., `CTRL + Z`). |
| 🧟 **Zombie** | Finished execution but still in process table (parent hasn't read exit status). |
| 👶 **Orphan** | Parent terminated before child; adopted by `init (PID 1)`. |
| ❌ **Terminated** | Finished execution and resources cleaned up. |

---

# 🛠️ Practical Process Management Commands

Below are commonly used commands to manage processes in Linux.

| Command | Description |
|---------|-------------|
| `sleep X` | Run a foreground process |
| `CTRL + Z` | Stop a process temporarily |
| `jobs` | List current job statuses |
| `bg` | Move jobs to background |
| `fg` | Bring job to foreground |
| `ps -ef` | Detailed process listing |
| `nohup` | Run immune to terminal close |
| `nice` | Start process with priority |
| `renice` | Modify priority of running process |
| `top` | Live process monitoring |

