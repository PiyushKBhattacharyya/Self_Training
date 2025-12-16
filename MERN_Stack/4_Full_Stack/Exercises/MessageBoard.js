/**
 * Exercise: Message Board
 * 
 * 1. Backend: Create a POST route '/messages' to save a message.
 * 2. Frontend: Create a Form to input a message.
 * 3. Frontend: On submit, send POST request to backend.
 */

// Frontend (React Snippet)
const handleSubmit = async (e) => {
    e.preventDefault();
    const msg = "Hello from React";

    // Todo: fetch('http://localhost:5000/messages', { method: 'POST', body: ... })
    console.log("Sending:", msg);
};
