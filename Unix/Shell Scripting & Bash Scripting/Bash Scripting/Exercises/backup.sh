#!/bin/bash

# Exercise: Simple Backup
#
# 1. Define a source directory (e.g., "data").
# 2. Define a backup directory (e.g., "backup").
# 3. Create the backup directory if it doesn't exist.
# 4. Copy files from source to backup.

SOURCE_DIR="data"
BACKUP_DIR="backup"

echo "Starting backup from $SOURCE_DIR to $BACKUP_DIR..."

if [ ! -d "$BACKUP_DIR" ]; then
  echo "Creating backup directory..."
  mkdir -p "$BACKUP_DIR"
fi

# Simulate copy
# cp -r "$SOURCE_DIR/"* "$BACKUP_DIR/"
echo "Backup complete (Simulation)."
