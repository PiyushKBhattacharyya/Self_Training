# 🌱 Beginner’s Guide to Linux System Administration

A **Linux System Administrator** manages essential operations such as installing software, monitoring systems, handling backups, and ensuring that both hardware and software run smoothly.  
Before reading this guide, it is recommended to first review **“What is Linux System Administration?”**

This guide covers the **basic configurations, commands, and tools** needed to start learning Linux System Administration.

---

# ⚙️ Some Basic Configurations

## 🖥️ Set the Hostname
```bash
sudo hostname your_hostname
```

Replace `your_hostname` with the desired system name.

---

## 🕒 Setting the Time Zone

Navigate to the zoneinfo directory and link the appropriate file:
```bash
sudo ln -sf /usr/share/zoneinfo/Kolkata /etc/localtime
```

---

# 📁 File System and Management

Linux treats **everything as a file**, including devices and directories.

### 📌 Common File Management Commands

| Command | Description                |
| ------- | -------------------------- |
| `cd`    | Change current directory   |
| `ls`    | List files and directories |
| `vi`    | Edit files (text editor)   |
| `touch` | Create new files           |
| `nano`  | Simple text editor         |
| `cp`    | Copy files/directories     |
| `mv`    | Move files/directories     |
| `rm`    | Remove files/directories   |
| `fdisk` | Partition disks            |
| `mount` | Mount filesystems          |

---

# 🌐 Networking Commands

Networking is a core skill for every sysadmin. Below are essential networking commands:
| Command      | Description                            |
| ------------ | -------------------------------------- |
| `route`      | View/modify IP routing tables          |
| `ping`       | Test connectivity using ICMP packets   |
| `traceroute` | Trace network packet path              |
| `nslookup`   | Query DNS information                  |
| `ifconfig`   | View/change network interface settings |
| `tracepath`  | Trace path and discover MTU            |
| `ssh`        | Secure remote login                    |
| `telnet`     | Test open ports or connect via Telnet  |
| `curl`       | Transfer data from/to server           |
| `scp`        | Secure copy over network               |
| `w`          | Show logged-in users                   |
| `netcat`     | TCP/UDP networking utility             |
| `nmap`       | Network scan & security auditing       |
| `netstat`    | Show network connections               |
| `ip`         | Configure network interfaces           |

---

# 👤 Managing Users and Groups in Linux

Linux users have a **UID**, and all details are stored in:

- `/etc/passwd` → user info

- `/etc/shadow` → encrypted passwords

### Types of Users:

- Superuser / root

- General users

### User & Group Management Commands

| Command      | Description                 |
| ------------ | --------------------------- |
| `usermod`    | Modify user settings        |
| `useradd`    | Add a new user              |
| `su`, `sudo` | Switch user / run as root   |
| `chage`      | Modify user password expiry |
| `groupdel`   | Delete group                |
| `gpasswd`    | Change group password       |
| `groupmod`   | Modify group settings       |
| `groupadd`   | Add a new group             |

---

# 🛠️ System Diagnostics & Performance Monitoring

Monitoring performance helps troubleshoot issues and improve efficiency.

| Command  | Description                           |
| -------- | ------------------------------------- |
| `top`    | Show running processes                |
| `vmstat` | Display memory, process, I/O details  |
| `lsof`   | List open files                       |
| `htop`   | Interactive process viewer            |
| `iostat` | Monitor I/O device load               |
| `nmon`   | Comprehensive system performance tool |

---

# 📜 Reading and Analyzing Logs

Logs are extremely useful for diagnosing issues.

| Command      | Description                 |
| ------------ | --------------------------- |
| `dmesg`      | Kernel ring buffer messages |
| `tail`       | View end of log files       |
| `journalctl` | Read systemd logs           |

---