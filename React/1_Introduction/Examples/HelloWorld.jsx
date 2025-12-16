// Example: Hello World with JSX

import React from 'react';
import ReactDOM from 'react-dom/client';

function App() {
    const name = "React Learner";
    return (
        <div>
            <h1>Hello, {name}!</h1>
            <p>Welcome to the world of persistent UI.</p>
        </div>
    );
}

// Rendering (Conceptual)
// const root = ReactDOM.createRoot(document.getElementById('root'));
// root.render(<App />);

export default App;
