# Linux Kernel

## What is Linux Operating System and Kernel?

An OS is a software sys that manages the computer that provides some services for computer programs and manages HW and SW.

Kernel is the core component of an OS. It provides a platform for programs and various services to run on top of it. Is acts like a middle layer in General-Purpose Computer that manges the distribution of the computer's HW resources efficiently and fairly among all the various processes. The kernel virtualizes the computer's common HW resources to provide each process with its own virtual resources.

### Linux Core Subsystem of Linux Kernel

1. **Process Scheduler**
- Responsible for fairly distributing the CPU time among all the processes running on the sys simultaneously.

2. **Memory Management Unit (MMU)**
- Responsible for proper distribution  of the memory resources among the various processes running on the sys; also provides seperate virtual address spaces for each of the processes.

3. **Virtual File System (VFS)**
- Responsible for providing a unified interface to access stored data across different filesystems and physical storage media.