# 🌐 Full Stack Integration (MERN)

Connecting the distinct parts: React (Frontend), Express (Backend), and MongoDB (Database).

## Architecture
1.  **Client**: React app running in browser (port 3000/5173).
2.  **Server**: Node/Express app running on server (port 5000).
3.  **DB**: MongoDB Cloud or Local.

## Connecting Frontend to Backend
- **CORS**: Enable Cross-Origin Resource Sharing on backend.
- **Proxy**: Configure proxy in package.json to avoid CORS issues in dev.
- **Fetch/Axios**: Make HTTP requests from React to Express API.

## Example Flow
User clicks button -> React sends POST -> Express receives -> Saves to Mongo -> Responds -> React updates UI.
