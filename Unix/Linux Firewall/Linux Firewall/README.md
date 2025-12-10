# 🔥 Linux Firewall

Linux is a Unix-like operating system known for its open-source nature, flexibility, and strong security features.  
Released on September 17, 1991, by **Linus Torvalds**, Linux provides both:

- 🖥️ **Command-line interface (CLI)**
- 🪟 **Graphical user interface (GUI)**

One of the most important security components in Linux is its **firewall system**, used to protect the OS from unauthorized access and network attacks.

---

# 🛡️ What is the Linux Firewall (firewalld)?

A **firewall** acts like a virtual security wall that monitors and controls network traffic.  
In Linux, the firewall is managed by a daemon called **Firewalld**, which:

- Controls inbound and outbound network traffic  
- Blocks or allows specific IPs, ports, or services  
- Can dynamically update rules without restarting the service  
- Works with **zones**, which group network interfaces by trust level  

Check whether Firewalld is running:
```bash
sudo systemctl status firewalld
```

If active, the output shows the service running.

---

# 📏 Firewall Rules Overview

Firewall rules help prevent unauthorized access and manage network traffic.  
Below are some common examples.

---

## 🔑 Rule 1: Allow SSH Traffic
Allows remote login using port 22:
```bash
sudo firewall-cmd --zone=public --add-service=ssh --permanent
sudo firewall-cmd --reload
```

---

## 🔌 Rule 2: Allow Incoming Traffic on a Specific Port
Example for TCP port **8080**:
```bash
sudo firewall-cmd --zone=public --add-port=8080/tcp --permanent
sudo firewall-cmd --reload
```

---

## 🚫 Rule 3: Block Incoming Traffic from a Specific IP
Blocks traffic from **192.168.52.1**:
```bash
sudo firewall-cmd --zone=public --add-rich='rule family="ipv4" source address="192.168.52.1" reject'
sudo firewall-cmd --reload
```

---

# 🧱 Types of Linux Firewalls

Linux supports various firewall tools, such as:

- IPCop  
- Shorewall  
- UFW  
- **Iptables (most popular)**  

---

# ⚙️ How Iptables Works

**Iptables** is a Linux-based packet filtering and NAT framework.  
It enables administrators to configure rules that control:

- 📥 Incoming traffic  
- 📤 Outgoing traffic  
- 🔀 Forwarded packets  

A packet entering the system goes through **tables** and **chains** before being accepted, rejected, or dropped.

---

# 🗂️ Types of Iptables Tables

Linux provides **five predefined tables**:

---

## 🛡️ 1. Security Table
Used with tools like **SELinux** for Mandatory Access Control (MAC).  
Built-in chains:
- INPUT  
- FORWARD  
- OUTPUT  
- SECMARK  

---

## ✂️ 2. Mangle Table
Used to modify packet headers (TOS, DSCP, marks).  
Built-in chains:
- PREROUTING  
- POSTROUTING  
- INPUT  
- OUTPUT  
- FORWARD  

---

## 🔁 3. NAT Table (Network Address Translation)
Used for assigning one public IP to multiple devices.  
Built-in chains:
- PREROUTING  
- POSTROUTING  

---

## 🧪 4. Raw Table
Used for low-level packet processing.

---

## 🚦 5. Filter Table (Default Table)
Handles packet filtering.  
Built-in chains:
- INPUT  
- OUTPUT  
- FORWARD  

---

# 🔗 Types of Chains

| Chain | Purpose |
|--------|---------|
| **INPUT** | Handles incoming traffic |
| **OUTPUT** | Handles outgoing traffic |
| **FORWARD** | Handles packets being routed through the system |

---

# 🛠️ Configuring iptables

Install iptables:
```bash
sudo dnf install iptables
```

Basic syntax:
```bash
sudo iptables [option] CHAIN-rule [-j target]
```

---

# 🔧 Common iptables Options

| Option | Meaning |
|--------|----------|
| `-C` | Check rule |
| `-D` | Delete rule |
| `-A` | Append rule |
| `-I` | Insert rule |
| `-L` | List all rules |
| `-v` | Verbose output |
| `-X` | Delete chain |
| `-p` | Protocol |
| `-N` | New chain |
| `-j` | Action (ACCEPT/DROP/REJECT) |
| `-F` | Flush all rules |
| `-s` | Source address |

---

# 🧱 Basic Firewall Policies

| Policy | Meaning |
|--------|----------|
| **DROP** | Block packet silently |
| **ACCEPT** | Allow packet |
| **REJECT** | Block packet with a message |

---

# 🧰 Creating Firewall Rules

---

## 🟩 Allow ICMP (ping) Traffic

```bash
sudo iptables -A INPUT -p icmp -j ACCEPT
```

---

## 🟦 Example Accept Rule

Allow IP `192.168.160.51` to access port 22 (SSH):
```bash
sudo iptables -A INPUT -s 192.168.160.51 -p tcp --dport 22 -j ACCEPT
```

Check rules:
```bash
sudo iptables -L
```

---

## 🟥 Drop Rule Example

Block IP `192.168.160.51`:
```bash
sudo iptables -A INPUT -s 192.168.160.51 -j DROP
```

---

## 🔄 Reset All iptables Rules
```bash
sudo iptables -F
```
---