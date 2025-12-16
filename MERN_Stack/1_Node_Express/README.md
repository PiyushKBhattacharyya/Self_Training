# 🟩 Node.js & Express

## Node.js
A Javascript runtime built on Chrome's V8 engine. Allows running JS on the server.

## Express
A minimal and flexible Node.js web application framework.

## Setup
1.  Initialize project: `npm init -y`
2.  Install Express: `npm install express`

## Basic Server
```javascript
const express = require('express');
const app = express();
const PORT = 3000;

app.get('/', (req, res) => {
    res.send('Hello World!');
});

app.listen(PORT, () => console.log(`Server running on port ${PORT}`));
```
