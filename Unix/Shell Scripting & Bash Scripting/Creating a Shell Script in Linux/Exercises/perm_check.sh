#!/bin/bash

# Exercise: Permission Checker
# 
# 1. Create a dummy file 'run_me.sh'.
# 2. Echo "Original Permissions:" followed by ls -l run_me.sh.
# 3. Add execute permission (+x).
# 4. Echo "New Permissions:" followed by ls -l run_me.sh.
# 5. Remove dummy file.

touch run_me.sh
echo "echo 'I run!'" > run_me.sh

echo "Original Permissions:"
ls -l run_me.sh

chmod +x run_me.sh

echo "New Permissions:"
ls -l run_me.sh

# Cleanup
rm run_me.sh
