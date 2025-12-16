# 📋 iptables Commands

Direct interaction with the packet filtering rules.

## Basic Syntax
`iptables -[AD] CHAIN rule-specification [options]`

## Cheatsheet
- `-A`: Append rule.
- `-I`: Insert rule.
- `-D`: Delete rule.
- `-L`: List rules.
- `-F`: Flush (delete) all rules.
- `-P`: Set default policy.

## Example
Block an IP:
`iptables -A INPUT -s 192.168.1.100 -j DROP`