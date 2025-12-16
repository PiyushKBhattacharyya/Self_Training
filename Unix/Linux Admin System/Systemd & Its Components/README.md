# ⚙️ Systemd & Components

Systemd is a system and service manager for Linux operating systems. It is the default init system for most modern distributions.

## Key Features
- **Parallelization**: Starts services in parallel to speed up boot.
- **On-demand activation**: Starts services only when needed.
- **Dependency management**: Handles service dependencies automatically.

## Common Units
1.  **Service**: A system service (e.g., `nginx.service`).
2.  **Target**: A group of units (e.g., `multi-user.target`).
3.  **Mount**: A file system mount point.

## Commands
- `systemctl start [service]`
- `systemctl stop [service]`
- `systemctl enable [service]` (Start on boot)
- `systemctl status [service]`