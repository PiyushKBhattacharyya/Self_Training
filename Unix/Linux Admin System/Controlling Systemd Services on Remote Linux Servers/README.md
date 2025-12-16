# 📡 Controlling Remote Services

Systemctl can control services on remote machines using SSH.

## Syntax
```bash
systemctl --host user@remote_host command [unit]
```

## Example
```bash
# Check status of httpd on remote server
systemctl --host admin@192.168.1.50 status httpd
```

## Prerequisites
- SSH access to the remote host.
- Sufficient privileges (sudo).