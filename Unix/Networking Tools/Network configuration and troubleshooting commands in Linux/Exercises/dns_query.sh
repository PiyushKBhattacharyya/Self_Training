#!/bin/bash

# Exercise: DNS Query
# 
# 1. Ask for a domain name.
# 2. Use nslookup (or host) to find its IP.

read -p "Enter domain: " DOMAIN

echo "Looking up $DOMAIN..."
if command -v nslookup > /dev/null; then
    nslookup "$DOMAIN"
else
    echo "nslookup not found, using host:"
    host "$DOMAIN"
fi
