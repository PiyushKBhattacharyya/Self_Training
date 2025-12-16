/**
 * Exercise: Inventory Manager
 * 
 * 1. Create an array of objects representing products (name, price, stock).
 * 2. Filter products that are out of stock (stock: 0).
 * 3. Calculate total value of remaining stock (price * stock).
 */

const inventory = [
    { name: "Laptop", price: 1000, stock: 5 },
    { name: "Mouse", price: 20, stock: 0 },
    { name: "Keyboard", price: 50, stock: 10 }
];

// Implement logic
const available = inventory.filter(item => item.stock > 0);
console.log("Available Items:", available);

// Todo: Calculate total value
