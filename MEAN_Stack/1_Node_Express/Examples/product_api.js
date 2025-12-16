// Example: Simple Product API

const express = require('express');
const app = express();

app.use(express.json());

const products = [
    { id: 1, name: "Laptop", price: 1000 },
    { id: 2, name: "Phone", price: 500 }
];

app.get('/api/products', (req, res) => {
    res.json(products);
});

const PORT = 3000;
console.log("Product API running on port", PORT);
// app.listen(PORT);
