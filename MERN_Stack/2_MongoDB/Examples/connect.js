// Example: Connecting to MongoDB (Mock Code)

const mongoose = require('mongoose');

// Connection String (Local or Atlas)
const uri = 'mongodb://localhost:27017/mydb';

async function connect() {
    try {
        await mongoose.connect(uri);
        console.log("Connected to MongoDB");
    } catch (error) {
        console.error("Connection error:", error);
    }
}

// connect(); 
