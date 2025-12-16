#!/bin/bash

# Exercise: Sleep Killer
# 
# 1. Start a 'sleep 100' process in the background.
# 2. Get its PID ($!).
# 3. Print "Started sleep process with PID: $PID".
# 4. Wait 2 seconds.
# 5. Kill the process.
# 6. Verify termination.

sleep 100 &
PID=$!

echo "Started background sleep process (PID: $PID)"
echo "Waiting 2 seconds..."
sleep 2

echo "Killing process $PID..."
kill $PID

echo "Done."
