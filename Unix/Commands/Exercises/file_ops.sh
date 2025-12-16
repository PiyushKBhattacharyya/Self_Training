#!/bin/bash

# Exercise: File Ops
# 
# 1. Create a directory 'test_dir'.
# 2. Touch 3 files in it: a.txt, b.txt, c.txt.
# 3. List the contents.
# 4. Cleanup: remove directory.

echo "Creating test_dir..."
mkdir test_dir
touch test_dir/a.txt test_dir/b.txt test_dir/c.txt

echo "Listing contents:"
ls -l test_dir

echo "Cleaning up..."
rm -rf test_dir
echo "Done."
