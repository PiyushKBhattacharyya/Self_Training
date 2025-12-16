// Example: Components and Props

import React from 'react';

// Child Component
function Button({ label, onClick }) {
    return (
        <button onClick={onClick} style={{ backgroundColor: 'blue', color: 'white' }}>
            {label}
        </button>
    );
}

// Parent Component
function App() {
    const handleClick = () => alert("Clicked!");

    return (
        <div>
            <h2>Component Demo</h2>
            <Button label="Click Me" onClick={handleClick} />
            <Button label="Submit" onClick={handleClick} />
        </div>
    );
}

export default App;
