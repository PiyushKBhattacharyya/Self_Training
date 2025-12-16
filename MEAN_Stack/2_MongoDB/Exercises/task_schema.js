/**
 * Exercise: Task Schema
 * 
 * 1. Define a Mongoose Schema for a 'Task'.
 * 2. Fields: title (String), completed (Boolean), createdAt (Date).
 */

const mongoose = require('mongoose');

// Todo: Define Schema
const TaskSchema = new mongoose.Schema({
    title: { type: String, required: true },
    completed: { type: Boolean, default: false },
    createdAt: { type: Date, default: Date.now }
});

const Task = mongoose.model('Task', TaskSchema);
console.log("Task Model created.");
