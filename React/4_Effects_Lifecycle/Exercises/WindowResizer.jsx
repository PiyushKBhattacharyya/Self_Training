/**
 * Exercise: Window Resizer
 * 
 * 1. Create a component 'WindowSize'.
 * 2. State 'width' tracking window.innerWidth.
 * 3. Use useEffect to add an event listener for "resize".
 * 4. Update state on resize.
 * 5. CLEANUP the listener in the return function.
 */

import React, { useState, useEffect } from 'react';

function WindowSize() {
    const [width, setWidth] = useState(window.innerWidth);

    useEffect(() => {
        const handleResize = () => setWidth(window.innerWidth);

        // Todo: Add Event Listener
        window.addEventListener('resize', handleResize);

        // Todo: Cleanup Function (remove listener)
        return () => window.removeEventListener('resize', handleResize);
    }, []);

    return <h1>Window Width: {width}px</h1>;
}

export default WindowSize;
