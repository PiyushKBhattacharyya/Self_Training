# 🖥️ Introduction to UNIX

UNIX is a **multitasking** and **multiuser** operating system designed to provide a stable, secure, and efficient computing environment.

---

## ⭐ Key Features

1. **Multiuser System**  
2. **Multitasking Capability**  
3. **Portability**  
4. **Hierarchical File System**  
5. **Security & Permissions**  
6. **Shell & Scripting Support**

---

# 🧱 Layered Structure of UNIX OS

## **🔹 Layer-1: Hardware**
- Represents the physical components of the system such as CPU, memory, storage, and I/O hardware.  
- All system operations depend on this layer as it forms the base of the UNIX architecture.

## **🔹 Layer-2: Kernel**
- The **core** of the UNIX OS that directly interacts with the hardware.  
- Responsible for:
  - Memory management  
  - Process scheduling  
  - Device control  
  - Resource allocation  

## **🔹 Layer-3: System Programs, Commands, and Utilities**
- Includes compilers, text processors, and the shell.  
- Contains UNIX utilities such as **wc, grep, date, who, a.out**, etc.  
- These tools rely on the kernel for text processing, file management, and system monitoring.

## **🔹 Layer-4: Application Layer**
- Includes user-developed or external programs.  
- Uses system utilities and shell services to execute tasks and provide functionality to users.

---

# 🕰️ History of UNIX

1. **Phase-1: Initial Development (1969–1971)**  
   - AT&T Bell Labs  
   - Developed in Assembly language  

2. **Phase-2: Rewritten in C (1973)**  
   - Made UNIX portable and easier to modify  

3. **Phase-3: Expansion & Adoption (Mid 1970s–1980s)**  

4. **Phase-4: Commercialization (1980s–1990s)**  

5. **Phase-5: Influence on Modern OS (1990s–Present)**  
   - Inspired Linux, macOS, BSD variants  

---

# 🔧 Kernel and Block Diagram

![UNIX Kernel Diagram](kernel.jpg)

---

# 🧩 UNIX Architecture Levels

## **🔹 Level-1: User Level**
Contains user programs and applications.  
These request OS services using **system calls**, which behave like normal C functions and are accessed through libraries.

### **System Call & Library Interface**
- Acts as the communication boundary between user programs and the kernel.  
- Ensures safe access to system resources.  
- C programs use library functions; assembly programs can invoke system calls directly.

---

## **🔹 Level-2: Kernel Level**
Handles all core operating system operations.

### **1. File Subsystem**
- Manages file allocation, access permissions, data retrieval, and storage.  
- Provides system calls such as **open, read, write, close, stat, chmod, chown**.

### **2. Buffering & Block I/O**
- Regulates data flow between kernel and storage devices.  
- Uses buffering mechanisms for efficient disk operations.

### **3. Device Drivers**
- Kernel modules controlling hardware components like disks, printers, and terminals.  
- Supports:
  - Buffered block devices  
  - Raw devices (bypass buffering)

### **4. Process Control Subsystem**
- Manages process creation, scheduling, execution, and termination.  
- Allocates CPU time and coordinates with the file subsystem.

---

## **🔹 Level-3: Hardware Level**
- Includes CPU, memory, and I/O devices.  
- Generates **interrupts**, which the kernel must handle while maintaining ongoing operations.

---

# 🔄 Difference Between UNIX and Linux

| **Linux** | **Unix** |
|----------|----------|
| Source code is **open-source** and freely available. | Source code is **proprietary** and not freely available. |
| Supports both **GUI and CLI**. | Primarily **CLI-based**. |
| Highly portable across hardware platforms. | Not as portable. |
| Popular distributions: **Ubuntu, Linux Mint, RHEL, Fedora**. | Variants include **AIX, HP-UX, BSD, Solaris**. |
| Supported file systems: **ext2/3/4, xfs, ramfs, vfat, ntfs**, etc. | Supported file systems: **zfs, xfs, vxfs, hfs**, etc. |
| Created by **Linus Torvalds** in 1991. | Developed at **AT&T Bell Labs** in the late 1960s. |
| Uses a **monolithic kernel**. | Uses a **modular kernel**. |
| Broad hardware support. | Originally designed for large mainframes. |
| UI can be **Graphical or Text-based**. | UI is mostly **Text-based**. |
| CLI examples: **Bash, Zsh, Tcsh**. | CLI examples: **Bourne Shell, Korn Shell, C Shell, Zsh**. |