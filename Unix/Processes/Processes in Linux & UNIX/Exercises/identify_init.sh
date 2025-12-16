#!/bin/bash

# Exercise: Identify Init
# 
# 1. Print details of PID 1.
# 2. Attempt to identify if it's systemd.

echo "Details of PID 1:"
ps -p 1 -o pid,comm,args

if ps -p 1 -o comm= | grep -q "systemd"; then
    echo "Result: Implementation is Systemd."
else
    echo "Result: Implementation is NOT Systemd (could be init)."
fi
