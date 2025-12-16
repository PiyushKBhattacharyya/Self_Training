#!/bin/bash

# Exercise: Resource Logger
# 
# 1. Create a log file 'system_stats.txt'.
# 2. Append the current date.
# 3. Append Memory usage (free -m).
# 4. Append Disk usage (df -h).

LOG_FILE="system_stats.txt"

echo "--- Stats: $(date) ---" >> "$LOG_FILE"
echo "[Memory]" >> "$LOG_FILE"
free -m >> "$LOG_FILE"
echo "[Disk]" >> "$LOG_FILE"
df -h >> "$LOG_FILE"

echo "Stats logged to $LOG_FILE"
