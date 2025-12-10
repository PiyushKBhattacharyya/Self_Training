# 🔥 iptables Command in Linux

The **iptables** command in Linux is a powerful firewall tool used to manage network traffic and security rules.  
It allows system administrators to:

- Control incoming/outgoing traffic  
- Configure Network Address Translation (NAT)  
- Forward packets  
- Allow/deny traffic based on rules  

iptables is a core part of Linux security and networking, making it an essential tool for managing servers effectively.

---

# 🧱 What are iptables?

iptables is a **command-line interface** used to configure rule sets for the **Netfilter firewall** (IPv4) built into the Linux kernel.

Key terminologies:

| Term | Meaning |
|------|---------|
| **Table** | A collection of chains |
| **Chain** | A collection of rules |
| **Rule** | Condition used to match packets |
| **Target** | Action taken when rule matches (ACCEPT, DROP, QUEUE) |
| **Policy** | Default action if no rules match |

### 🧾 Syntax:
```bash
iptables --table TABLE -A/-C/-D ... CHAIN rule --jump TARGET
```

---

# 🗂️ Tables in iptables

Linux provides **five tables**:

| Table | Purpose |
|-------|---------|
| **filter** | Default table for packet filtering (INPUT, OUTPUT, FORWARD) |
| **nat** | Network Address Translation (PREROUTING, POSTROUTING) |
| **mangle** | Packet modification (TOS, DSCP, marks) |
| **raw** | Exemption from connection tracking |
| **security** | Mandatory Access Control (used with SELinux) |

---

# 🔗 Built-in Chains in iptables

| Chain | Used For |
|--------|-----------|
| **INPUT** | Packets destined for local system |
| **OUTPUT** | Locally generated outgoing packets |
| **FORWARD** | Packets routed through system |
| **PREROUTING** | Modify packets before routing |
| **POSTROUTING** | Modify packets after routing |

---

# 🧰 User-defined Chains (with Examples)

You can create custom chains using options like append, delete, or check.

---

## 1️⃣ `-A` Append Rule
Add a rule at the end of the specified chain.

**Syntax:**
```bash
iptables [-t table] --append [chain] [parameters]
```

**Example:** Drop all incoming packets.
```bash
iptables -t filter --append INPUT -j DROP
```

---

## 2️⃣ `-D` Delete Rule
Delete a rule by chain and rule number.

**Syntax:**
```bash
iptables [-t table] --delete [chain] [rule_number]
```

**Example:** Delete rule 2 from INPUT.
```bash
iptables -t filter --delete INPUT 2
```

---

## 3️⃣ `-C` Check Rule
Check whether a rule exists in a chain.

**Syntax:**
```bash
iptables [-t table] --check [chain] [parameters]
```

**Example:** Check if DROP rule exists.
```bash
iptables -t filter --check INPUT -s 192.168.1.123 -j DROP
```

---

# ⚙️ Common Parameters in iptables

These parameters match packets based on protocol, address, or interface.

---

## 1️⃣ `-p` / `--proto` – Protocol Match  
Protocols include: `tcp`, `udp`, `icmp`, `ssh`, etc.

**Example: Drop all UDP packets**
```bash
iptables -t filter -A INPUT -p udp -j DROP
```

---

## 2️⃣ `-s` / `--source` – Match Source Address  
Used to allow/block packets coming from a specific IP.

**Example: Accept packets from 192.168.1.230**
```bash
iptables -t filter -A INPUT -s 192.168.1.230 -j ACCEPT
```

---

## 3️⃣ `-d` / `--destination` – Match Destination Address  
Used for filtering outgoing packets.

**Example: Drop packets going to 192.168.1.123**
```bash
iptables -t filter -A OUTPUT -d 192.168.1.123 -j DROP
```

---

## 4️⃣ `-i` / `--in-interface` – Match Incoming Interface  

**Example: Drop packets arriving on wlan0**
```bash
iptables -t filter -A INPUT -i wlan0 -j DROP
```

---

## 5️⃣ `-o` / `--out-interface` – Match Outgoing Interface  
Useful for routing and forwarding rules.

---

## 6️⃣ `-j` / `--jump` – Action to Perform  
Defines what happens when a rule matches.

**Example: Drop all forwarded packets**
```bash
iptables -t filter -A FORWARD -j DROP
```

---

# 🧹 Filters of iptables

### 1️⃣ Flush All Rules
```bash
sudo iptables --flush
```

### 2️⃣ Save iptables Rules
```bash
sudo iptables-save
```

### 3️⃣ Restore iptables Rules
```bash
sudo iptables-restore
```
---

# ❓ Why Use iptables in Linux?

- 🔐 **Firewall configuration & security**  
- 🎯 **Selective packet filtering**  
- 🔁 **Network Address Translation (NAT)**  
- 📊 **Logging & monitoring**  
- 🛡️ Protects from unauthorized access and attacks  

---

# 🌟 Benefits of Using iptables

- Strong firewall protection  
- Full control over network traffic  
- Supports detailed packet filtering  
- Enables port forwarding & NAT  
- Helps with security audits via logging  

---

# 🚀 Features of iptables

- **Packet filtering** based on IPs, ports, protocol  
- **NAT support** for private → public IP mapping  
- **Stateful inspection** for tracking connection states  
- **Highly configurable** and scriptable  

---

# 🧩 Use Cases of iptables

- 🔥 **Firewall protection** against external threats  
- 🚦 **Traffic shaping** & QoS  
- 🌐 **Network Address Translation**  
- 🎯 **Port forwarding** to internal servers  

---