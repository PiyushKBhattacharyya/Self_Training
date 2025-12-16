#!/bin/bash

# Exercise: Allow Port
# 
# 1. Ask user for a port number.
# 2. Simulate the ufw command to allow it.

read -p "Enter port number to allow (e.g., 80): " PORT

echo "Running: sudo ufw allow $PORT"
echo "(Simulated)"
