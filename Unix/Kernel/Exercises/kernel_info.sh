#!/bin/bash

# Exercise: Kernel Version
# 
# 1. Use 'uname' commands to gather info.
# 2. Print Kernel Name (-s).
# 3. Print Kernel Release (-r).
# 4. Print Machine Hardware Name (-m).

echo "Kernel Name: $(uname -s)"
echo "Kernel Release: $(uname -r)"
echo "Hardware Architecture: $(uname -m)"
