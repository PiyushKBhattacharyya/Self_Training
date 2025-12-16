# 🟩 Node.js & Express (MEAN)

## Role in MEAN
In the MEAN stack, Node.js and Express form the backend server that serves the Angular application and exposes REST API endpoints for data operations.

## Setup
1.  Initialize: `npm init -y`
2.  Install: `npm install express body-parser cors`

## Basic Structure
```javascript
const express = require('express');
const app = express();

app.get('/api/users', (req, res) => {
    res.json([{ name: "User 1" }]);
});

app.listen(3000);
```
