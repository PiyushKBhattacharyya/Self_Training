# 🚦 Process States

A process changes its state as it executes.

## Core States
1.  **Running (R)**: Currently executing on CPU or ready to execute.
2.  **Sleeping**:
    - **Interruptible (S)**: Waiting for an event.
    - **Uninterruptible (D)**: Waiting for I/O (cannot be killed).
3.  **Stopped (T)**: Suspended (e.g., Ctrl+Z).
4.  **Zombie (Z)**: Terminated but parent hasn't waited for it.

## Viewing States
Use `ps aux` or `top`. The `STAT` column shows the state code.