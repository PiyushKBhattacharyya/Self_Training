// Example: Simple API Server

const http = require('http');

const server = http.createServer((req, res) => {
    if (req.url === '/') {
        res.writeHead(200, { 'Content-Type': 'text/plain' });
        res.end('Welcome to the Home Page');
    } else if (req.url === '/api') {
        res.writeHead(200, { 'Content-Type': 'application/json' });
        res.end(JSON.stringify({ message: "This is an API response" }));
    } else {
        res.writeHead(404);
        res.end('Not Found');
    }
});

const PORT = 3000;
console.log(`Server listening on port ${PORT}...`);
// server.listen(PORT); // Uncomment to run
