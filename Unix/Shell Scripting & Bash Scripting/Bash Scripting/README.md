# 📜 Bash Scripting

Bash (Bourne Again SHell) is the most common shell for Linux.

## Variables
Variables in Bash are untyped.
```bash
NAME="John"
echo "Hello $NAME"
```

## Conditionals
```bash
if [ "$NAME" == "John" ]; then
  echo "It is John"
fi
```

## Loops
```bash
for i in {1..5}; do
  echo "Count: $i"
done
```