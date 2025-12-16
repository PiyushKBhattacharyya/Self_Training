/**
 * Exercise: Task API
 * 
 * 1. Create an Express server.
 * 2. Define a GET route '/api/tasks' returning a list of tasks.
 * 3. Define a POST route '/api/tasks' to add a task.
 */

const express = require('express');
const app = express();

app.use(express.json());

let tasks = ["Buy Milk", "Walk Dog"];

// Todo: GET /api/tasks
app.get('/api/tasks', (req, res) => {
    res.json(tasks);
});

// Todo: POST /api/tasks
app.post('/api/tasks', (req, res) => {
    const { task } = req.body;
    tasks.push(task);
    res.json({ message: "Task added", tasks });
});
