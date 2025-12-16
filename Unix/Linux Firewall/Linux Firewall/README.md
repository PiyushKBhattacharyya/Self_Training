# 🔥 Linux Firewall (iptables)

Linux firewalls allow you to configure network traffic rules. `iptables` is the traditional administration tool for IPv4 packet filtering and NAT.

## Key Concepts
1.  **Chains**: Lists of rules (INPUT, OUTPUT, FORWARD).
2.  **Tables**: Categories of functionality (Filter, NAT, Mangle).
3.  **Targets**: What to do if a packet matches (ACCEPT, DROP, REJECT).

## Common Commands
- `iptables -L`: List rules.
- `iptables -A INPUT -p tcp --dport 22 -j ACCEPT`: Allow SSH.
- `iptables -A INPUT -j DROP`: Drop all other traffic.