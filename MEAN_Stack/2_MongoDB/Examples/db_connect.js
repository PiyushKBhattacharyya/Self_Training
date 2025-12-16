// Example: Connect to Mongo
const mongoose = require('mongoose');

const uri = "mongodb://localhost:27017/meanApp";

async function connectDB() {
    try {
        await mongoose.connect(uri);
        console.log("MongoDB Connected!");
    } catch (err) {
        console.error(err);
    }
}

// connectDB();
