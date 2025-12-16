# 🔢 Shell Variables

Understanding the scope and types of variables in Shell.

## Local vs Global
- **Local**: Visible only within the block/function.
- **Global**: Visible throughout the script.
- **Environment**: Available to child processes (exported variables).

## Special Variables
- `$0`: Script name.
- `$1...$9`: Arguments.
- `$#`: Number of arguments.
- `$?`: Exit status of last command.
- `$$`: Process ID.

## Example
```bash
echo "Script Name: $0"
echo "First Arg: $1"
```