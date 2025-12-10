# 🔥 Configuring Linux Firewalls

A **Linux firewall** is essential for protecting your system from unauthorized access, cyberattacks, and malicious traffic.  
By configuring firewall rules, you can precisely control which packets enter or leave your system.

Linux provides multiple tools for firewall management, including:

- **iptables**  
- **firewalld**  
- **UFW (Uncomplicated Firewall)**  

This guide teaches all three methods in a clear, practical manner.

---

# 🛡️ What is a Firewall?

A **firewall** is a security system that monitors and controls incoming/outgoing network traffic based on predefined rules.

A firewall helps you:

- Restrict unauthorized access  
- Allow safe and legitimate communication  
- Prevent data breaches  
- Protect from external threats  

Firewalls can be **hardware-based** or **software-based**.

---

# 🔥 Types of Linux Firewalls

### 1️⃣ iptables  
- Most widely used firewall tool  
- Works at **network (Layer 3)** and **transport layer (Layer 4)**  
- Uses rule-based packet filtering  

### 2️⃣ firewalld  
- Dynamic firewall tool  
- Uses **zones** to manage trust levels  
- Common on RHEL, CentOS, Fedora  

### 3️⃣ nftables  
- Modern replacement for iptables  
- More efficient and flexible

---

# ⚙️ How Does a Linux Firewall Work?

A Linux firewall filters network traffic based on:

- **IP Address** (source or destination)  
- **Port Number** (e.g., 22 for SSH, 80 for HTTP)  
- **Protocol** (TCP, UDP, ICMP)  
- **Connection State** (NEW, ESTABLISHED, RELATED)

Packet flow:
- If a packet matches an **allow rule**, it is accepted  
- If it matches a **deny rule**, it is blocked  

> 🔑 **Note:** All commands below require **sudo** privileges.

---

# 🧰 Understanding Firewall Tools

| Tool | Difficulty | Best For | Dynamic Rules | GUI Availability |
|------|------------|----------|----------------|------------------|
| **iptables** | Moderate | Advanced users | ❌ No | ❌ No |
| **firewalld** | Easy | Zone-based management | ✔️ Yes | ✔️ Plugins available |
| **UFW** | Very Easy | Beginners | ⚠️ Limited | ✔️ Gufw GUI |

Other tools include **CSF**, **ClearOS**, and **OPNsense**.

---

# 🧱 Method 1: Configuring Firewall with iptables

iptables uses:
- **Tables** → groups of rules  
- **Chains** → INPUT, OUTPUT, FORWARD  
- **Rules** → conditions + actions  

Rule actions include:

- `ACCEPT` → Allow packet  
- `DROP` → Block silently  
- `REJECT` → Block with message  
- `LOG` → Log packet  
- `JUMP` → Move to another chain  

> 📌 **Important:** iptables checks rules **top → bottom**.

---

## 🔎 Step 1: Check Current Rules
```bash
sudo iptables -L
```

Output columns:

| Column | Meaning |
|--------|---------|
| Target | Action (ACCEPT/DROP) |
| prot | Protocol (TCP/UDP) |
| source | Source IP |
| destination | Destination IP |

---

## 🧹 Step 2: Clear All Rules
```bash
sudo iptables -F
```

---

## ⚙️ Step 3: Change Default Policies
Syntax:
```bash
sudo iptables -P CHAIN ACTION
```

Example: block forwarded traffic
```bash
sudo iptables -P FORWARD DROP
```

---

## 🚫 Step 4: Add a DROP Rule
Block an IP:
```bash
sudo iptables -A INPUT -s 192.168.1.3 -j DROP
```

Meaning:
- `-A INPUT` → Append rule to INPUT chain  
- `-s` → Source IP  
- `-j DROP` → Drop the packet  

---

## ✅ Step 5: Add an ACCEPT Rule (SSH Example)

Syntax:
```bash
sudo iptables -A/-I CHAIN -s IP -p protocol --dport port -j ACTION
```

Example:
```bash
sudo iptables -A INPUT -s 192.168.1.3 -p tcp --dport 22 -j ACCEPT
```

### ❗ Problem:
The DROP rule for the same IP appears **first**, so SSH is still blocked.

### 🛠️ Fix:
Insert the rule at the top:
```bash
sudo iptables -I INPUT -s 192.168.1.3 -p tcp --dport 22 -j ACCEPT
```

---

## ❌ Deleting a Rule
Syntax:
```bash
sudo iptables -D CHAIN RULE_NUMBER
```

Example:
```bash
sudo iptables -D INPUT 1
```

---

## 💾 Step 6: Save iptables Rules (Persistent)
Install:
```bash
sudo apt-get update
sudo apt-get install iptables-persistent
```

Save rules:
```bash
sudo invoke-rc.d iptables-persistent save
```

---

# 🔥 Method 2: Configuring Firewall with firewalld

Uses **zones** to group interfaces by trust level.

---

## 📥 Step 1: Install firewalld
```bash
sudo apt-get install firewalld
sudo systemctl start firewalld
sudo systemctl enable firewalld
```

---

## 🌐 Step 2: Assign Interface to a Zone
Example: assign eth0 to public zone:
```bash
sudo firewall-cmd --zone=public --add-interface=eth0 --permanent
```

---

## 🔓 Step 3: Allow a Service
Allow HTTP:
```bash
sudo firewall-cmd --zone=public --add-service=http --permanent
sudo firewall-cmd --reload
```

---

## 📊 Step 4: View Active Zones & Rules
```bash
sudo firewall-cmd --get-active-zones
sudo firewall-cmd --list-all
```

---

# 🧱 Method 3: Configuring Firewall with UFW (Uncomplicated Firewall)

UFW is beginner-friendly and ideal for personal machines.

---

## ▶️ Step 1: Enable UFW
```bash
sudo ufw enable
```

---

## 🔑 Step 2: Allow Specific Services
Allow SSH:
```bash
sudo ufw allow ssh
```

---

## 🚫 Step 3: Block a Port
Block port 8080:
```bash
sudo ufw deny 8080
```

---

## 📊 Step 4: View Firewall Status
```bash
sudo ufw status
```

---

# ⚠️ Common Mistakes to Avoid

- ❌ Not saving iptables rules  
- ❌ Blocking your own SSH access  
- ❌ Misconfiguring firewalld zones  
- ❌ Overusing DROP rules without testing  

---

# 💡 Tips for Effective Firewall Management

### 1️⃣ Understand Network Requirements  
Allow only necessary services.

### 2️⃣ Enable Logging  
firewalld:
```bash
sudo firewall-cmd --set-log-denied=all
```

iptables:
```bash
-j LOG
```

### 3️⃣ Test Rules  
Use **nmap** to scan for open ports.

### 4️⃣ Automate Configurations  
Use Ansible, scripts, or cloud-init for consistent rules.

---

# ✅ Conclusion

By using iptables, firewalld, or UFW, you can configure a robust firewall for your Linux system.  
Whether you're a beginner or an advanced administrator, understanding firewall rules ensures your system stays safe from unauthorized access and cyber threats.

Regular updates, testing, and monitoring will keep your firewall effective and your system secure.

---