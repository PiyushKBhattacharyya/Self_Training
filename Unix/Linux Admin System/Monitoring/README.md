# 🛠️ Monitoring Linux Servers

A Linux system is known for reliability, but a *great system administrator* must continuously monitor system behavior, resource usage, and detect issues early.  
This guide explains essential Linux tools and methods to monitor:

- Storage usage  
- Memory & CPU loads  
- Network traffic  
- Running processes  
- Logs for outages or failures  

---

# 📦 Storage Space Utilization

Linux provides two important commands for inspecting storage space:

---

## 1️⃣ `df` — Disk-Free (Filesystem Usage)

Displays disk space, inode usage, filesystem size, and mount points.

Example:
```bash
df -hTi
```

This shows:

- Filesystem

- Type

- Size

- Used/Available

- Inode count

- Mount location

---

## 2️⃣ `du` — Disk Usage (Files/Folders Size)

Shows how much space individual files or directories consume.

Example:
```bash
du -sh /path/to/directory
```
Useful for finding space-hogging directories.

---

# Memory & CPU Utilization

Monitoring system performance requires tools that show processes, CPU load, and memory usage.

---

## 1️⃣ `top` — Process & Resource Monitor

`top` is the default Linux task manager.

It displays:

- CPU Usage

- RAM & Swap usage

- Cache size

- Running processes

- PID, User, etc.

Run:
```bash
top
```

---

## 2️⃣ `vmstat` — Virtual Memory Statistics

Shows important system-level data:

- Memory usage

- Processes

- Paging

- Interrupts

- Disk I/O

- CPU scheduling

Example:
```bash
vmstat 5
```

(Updates every 5 seconds)

---

## 3️⃣ `lsof` — List Open Files

Linux treats everything as a file, including:

- Disk files

- Pipes

- Network sockets

- Devices

- Processes

If a filesystem won’t unmount, `lsof` helps identify which process is using it.

Example:
```bash
lsof
```

---

## 4️⃣ `tcpdump` — Network Packet Analyzer

Powerful packet capturing tool used for troubleshooting network issues.

Example:
```bash
tcpdump -i eth0
```

You can also save captured packets:
```bash
tcpdump -w output.pcap
```

---

## 5️⃣ `netstat` — Network Statistics

Used to view:

- Active connections

- Listening ports

- Routing tables

- Interface statistics

Example:
```bash
netstat -tulnp
```

---

# ❓ What Happened? Diagnosing Outages

System outages (power failure, disk failure, network issues) can be planned or unplanned.
The administrator checks logs to understand the cause.

System logs are stored in:
```bash
/var/log
```

Some files are plain text, others are compressed.

---

### 📄 Example: Checking for Printer Errors (CUPS)

```bash
cd /var/log/cups
ls
tail access_log
```

To continuously monitor:
```bash
tail -f error_log
```

---

### 🖥️ Example: Examining Logs for Hardware Failures

Hardware issues are often difficult to diagnose — logs are critical.

Check system messages:
```bash
cd /var/log
ls
sudo cat messages
```

---

# 📘 Important Log Files

| File                | Purpose                 |
| ------------------- | ----------------------- |
| `/var/log/syslog`   | General system logs     |
| `/var/log/messages` | Hardware-related logs   |
| `/var/log/auth.log` | Authentication attempts |
| `/var/log/kern.log` | Kernel events           |
| `/var/log/dmesg`    | Boot and hardware logs  |
| `/var/log/cups/`    | Printer logs            |

---

# 🔍 Viewing System Logs

### Read syslog:

```bash
sudo cat /var/log/syslog
```

### Read kernel ring buffer:

```bash
dmesg
```

Filter only error messages:
```bash
dmesg | grep -i error
```

---

# 🧯 Troubleshooting Summary

| Problem             | Tools to Use                 |
| ------------------- | ---------------------------- |
| Low disk space      | `df`, `du`                   |
| High CPU usage      | `top`, `vmstat`, `htop`      |
| Network issues      | `ping`, `netstat`, `tcpdump` |
| Open file conflicts | `lsof`                       |
| Hardware errors     | `/var/log/messages`, `dmesg` |
| Application failure | `/var/log/<service>/` logs   |

---