# 🔄 Process States and Transitions in a UNIX Process

A **process** is an instance of a program in execution.  
Multiple processes together form a running program.  
In UNIX, processes fall into two major categories:

- 👤 **User Processes** – executed in user mode  
- 🛡️ **Kernel Processes** – executed in kernel mode  

Understanding process states is fundamental to how UNIX manages multitasking and system resources.

---

# 🧩 UNIX Process States

A process moves through several states during its lifetime. These states describe the process’s behavior and interaction with the CPU and memory.

---

## 1️⃣ User Running
- The process is executing in **user mode**.  
- Only one process can be in this state at any moment.

---

## 2️⃣ Kernel Running
- The process is executing in **kernel mode**.  
- Occurs during system calls, interrupts, or kernel operations.

---

## 3️⃣ Ready to Run (in Memory)
- The process is **ready** and waiting for the CPU scheduler.  
- Multiple processes may be in this state.

---

## 4️⃣ Asleep (in Memory)
- The process cannot proceed because it is waiting for I/O or a resource.  
- It remains in **main memory**.

---

## 5️⃣ Ready to Run, Swapped
- The process is ready but must be swapped **into memory** by the swapper (process 0).  
- This happens when memory is full.

---

## 6️⃣ Sleep, Swapped
- The process is in a **blocked/sleeping** state and has also been swapped out to secondary storage.

---

## 7️⃣ Preempted
- The process was returning from kernel mode to user mode when it was **preempted**.  
- A context switch occurs so another process may run.

---

## 8️⃣ Created
- The process has just been created (e.g., via `fork()`).  
- Exists but is not yet ready to run nor sleeping.  
- All processes except process 0 begin here.

---

## 9️⃣ Zombie 🧟
- The process has finished execution (called `exit()`).  
- It remains in the process table until its parent reads its exit status.  
- Final state before complete cleanup.

---

# 📝 Summary of UNIX Process States

| State | Meaning |
|-------|---------|
| Created | Newly created, not running |
| User Running | Executing in user mode |
| Kernel Running | Executing in kernel mode |
| Ready in Memory | Waiting for CPU in main memory |
| Ready, Swapped | Ready but moved out to swap space |
| Asleep in Memory | Waiting for I/O while in memory |
| Sleep, Swapped | Waiting for I/O but swapped out |
| Preempted | Interrupted while switching to user mode |
| Zombie | Finished, waiting for parent to read status |

---

# 🔁 Process Transitions (Step-by-Step)

Below describes how a process transitions from creation to termination:

1️⃣ **User Running**  
The process executes instructions in user mode.

2️⃣ **Kernel Running**  
System calls or interrupts cause transition to kernel mode.

3️⃣ **Ready to Run in Memory**  
The process is not executing but is waiting in memory to be scheduled.

4️⃣ **Asleep in Memory**  
The process cannot continue and waits for I/O or an event.

5️⃣ **Ready to Run, Swapped**  
If memory is full, a ready process may be swapped to disk until needed.

6️⃣ **Sleep, Swapped**  
A sleeping process may also be swapped out to secondary storage.

7️⃣ **Preempted**  
The kernel interrupts a process returning to user mode to schedule another process.

8️⃣ **Created**  
The initial state for a newly spawned process (via `fork()`).

9️⃣ **Zombie**  
After completing, the process becomes a zombie until its parent collects its exit status using `wait()`.

---

# 🧠 Important Notes

- Only **one** process can be user-running or kernel-running at a given moment.  
- Swapped states occur when memory is low.  
- A zombie does not consume CPU or memory, only a process table entry.  
- The **swapper** (process 0) handles moving processes between memory and disk.

---