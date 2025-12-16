#!/bin/bash

# Exercise: Block Bad IP
# 
# 1. Ask user for a "bad" IP address.
# 2. Simulate the command to block it (don't actually run iptables to avoid locking yourself out).
# 3. Print the command that WOULD be run.

read -p "Enter IP to block: " IP

echo "Blocking $IP..."
echo "Command: sudo iptables -A INPUT -s $IP -j DROP"
echo "(Simulated execution)"
