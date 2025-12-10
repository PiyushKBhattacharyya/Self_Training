# 🌐 Configuring Network Interfaces in Linux

A **network interface** is a link between a computer and a network (private or public).  
It may be a physical **NIC (Network Interface Card)** or a virtual interface such as:

- `127.0.0.1` (IPv4 loopback)  
- `::1` (IPv6 loopback)

Linux allows configuring network interfaces using:

1. 🖥️ **Command Line Interface (CLI)**
2. 🖼️ **Graphical User Interface (GUI)**

---

# 🔤 Network Interface Naming

Network interfaces may be **physical** or **virtual**.

- 🛠️ Physical interfaces: named based on adapter slot numbers  
- 💻 Virtual interfaces: named using interface name + VLAN ID

**VLAN interface format:**
```bash
<interface-name>.<VLAN-ID>
```

---

# 🏷️ Interface Group Name Rules

Group names must follow:

- ✔️ Must begin with a letter  
- ❌ No spaces allowed  
- 📏 Maximum 15 characters  
- 🔒 Must not duplicate existing interface names  

---

# 🛠️ Method 1: Configuring Network Interfaces via Command Line

Older CentOS versions used **ifcfg** files.  
CentOS 9+ uses **keyfile format** under NetworkManager.

Below is the CentOS 9 process.

---

## 🔍 Step 1: List All Network Devices

```bash
nmcli d
```

---

## 📂 Step 2: Navigate to Network Configuration Directory

```bash
cd /etc/NetworkManager/system-connections
```

This directory holds all keyfile-based network configurations.

---

## ⚙️ Step 3: Configure the Network Interface

Below commands assume the interface name is **enp0s3**.

### 🟦 A. Set IPv4 Address

```bash
nmcli connection modify enp0s3 ipv4.addresses 10.0.2.15
```

### 🟧 B. Set Gateway

```bash
nmcli connection modify enp0s3 ipv4.gateway 10.0.2.2
```

### 🟩 C. Set DNS Server(s)

Single DNS:
```bash
nmcli connection modify enp0s3 ipv4.dns 8.8.8.8
```

Multiple DNS:
```bash
nmcli connection modify enp0s3 ipv4.dns "8.8.8.8 8.8.4.4"
```

### 🟨 D. Set Mode (Static or DHCP)

Static IP:
```bash
nmcli connection modify enp0s3 ipv4.method manual
```

DHCP:
```bash
nmcli connection modify enp0s3 ipv4.method auto
```

---

## 🔄 Step 4: Restart the Connection

```bash
nmcli connection down enp0s3
nmcli connection up enp0s3
```

---

## ✅ Step 5: Verify the Configuration

```bash
nmcli device show enp0s3
```

---

# 🖼️ Method 2: Configuring Network Interfaces via GUI (nmtui)

If **nmtui** is not installed:
```bash
sudo yum -y install NetworkManager-tui
```

---

## 🧭 Step 1: Launch Network Manager

```bash
nmtui
```

A menu window opens.

---

## 📝 Step 2: Edit a Connection

Choose the interface you want to configure.

---

## 🌐 Step 3: Add Network Information

- Set **Manual** → Static IP  
- Set **Automatic** → DHCP  

Enter IP, gateway, DNS, etc.

---

## ☑️ Step 4: Enable Essential Options

Ensure the following boxes are checked:

- Automatically connect  
- Available to all users  
- Correct IPv4/IPv6 settings  

---

## 🔁 Step 5: Save, Exit, and Restart Network Service

```bash
service network restart
```
This applies all changes.