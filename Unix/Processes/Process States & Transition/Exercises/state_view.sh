#!/bin/bash

# Exercise: State Viewer
# 
# 1. Run 'sleep 30' in background.
# 2. Use 'ps' to find its state (should be S for Sleep).
# 3. Print the process line.

sleep 30 &
PID=$!

echo "Started sleep process $PID"
echo "Checking ps output..."
ps -o pid,stat,comm -p $PID
