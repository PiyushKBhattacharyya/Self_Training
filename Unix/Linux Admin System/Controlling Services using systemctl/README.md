# 🛠️ Controlling Services in Linux Using `systemctl`

System services are essential background processes that keep a Linux system functioning smoothly. Using **systemctl**, administrators can easily start, stop, restart, enable, disable, and check the status of services.

This guide explains the key concepts and provides practical examples.

---

# 🚀 What is `systemctl`?
`systemctl` is a command-line tool used to control the **systemd** system and service manager.

```bash
systemctl [command] [unit]
```


- **command** → Action (start, stop, restart, enable, disable, status)
- **unit** → The service (e.g., nginx.service, sshd.service)

👉 Most systemctl operations require **root privileges**, so use `sudo`.

---

# 🧩 What is a Service?
A **service** is a background process that performs specific tasks without user interaction. Examples:

- Apache (`httpd`)
- MySQL (`mysqld`)
- Logging (`rsyslog`)

Services typically start at boot and run continuously.

---

# 👻 What is a Daemon?
A **daemon** is a long-running background process. Many end with **d**:

- `sshd`
- `httpd`
- `crond`

---

# 🏁 What is the Init System?
The **init system** is the first process (PID 1) that starts during boot. It manages system services.

Common init systems:
- SysVinit  
- Upstart  
- systemd (modern Linux default)

---

# 📦 systemd Units
A *unit* is any object managed by systemd:  
services, sockets, timers, devices, mounts, etc.

Examples:
- `nginx.service`
- `ssh.socket`
- `backup.timer`

To list **all** services:
```bash
systemctl list-unit-files --type=service --all
```

---

# ⚙️ `.service` Units in systemd

Service unit files define:

- Description

- ExecStart / ExecStop commands

- Restart behavior

- Dependencies

- Permissions

Stored in:
```bash
/etc/systemd/system/
/lib/systemd/system/
```

---

### 🟢 Start a Service

Syntax:
```bash
sudo systemctl start service.service
```
Example:
```bash
sudo systemctl start mariadb
```

---

### 🔴 Stop a Service

Syntax:
```bash
sudo systemctl stop service.service
```
Example:
```bash
sudo systemctl stop mariadb
```

---

### 🔄 Restart a Service

Syntax:
```bash
sudo systemctl restart service.service
```
Example:
```bash
sudo systemctl restart mariadb
```

---

### 📌 Check Service Status
Syntax:
```bash
sudo systemctl status service.service
```
Example:
```bash
sudo systemctl status mariadb
```

---

### ⚡ Enable a Service (Start at Boot)

Syntax:
```bash
sudo systemctl enable service.service
```
Example:
```bash
sudo systemctl enable mariadb
```

---

### ⛔ Disable a Service (Do NOT Start at Boot)

Syntax:
```bash
sudo systemctl disable service.service
```
Example:
```bash
sudo systemctl disable mariadb
```

---

### 🔁 Reboot / Shut Down System Using systemctl

Reboot:
```bash
sudo systemctl reboot
```
Shut Down:
```bash
sudo systemctl poweroff
```

---

# 📜 Using `journalctl` (View Logs)

`journalctl` displays logs collected by systemd.

Show last 10 log entries:
```bash
journalctl -n 10
```

Show logs for a particular service:
```bash
journalctl -u mariadb.service
```

Follow logs in real-time (like `tail -f`):
```bash
journalctl -f
```

---

# 🔐 Securing a Service Using systemd

Systemd provides strong security options.

### 1️⃣ User & Group Isolation

Run service as a restricted user:
```ini
User=appuser
Group=appgroup
```

### 2️⃣ Private Temporary Directory

```ini
PrivateTmp=true
```

Prevents sharing `/tmp` with other services.

### 3️⃣ Filesystem Protection

```ini
ProtectSystem=full
ProtectHome=true
ReadOnlyPaths=/usr
ReadWritePaths=/var/log/myapp
```

### 4️⃣ Resource Limits

```ini
CPUQuota=20%
MemoryLimit=500M
```

### 5️⃣ Network Restriction

```ini
RestrictAddressFamilies=AF_INET AF_INET6
IPAddressDeny=0.0.0.0/0
IPAddressAllow=192.168.1.0/24
```

### 6️⃣ File Permissions

Use chmod & chown to secure service directories.

### 7️⃣ Updates & Monitoring

Keep system updated and monitor logs with:
```bash
journalctl -u service
```

---

# Summary

`systemctl` provides powerful control over systemd services:
| Task            | Command             |
| --------------- | ------------------- |
| Start service   | `systemctl start`   |
| Stop service    | `systemctl stop`    |
| Restart service | `systemctl restart` |
| Check status    | `systemctl status`  |
| Enable at boot  | `systemctl enable`  |
| Disable at boot | `systemctl disable` |
| View logs       | `journalctl`        |

---