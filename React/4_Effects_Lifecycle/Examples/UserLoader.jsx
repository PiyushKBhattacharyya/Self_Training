// Example: Data Fetcher

import React, { useState, useEffect } from 'react';

function UserLoader() {
    const [user, setUser] = useState(null);

    useEffect(() => {
        // Simulated API Call
        setTimeout(() => {
            setUser({ name: "John Doe", email: "john@example.com" });
        }, 2000);
    }, []); // Empty array = run once

    if (!user) return <p>Loading...</p>;

    return (
        <div>
            <h2>{user.name}</h2>
            <p>{user.email}</p>
        </div>
    );
}

export default UserLoader;
