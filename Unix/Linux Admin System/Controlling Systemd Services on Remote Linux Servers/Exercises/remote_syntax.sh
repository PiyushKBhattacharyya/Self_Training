#!/bin/bash

# Exercise: Remote Check Syntax
# 
# 1. Ask for a remote IP.
# 2. Ask for a remote user.
# 3. Print the command that would check the status of 'sshd' on that host.

read -p "Remote IP: " IP
read -p "Username: " USER

echo "To check sshd on $IP, run:"
echo "systemctl --host ${USER}@${IP} status sshd"
