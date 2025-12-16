#!/bin/bash

# Exercise: Service Status Checker
# 
# 1. Ask user for a service name (e.g., cron, sshd, nginx).
# 2. Check the status of that service using systemctl.
# 3. Print if it is active or inactive.

read -p "Enter service name (e.g., sshd): " SVC

if systemctl is-active --quiet "$SVC"; then
  echo "$SVC is running."
else
  echo "$SVC is NOT running."
fi
