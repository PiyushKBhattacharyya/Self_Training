# ⚔️ Bash vs Shell Script

## Shell (sh)
- The original Unix shell.
- Posix compliant.
- strictly follows standards.
- Symlinked to `/bin/sh` (often points to `bash` or `dash` on modern systems).

## Bash (Bourne Again SHell)
- An improved version of `sh`.
- Contains all `sh` features plus extensions.
- More user-friendly (tab completion, command history).

## Shebang
- `#!/bin/sh`: Uses the default system shell.
- `#!/bin/bash`: Specifically uses Bash.