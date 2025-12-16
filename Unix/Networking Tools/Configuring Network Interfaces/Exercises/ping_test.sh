#!/bin/bash

# Exercise: Connection Tester
# 
# 1. Define a target host (e.g., google.com).
# 2. Ping it 3 times (-c 3).
# 3. Check exit status. If 0, print "Connected". Else "Disconnected".

HOST="google.com"

echo "Pinging $HOST..."
if ping -c 3 "$HOST" > /dev/null; then
  echo "Success: Connected to $HOST"
else
  echo "Error: Cannot reach $HOST"
fi
