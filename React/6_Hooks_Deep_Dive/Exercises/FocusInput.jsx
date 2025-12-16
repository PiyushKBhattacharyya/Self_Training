/**
 * Exercise: Auto Focus Input
 * 
 * 1. Create an input field.
 * 2. Use useRef to get a reference to it.
 * 3. Use useEffect to focus the input automatically on mount.
 */

import React, { useEffect, useRef } from 'react';

function AutoFocusInput() {
    const inputRef = useRef(null);

    useEffect(() => {
        // Todo: Focus the input
        if (inputRef.current) {
            inputRef.current.focus();
        }
    }, []);

    return <input ref={inputRef} placeholder="I will be focused!" />;
}

export default AutoFocusInput;
