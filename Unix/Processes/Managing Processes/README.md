# ⚙️ Managing Processes

In Linux, everything is a file or a process. Managing them is key to administration.

## Key Concepts
1.  **PID (Process ID)**: Unique identifier.
2.  **Foreground vs Background**: 
    - Foreground: Blocks the shell (`command`).
    - Background: Does not block (`command &`).
3.  **Signals**: Ways to communicate with processes (SIGKILL, SIGTERM).

## Commands
- `ps aux`: List all running processes.
- `kill [PID]`: Terminate a process.
- `bg`: Resume suspended job in background.
- `fg`: Bring background job to foreground.
