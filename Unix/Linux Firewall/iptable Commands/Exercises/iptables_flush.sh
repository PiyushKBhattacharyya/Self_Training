#!/bin/bash

# Exercise: Flush All Rules
# 
# 1. Warn the user that flushing removes all firewall rules.
# 2. Ask for confirmation (y/n).
# 3. Simulate flushing.

echo "WARNING: Flushing will remove ALL firewall rules."
read -p "Are you sure? (y/n): " CONFIRM

if [ "$CONFIRM" == "y" ]; then
    echo "Running: sudo iptables -F"
    echo "All rules flushed (Simulated)."
else
    echo "Operation cancelled."
fi
