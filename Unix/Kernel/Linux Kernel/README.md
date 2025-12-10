# 🐧 Linux Kernel

## 🔍 What is the Linux Operating System and Kernel?

A **Linux Operating System (OS)** is a software system that manages computer hardware and software resources.  
It provides essential services for applications, ensuring efficient, secure, and stable operation.

The **Kernel** is the **core component** of the OS.  
It acts as an intermediary between hardware and application programs. The kernel:

- Manages and allocates hardware resources (CPU, memory, storage, I/O devices).  
- Ensures processes receive fair and secure access to system resources.  
- Virtualizes hardware to give each process its own isolated environment.  
- Facilitates communication between applications and hardware safely and efficiently.

---

## 🧩 Core Subsystems of the Linux Kernel

### 1. **Process Scheduler**
- Distributes CPU time **fairly and efficiently** among all running processes.  
- Executes tasks based on scheduling algorithms and priority levels.  
- Enables smooth multitasking so multiple processes appear to run simultaneously.

---

### 2. **Memory Management Unit (MMU)**
- Allocates and manages system memory for processes.  
- Provides **separate virtual address spaces** for process isolation and protection.  
- Uses paging, swapping, caching, and segmentation to optimize performance.

---

### 3. **Virtual File System (VFS)**
- Offers a **uniform interface** to access stored data, regardless of file system type.  
- Supports multiple file systems like ext4, xfs, NTFS, FAT, and more.  
- Acts as a bridge between user programs and underlying physical storage devices.

---

### 4. **Networking Unit**
- Manages all network-related operations and protocols (TCP/IP, UDP, routing, sockets).  
- Provides networking APIs that allow applications to communicate over local or remote networks.  
- Handles packet transmission, reception, filtering, and interface management.

---

### 5. **Inter-Process Communication (IPC) Unit**
- Enables processes to communicate and synchronize with each other.  
- Supports various IPC mechanisms, including:  
  - **Pipes & Named Pipes**  
  - **Message Queues**  
  - **Shared Memory**  
  - **Semaphores**  
  - **Signals**  
  - **Sockets**  
- Ensures coordinated communication between processes without conflicts.