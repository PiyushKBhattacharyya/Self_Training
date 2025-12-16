#!/bin/bash

# Exercise: Argument Counter
# 
# 1. Print the total number of arguments passed ($#).
# 2. Print all arguments ($@).
# 3. If no arguments, print a warning.

if [ $# -eq 0 ]; then
  echo "Warning: No arguments provided."
else
  echo "Total Arguments: $#"
  echo "Arguments List: $@"
fi
