#!/bin/bash

# Exercise: Admin Safety Check
# 
# 1. Check if root is locked (simplified: check /etc/shadow or just warn).
# 2. Check UFW status.

echo "--- Admin Safety Check ---"

# Check Firewall (UFW)
if command -v ufw > /dev/null; then
    sudo ufw status
else
    echo "UFW not installed."
fi

echo "Reminder: Ensure SSH root login is disabled in /etc/ssh/sshd_config"
