# 🛡️ Configuring Firewalls

Firewalls control incoming and outgoing network traffic based on predetermined security rules.

## Common Tools
- **UFW (Uncomplicated Firewall)**: User-friendly interface for iptables (Ubuntu/Debian).
- **Firewalld**: Dynamic firewall manager (RHEL/CentOS).
- **iptables**: Low-level administration tool.

## UFW Examples
- `sudo ufw enable`: Turn on firewall.
- `sudo ufw allow 22`: Allow SSH.
- `sudo ufw status`: Check status.