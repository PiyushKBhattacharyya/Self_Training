# 🧰 Essential UNIX Commands

Unix commands are a powerful set of tools used to interact with the Unix operating system.  
UNIX is a **multi-user**, **multi-tasking**, and **highly stable** OS developed at Bell Labs in the 1960s by **Dennis Ritchie** and **Ken Thompson**.

Unix powers **servers, desktops, smartphones**, and many enterprise systems worldwide.  
Commands are typed into a **terminal**, allowing users to manage files, processes, users, networks, and more.

---

# 📂 UNIX File System Navigation Commands

| **Command** | **Description** | **Example** |
|------------|------------------|-------------|
| `cd` | Changes the current working directory. | `cd Documents` |
| `ls` | Lists files and directories. | `ls` |
| `pwd` | Prints the current working directory path. | `pwd` |
| `mkdir` | Creates a new directory. | `mkdir new_folder` |
| `rmdir` | Removes an empty directory. | `rmdir empty_folder` |
| `mv` | Moves or renames files or directories. | `mv file1.txt Documents/` |

---

# 📝 UNIX File Manipulation Commands

| **Command** | **Description** | **Example** |
|-------------|------------------|--------------|
| `touch` | Creates an empty file or updates timestamps. | `touch new_file.txt` |
| `cp` | Copies files or directories. | `cp file1.txt file2.txt` |
| `mv` | Moves or renames files/directories. | `mv file1.txt Documents/` |
| `rm` | Removes files or directories. | `rm old_file.txt` |
| `chmod` | Changes permissions. | `chmod 644 file.txt` |
| `chown` | Changes file owner and group. | `chown user:group file.txt` |
| `ln` | Creates hard/symbolic links. | `ln -s target_file symlink` |
| `cat` | Displays or concatenates file contents. | `cat file1.txt file2.txt` |
| `head` | Shows the first lines of a file. | `head file.txt` |
| `tail` | Shows the last lines of a file. | `tail file.txt` |
| `more` | Views file content page by page. | `more file.txt` |
| `less` | Enhanced file viewer with navigation. | `less file.txt` |
| `diff` | Compares two files line-by-line. | `diff file1.txt file2.txt` |
| `patch` | Applies updates from a diff file. | `patch file.txt < changes.diff` |

---

# ⚙️ UNIX Process Management Commands

| **Command** | **Description** | **Example** |
|-------------|------------------|-------------|
| `ps` | Shows active processes. | `ps aux` |
| `top` | Real-time system monitor. | `top` |
| `kill` | Terminates a process using PID. | `kill <pid>` |
| `pkill` | Kills processes by name. | `pkill -9 firefox` |
| `killall` | Kills all processes with given name. | `killall -9 firefox` |
| `renice` | Changes process priority. | `renice -n 10 <pid>` |
| `nice` | Runs a command with a custom priority. | `nice -n 10 command` |
| `pstree` | Displays processes in a tree format. | `pstree` |
| `pgrep` | Finds processes by name. | `pgrep firefox` |
| `jobs` | Lists background jobs in shell. | `jobs` |
| `bg` | Resumes a job in the background. | `bg <job_id>` |
| `fg` | Brings job to foreground. | `fg <job_id>` |
| `nohup` | Runs command immune to hangups. | `nohup command &` |
| `disown` | Removes jobs from shell control. | `disown <job_id>` |

---

# 📝 UNIX Text Processing Commands

| **Command** | **Description** | **Example** |
|-------------|------------------|-------------|
| `grep` | Searches for patterns in text. | `grep "error" logfile.txt` |
| `sed` | Stream editor for transformations. | `sed 's/old/new/g' file.txt` |
| `awk` | Pattern scanning & reporting. | `awk '{print $1, $3}' data.csv` |
| `cat` | Displays/concatenates files. | `cat file1.txt file2.txt` |
| `head` | Shows first few lines. | `head file.txt` |
| `tail` | Shows last few lines. | `tail file.txt` |
| `more` | Paginated file viewer. | `more file.txt` |
| `less` | Advanced file viewer. | `less file.txt` |
| `diff` | Compares files line-by-line. | `diff file1.txt file2.txt` |
| `patch` | Applies differences to files. | `patch file.txt < changes.diff` |

---

# 🌐 UNIX Network Communication Commands

| **Command** | **Description** | **Example** |
|-------------|------------------|--------------|
| `ping` | Tests connectivity. | `ping google.com` |
| `traceroute` | Shows packet path to host. | `traceroute google.com` |
| `nslookup` | DNS lookup utility. | `nslookup google.com` |
| `dig` | Advanced DNS query tool. | `dig google.com` |
| `host` | Simple DNS lookup. | `host google.com` |
| `whois` | Domain registration lookup. | `whois google.com` |
| `ssh` | Secure remote login. | `ssh user@hostname` |
| `scp` | Secure file copy. | `scp file.txt user@host:/path/` |
| `ftp` | File transfer protocol client. | `ftp hostname` |
| `telnet` | Basic remote terminal access. | `telnet hostname` |
| `netstat` | Shows network connections. | `netstat -tuln` |
| `ifconfig` | Configures network interfaces. | `ifconfig` |
| `iwconfig` | Wireless interface configuration. | `iwconfig wlan0` |
| `route` | Views/edits routing table. | `route -n` |
| `arp` | Views/modifies ARP cache. | `arp -a` |
| `ss` | Socket statistics viewer. | `ss -tuln` |
| `hostname` | Shows/sets hostname. | `hostname` |
| `mtr` | Combined ping + traceroute tool. | `mtr google.com` |

---

# 🛠️ UNIX System Administration Commands

| **Command** | **Description** | **Example** |
|-------------|------------------|-------------|
| `df` | Shows disk space usage. | `df -h` |
| `du` | Shows directory/file sizes. | `du -sh /path` |
| `crontab -e` | Edits scheduled cron jobs. | `crontab -e` |

---

# ✏️ Text Editors in UNIX

| **Editor** | **Description** | **Example Usage** |
|-----------|------------------|--------------------|
| **Vi / Vim** | Powerful modal editor with high performance. | Open: `vim file.txt`<br>Save & exit: `Esc → :wq` |
| **Emacs** | Highly customizable extensible editor. | Open: `emacs file.txt`<br>Save: `Ctrl+X Ctrl+S`<br>Exit: `Ctrl+X Ctrl+C` |
| **Nano** | Beginner-friendly terminal editor. | Open: `nano file.txt`<br>Save & exit: `Ctrl+O`, then `Ctrl+X` |
| **Ed** | Line-based editor for automation. | Open: `ed file.txt`<br>Quit: `q` |
| **Jed** | Lightweight editor with programming support. | Open: `jed file.txt`<br>Exit: `Alt+X → exit` |
