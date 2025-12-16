#!/bin/bash

# Exercise: Boot Time Analysis
# 
# 1. Use 'systemd-analyze' to print overall boot time.
# 2. Use 'systemd-analyze blame' to list top time-consuming services.

echo "--- Boot Time Statistics ---"
systemd-analyze

echo ""
echo "--- Top 5 Slowest Services ---"
systemd-analyze blame | head -n 5
