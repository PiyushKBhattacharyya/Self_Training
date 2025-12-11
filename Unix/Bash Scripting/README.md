# 🐚 Bash Scripting — Introduction to Bash and Bash Scripting  

**Bash** (Bourne Again SHell) is a widely used command-line interpreter (shell) on GNU/Linux and many Unix-like systems.  
Bash scripting lets you automate repetitive tasks by writing a sequence of shell commands in a file (a *script*). Scripts save time, reduce human error, and can perform complex workflows.

---

## 🤖 What is Bash (high level)
- A command-line interpreter and scripting language.  
- Default login shell on many Linux distributions.  
- Enables automation: organize files, install software, backups, deployments, etc.

---

## 🧭 Write Your First Bash Script

1. **Create file**
```bash
gedit hello.sh   # or: nano hello.sh, vim hello.sh
```

2. **Add content**
```bash
#!/bin/bash          # shebang: use Bash to run this script
echo "Hello, World!"
```

3. **Make executable**
```bash
chmod +x hello.sh
```

4. **Run it**
```bash
./hello.sh
```

---

# 🔑 Key Concepts

### File names & permissions

- Scripts conventionally end with `.sh` (not required, but common).

- Must have execute permission (`chmod +x script.sh`).

- Use descriptive names: `my-backup.sh` or `backup_daily.sh`.

### Shebang

The first line `#!/bin/bash` tells the OS which interpreter to use.

---

# 🧾 Variables in Bash

### Define & use
```sh
Name="XYZ"
Age=20
echo "The name is $Name and Age is $Age"
```

### Scope

- By default in scripts variables are **global** (accessible anywhere in the script).

- Use `local` inside functions to make a variable local.
```sh
myfun(){
  local var2="Banana"   # local
  var3="Cherry"         # global
}
```

---

# 📥 Input & Output

### Example: ask for a filename, show or create file.

```sh
echo "Enter filename"
read filename

if [ -e "$filename" ]; then
  echo "$filename exists"
  cat "$filename"
else
  cat > "$filename"
  echo "File created"
fi
```

- `>` redirects stdout to a file (overwrite).

- `2>` redirects stderr.

- `&>` redirects both stdout and stderr.

---

# 🔁 Functions

Define reusable blocks:
```sh
myFunction() {
  echo "Hello World!"
}

# call
myFunction
```

Functions can accept positional args `$1`, `$2`, etc.

---

# ✅ Decision Making

### If

```sh
if [ "$Age" -ge 18 ]; then
  echo "You can vote"
else
  echo "You cannot vote"
fi
```

> Remember: space after `[` and before `]`.

### case (switch)

```sh
case "$Name" in
  "ZYX") echo "Software Engineer" ;;
  "XYZ") echo "Technical Content Writer" ;;
esac
```

---

# 🔢 Comparisons

### Numeric

- `-eq`, `-ne`, `-gt`, `-ge`, `-lt`, `-le`
Example: `[ 10 -eq 10 ]`

### String

- `==`, `!=`, `-n` (not null), `-z` (is null)
Example: `[ "foo" == "foo" ]`

---

# 🔁 Loops

- `for var in 1 2 3; do ... done`

- `while [ condition ]; do ... done`

- `until [ condition ]; do ... done`

---

# 🎯 Positional Parameters & Special Variables

- `$0` script name, `$1`, `$2` … args

- `$#` number of args

- `$?` exit status of last command (0 = success)

- `$@` / `$*` all args

---

# 🧾 Command substitution

Store output of command:
```sh
now=$(date)
files=`ls -1`
```

---

# 🚦 Exit codes

- `exit 0` success, non-zero indicates error.

- Use `$?` to check last command's status.

---

# 📚 Practical Applications

- Automate repetitive tasks (renaming, backups).

- System updates, maintenance scripts.

- Data processing & reporting.

- Cron jobs for scheduled tasks.

- Monitoring, alerts, admin utilities.

- Lightweight cross-platform tools (Linux/macOS/WSL).

---

### ⚖ Advantages

- Easy to write and run (no compile step).

- Great for quick automation and admin tasks.

- Native on Unix/Linux systems.

- Integrates well with Unix command toolbox.

### ⚠ Disadvantages

- Slower than compiled languages.

- Each command spawns a new process — potential overhead.

- Errors can be risky (destructive commands).

- Portability caveats between distributions (paths, utilities).

---

# 🧰 Best Practices

- Use `set -euo pipefail` in scripts to catch errors early:
```sh
#!/bin/bash
set -euo pipefail
IFS=$'\n\t'
```

- Quote variables: `"$var"` to avoid word splitting / globbing issues.

- Use functions to organize code.

- Test commands interactively before scripting.

- Use `readonly` for constants.

- Add comments and usage/help message.

- Validate inputs and check exit codes.

---

### 📎 Example: Voting script
```sh
#!/bin/bash
read -p "Enter your age: " age
if [ "$age" -ge 18 ]; then
  echo "You can vote"
else
  echo "You cannot vote"
fi
```

---