# 🚀 Boot Process with Systemd in Linux

`systemd` is the **first process (PID 1)** started by the Linux kernel.  
It initializes the entire system, manages services, enables parallel booting, and provides powerful tools for analyzing performance.

---

## 🧩 Why Systemd?
- ⚡ **Faster boot** → parallel service startup  
- 🧠 **Smart dependency management**  
- 📦 **On-demand activation** → services start only when needed  
- 🎯 **Replaces runlevels** with systemd *targets* (e.g., `multi-user.target`, `graphical.target`)  
- 🛠️ Provides tools like  
  - `systemctl` → service management  
  - `journalctl` → logging  
  - `systemd-analyze` → boot performance analysis  

---

# ⏱️ Example: Check Boot Time
Shows how long your system took to boot.

Command:
```bash
systemd-analyze time
```

Syntax:
```bash
systemd-analyze [command]
```

Common Commands:
| Command          | Purpose                       |
| ---------------- | ----------------------------- |
| `time`           | Show total boot time          |
| `blame`          | List services by startup time |
| `critical-chain` | View dependency chain         |
| `plot`           | Generate graphical boot chart |

---

# 📊 Analyzing Boot Performance with systemd-analyze

### 🧵 Example 1: View Service Dependency Chain

Command:
```bash
systemd-analyze critical-chain
```

What It Shows:

- The order in which services start

- `@value` → when the service started after boot began

- `+value` → how long the service took to start

Useful for identifying bottlenecks in the dependency tree.

---

### 🐢 Example 2: Identify Slow Services

Command:
```bash
systemd-analyze blame
```

What It Shows:

- Services sorted by startup time (descending)

- Helps detect slow or misbehaving services

Example interpretation:
```
5.163s phpsessionclean.service
```

Meaning: PHP session cleanup took **5.1 seconds** → likely slowing boot.

---

### 📈 Example 3: Generate a Boot Chart (SVG)

Command:
```bash
systemd-analyze plot > boot.svg
```

This creates an SVG file showing:

- Horizontal bars = boot time for each service

- Longer bars = slower units

- Visual map of **time vs system** services

Great for admin-level performance debugging.

---

# 📝 Linux Boot Process Stages (Systemd-based)

| Stage           | Description                                             |
| --------------- | ------------------------------------------------------- |
| **BIOS/UEFI**   | Performs POST, checks CPU, RAM, disks                   |
| **Boot Loader** | GRUB2 loads kernel from disk                            |
| **Kernel**      | Initializes hardware, mounts root filesystem            |
| **Systemd**     | Kernel starts systemd (PID 1), which boots all services |

---