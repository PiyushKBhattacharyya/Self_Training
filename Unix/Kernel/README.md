# 🧠 Linux Kernel

The kernel is the core component of an operating system, managing system resources and acting as a bridge between software and hardware.

## Core Responsibilities
1.  **Process Management**: Determining which process can use the CPU for how long.
2.  **Memory Management**: Keeping track of how much memory is used and by what.
3.  **Device Drivers**: Managing hardware devices.
4.  **System Calls**: Interface for applications to talk to the kernel.

## Kernel Space vs User Space
- **Kernel Space**: Where the kernel executes; higher privilege.
- **User Space**: Where user applications run; lower privilege.

## Command
`uname -r`: Print kernel version.
