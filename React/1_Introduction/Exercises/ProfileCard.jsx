/**
 * Exercise: Profile Card
 * 
 * 1. Create a Component 'ProfileCard'.
 * 2. It should return a div with a className 'card'.
 * 3. Inside, display a static Name, Job Title, and a short Bio.
 * 4. Use inline styles for the card (border, padding).
 */

import React from 'react';

function ProfileCard() {
    // Todo: Define styles object
    const styles = {
        border: '1px solid #ccc',
        padding: '10px',
        borderRadius: '8px'
    };

    return (
        <div style={styles}>
            {/* Todo: Add Content */}
            <h2>[Name]</h2>
            <h3>[Job Title]</h3>
            <p>[Bio]</p>
        </div>
    );
}

export default ProfileCard;
