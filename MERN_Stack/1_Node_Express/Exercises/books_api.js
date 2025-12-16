/**
 * Exercise: Books API
 * 
 * 1. Initialize a new project (npm init -y) if needed (or just mock it).
 * 2. Define an Express app.
 * 3. Create a GET route '/books' that returns a list of book titles (JSON).
 * 4. Create a POST route '/books' that simulates adding a book (just log it).
 * 5. Code provided below.
 */

const express = require('express');
const app = express();

app.use(express.json()); // Middleware to parse JSON bodies

const books = [
    { id: 1, title: "The Great Gatsby" },
    { id: 2, title: "1984" }
];

// Todo: Implement GET /books
app.get('/books', (req, res) => {
    res.json(books);
});

// Todo: Implement POST /books
app.post('/books', (req, res) => {
    const newBook = req.body;
    console.log("Adding book:", newBook);
    books.push(newBook);
    res.status(201).json({ message: "Book added", book: newBook });
});

const PORT = 3000;
// app.listen(PORT, () => console.log(`Books API running on ${PORT}`));
