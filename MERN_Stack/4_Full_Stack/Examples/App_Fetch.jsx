// Example: Fetch Data from API in React

import React, { useEffect, useState } from 'react';

function App() {
    const [data, setData] = useState(null);

    useEffect(() => {
        // Fetch from Express Backend
        fetch('http://localhost:5000/api/data')
            .then(res => res.json())
            .then(data => setData(data))
            .catch(err => console.error("Error:", err));
    }, []);

    if (!data) return <div>Loading...</div>;

    return <div>Data from Server: {data.message}</div>;
}
