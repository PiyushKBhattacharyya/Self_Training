# Network Configuration and Troubleshooting Commands in Linux

Computers in a network communicate using packets sent between hosts.  
Linux provides several essential commands for network configuration, diagnostics, and troubleshooting.

Below are the major tools used in Linux networking:

---

## 1. ping (Packet Internet Groper)
Tests network connectivity between your system and another host.
- Checks if the destination is reachable.
- Measures round-trip time (RTT).

**Example:**
```bash
ping google.com
```

---

## 2. nslookup
Queries DNS servers to retrieve domain name or IP address information.

**Example:**
```bash
nslookup google.com
```

---

## 3. traceroute
Displays the path packets take to reach a destination.
- Helps identify network delays or failures.

**Example:**
```bash
traceroute google.com
```

---

## 4. host
Simple DNS lookup tool that maps domain names to IP addresses.

**Example:**
```bash
host google.com
```

---

## 5. netstat
Displays network connections, listening ports, routing tables, and interface statistics.

**Example:**
```bash
netstat -tuln
```

---

## 6. arp
Views or modifies the ARP cache.

**Example:**
```bash
arp -a
```

---

## 7. ifconfig
Displays or configures network interfaces.
(Note: Replaced by `ip addr` on modern systems.)

**Example:**
```bash
ifconfig
```

---

## 8. dig
Performs advanced DNS queries and shows detailed DNS records.

**Example:**
```bash
dig google.com
```

---

## 9. route
Displays or edits the system’s routing table.

**Example:**
```bash
route -n
```

---

## 10. ethtool
Displays or modifies network interface driver settings such as speed, duplex mode, and link state.

**Example:**
```bash
ethool eth0
```

---

## 11. hostname
Displays or sets the system hostname.

**Example:**
```bash
hostname
```