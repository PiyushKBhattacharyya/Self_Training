# 🔄 Processes in Linux & UNIX

A process is an instance of a running program.

## Types
1.  **User Processes**: Started by users.
2.  **Daemon Processes**: Background services involved in system management.
3.  **Kernel Threads**: Started by kernel for internal tasks.

## The Init Process
- **PID 1**: The first process started by the kernel (Systemd or Init).
- Parent of all other processes (directly or indirectly).