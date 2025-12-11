# ⚙️ Systemd and Its Components

`systemd` is a modern **init system** and **service manager** for Linux.  
It replaces the older **sysvinit** and becomes the first user-space process with **PID = 1** during system startup.

---

# ❓ Why Systemd?

Before systemd, Linux used **sysvinit**, which:

- Was the first process started by the kernel  
- Used sequential startup → **slow boot times**  
- Was inflexible for modern systems  
- Remained running to handle shutdown operations  

As systems grew complex, sysvinit struggled with:

- Parallel service startup  
- Reliable dependency tracking  
- Modern hardware & service management  

⭐ **In 2010, systemd was introduced** to offer a faster, more flexible, feature-rich initialization system.

---

# 📥 Installing systemd

Most modern Linux distros ship with systemd **pre-installed**, including:

- Ubuntu  
- Debian  
- Fedora  
- Arch Linux  

### ✔️ Check your systemd version:
```bash
systemctl --version
```

---

# 📦 Manual Installation Steps

## 1️⃣ Download systemd source:

Download from Freedesktop:
```curl
https://www.freedesktop.org/software/systemd/systemd-216.tar.xz
```

---

## 2️⃣ Extract the package:

```bash
tar -xJf systemd-216.tar.xz
```

---

## 3️⃣ Install required dependencies:

```bash
apt-get install gcc intltool gperf glib2-devel
```

---

## 4️⃣ Prepare installation:

```bash
cd systemd-216
pwd
```

---

## 5️⃣ Configure build:

```bash
./configure
```

---

## 6️⃣ Compile and install:

```bash
make install
```

---

# 🧰 Systemd Utilities & Components

Systemd provides several powerful tools:

| Command          | Description                         |
| ---------------- | ----------------------------------- |
| **systemctl**    | Controls systemd services & units   |
| **journalctl**   | Systemd’s logging tool              |
| **hostnamectl**  | Sets hostname                       |
| **localectl**    | Configures locale & keyboard layout |
| **timedatectl**  | Sets system time & timezone         |
| **systemd-cgls** | Displays cgroup hierarchy           |
| **systemadm**    | GUI frontend for systemctl          |

---

# 🛠️ Managing Services with Systemd

### ✔️ List all services:

```bash
systemctl list-units --type=service --all
```

---

### ▶️ Start a service:

```bash
systemctl start service-name
```

---

### ⏹️ Stop a service:

```bash
systemctl stop service-name
```

---

### 🔄 Restart a service:

```bash
systemctl restart service-name
```

### 🔁 Reboot / Shut Down the system:

```bash
systemctl halt
systemctl poweroff
systemctl reboot
```

ℹ️ Exit Codes:

- 0 → Service running

- 1 → Service not running

---