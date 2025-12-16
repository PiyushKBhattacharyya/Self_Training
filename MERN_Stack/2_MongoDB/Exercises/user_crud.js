/**
 * Exercise: User CRUD
 * 
 * 1. Define a Mongoose Schema for 'User' (name: String, age: Number).
 * 2. Create a specific user instance.
 * 3. Simulate saving it to the database.
 */

const mongoose = require('mongoose');

const userSchema = new mongoose.Schema({
    name: String,
    age: Number
});

const User = mongoose.model('User', userSchema);

async function run() {
    // Todo: Create a new user
    const newUser = new User({ name: "Alice", age: 30 });

    // Todo: Save (Mocking save as we don't have a live DB connection here)
    console.log("Saving user:", newUser);
    // await newUser.save();
    console.log("User saved!");
}

run();
