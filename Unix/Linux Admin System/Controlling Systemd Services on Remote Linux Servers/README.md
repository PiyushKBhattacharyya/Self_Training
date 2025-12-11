# 🔧 Controlling Systemd Services on a Remote Linux Server

Systemd is a powerful system and service manager for Linux. It replaces traditional SysVinit and supports features like:

- ⚡ Aggressive parallelization
- 🔄 On-demand service activation
- 📦 Snapshot and restore
- 📁 Managing mount and automount points
- 🧠 Dependency-based service control logic
- 🔍 Tracking processes via Linux cgroups

The main tool used to control `systemd` is **systemctl**, which replaces older commands like `chkconfig` and `service`.

Using systemctl, you can manage remote Linux services through SSH without manually logging in.

---

# 🌐 Steps to Control Systemd Services on a Remote Linux Server

---

## ✅ Step 1: Connect to the Remote Server Using systemctl
Use the `--host` or `-H` flag to run systemctl remotely.

First, on the **remote machine**, create a user for managing services:

```bash
sudo useradd --create-home --system systemd-manager
```

---

## 📁 Step 2: Prepare SSH Key Directory

Create the `.ssh` directory for the new user:
```bash
sudo mkdir /home/systemd-manager/.ssh
```

This directory will hold the public key for authentication.

---

## 🛂 Step 3: Install and Configure Polkit (PolicyKit)

Polkit manages permissions for system-level operations.

Install it:
```bash
sudo apt install policykit-1
```

This allows `systemd-manager` to perform controlled systemctl operations remotely.

---

## 🛰️ Step 4: Manage Systemd Services Remotely

Use systemctl with the remote host flag:
```bash
systemctl --host systemd-manager@server.example.org status nginx
```

🎯 This retrieves the nginx service status on the remote machine.

---

## 🔄 Step 5: Perform Additional Remote Operations

Example: reload systemd daemon on the remote server:
```bash
systemctl --host systemd-manager@server.example.org daemon-reload
```

You can also start/stop/enable/disable services remotely:
```bash
systemctl --host systemd-manager@server.example.org start nginx
systemctl --host systemd-manager@server.example.org stop nginx
systemctl --host systemd-manager@server.example.org restart nginx
systemctl --host systemd-manager@server.example.org enable nginx
```

---

## 🚪 Step 6: End the Remote Session

To stop remote systemctl sessions, simply press:
```
Ctrl + C
```

You may also view documentation:
```bash
man systemctl
```

---