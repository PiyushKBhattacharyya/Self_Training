#!/bin/bash

# Exercise: Systemctl Practice
# 
# 1. Check status of 'cron' (or 'crond').
# 2. Print output.

SERVICE="cron"
if systemctl list-units --full -all | grep -Fq "crond.service"; then
    SERVICE="crond"
fi

echo "Checking status of $SERVICE..."
systemctl status "$SERVICE" --no-pager
