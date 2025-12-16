# 🎮 Controlling Services (systemctl)

`systemctl` is the main tool to introspect and control the state of the systemd system and service manager.

## Key Commands
| Command | Description |
|---|---|
| `start` | Start a unit immediately |
| `stop` | Stop a unit immediately |
| `restart` | Stop then start |
| `reload` | Reload configuration |
| `status` | Show runtime status |
| `enable` | Enable at boot |
| `disable` | Disable at boot |

## Example
```bash
sudo systemctl status sshd
```