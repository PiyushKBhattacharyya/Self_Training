# 🚀 Bash Variables & Their Types

Variables are essential in Bash scripting. They let you **store, read, access, and manipulate data** inside scripts.

---

## 🧠 How Bash Variables Work
When a bash script runs:

1. Checks defined variables  
2. Interprets code line-by-line  
3. Replaces variable names with values  
4. Executes commands  

### Ways to assign values

#### ✔️ Direct assignment
```sh
myvar="var"
```

#### ✔️ Assign output of a command (command substitution)
```bash
myvar=$(ls)
mydate=$(date)
```

#### ✔️ Assign from other variables
```bash
a="hello"
b=$a     # correct
b=a      # incorrect
```

#### ✔️ Access variable
```bash
echo "Value: $myvar"
```

---

### 🏷️ Naming Rules

- Start with **letter** or **underscore**

- Case-sensitive

- No spaces around `=`

- Avoid special characters

#### Valid names

`var`, `VAR`, `_var`, `v_a_r`, `March6`

#### Invalid names

`6March`, `!var`, `var*VAR`, `@var`

---

# ✨ Local vs Global (Environment) Variables

### 🔸 Local (session) variable

Exists only in current shell.

### 🔸 Exporting global (environment) variable
```bash
export MYVAR="value"
```

---

### 🔐 Local Variables Inside Functions
```bash
#!/bin/bash
myvar=5

calc() {
    local myvar=5
    ((myvar = myvar * 5))
    echo $myvar
}

calc       # prints 25
echo $myvar  # prints 5
```

---

### 🧬 System (Shell) Variables

View system variables:
```bash
env
set
printenv
```
Common system variables
| Variable     | Meaning                |
| ------------ | ---------------------- |
| BASH_VERSION | Bash version           |
| HOME         | Home directory         |
| USER         | Logged-in user         |
| PATH         | Executable search path |
| HOSTNAME     | Machine name           |
| LANG         | Language setting       |
| PWD          | Current directory      |

---

### 👨‍💻 User-Defined Variables

Syntax:
```bash
myvar=value
myvar="value with spaces"
```

Example:
```bash
#!/bin/bash
myvar=Hello
newvar="welcome to Bash"
echo "$myvar, $newvar"
```

---

### ⭐ Built-in Special Variables

| Variable   | Meaning                     |
| ---------- | --------------------------- |
| $$         | PID of current shell        |
| $?         | Exit status of last command |
| $0         | Script name                 |
| $1-$9      | Positional args             |
| ${10}-${n} | 10th…Nth argument           |
| $#         | Count of args               |
| $@ / $*    | All args                    |

---

# 🧺 Arrays in Bash

- Declare array:
```bash
arr=(apple banana "hello world")
```

- Access elements:
```bash
echo ${arr[0]}
```
-Array length:
```bash
echo ${#arr[@]}
```

- Loop through array:
```bash
for item in "${arr[@]}"; do
  echo "$item"
done
```

---

### 🧩 Associative Arrays (Key-Value)

- Declare associative array:
```bash
declare -A marks=([Ron]=10 [John]=30 [Sam]=50)
```

- Loop through keys:
```bash
for key in "${!marks[@]}"; do
  echo "$key scored ${marks[$key]}"
done
```

---

# 🏛️ Declaring Datatypes with declare

- Integer
```bash
declare -i num=5
```
- Indexed array
```bash
declare -a arr
```

- Associative array
```bash
declare -A map
```

---

# 🎯 Command-line Arguments

- Run script:
```bash
bash script.sh arg1 arg2 arg3
```

Example:
```bash
#!/bin/bash
echo "Total args: $#"
echo "Arg1: $1"
echo "Arg2: $2"
```

---

# 🔄 Command Substitution

Syntax:
```bash
var=$(command)
# OR
var=`command`
```

Example:
```bash
files=$(ls)
echo "$files"
```

---

📝 Bash Variable Cheat Sheet
```bash
myvar="value"      # define
echo "$myvar"      # access
readonly myvar     # make read-only
unset myvar        # delete variable
export VAR         # env variable
arr=(a b c)        # array
${arr[@]}          # array items
${#arr[@]}         # array length
$(cmd)             # command substitution
$?                 # exit code
$1 $2 …            # args
$@                 # all args
declare -i n       # integer
declare -A map     # associative array
```

---