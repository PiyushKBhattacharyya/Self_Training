# 🚀 Boot Process with Systemd

Understanding how Linux boots up is crucial for troubleshooting.

## Stages
1.  **BIOS/UEFI**: Hardware initialization.
2.  **Bootloader (GRUB)**: Loads the kernel.
3.  **Kernel**: Mounts root filesystem.
4.  **Init (Systemd)**: Starts user space (PID 1).

## Systemd's Role
Systemd parallelizes service startup, improving boot time significantly compared to SysVinit.