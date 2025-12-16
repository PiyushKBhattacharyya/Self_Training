/**
 * Exercise: Theme Switcher
 * 
 * 1. Create a ThemeContext.
 * 2. Create a ThemeProvider component that holds 'theme' state ('light'|'dark').
 * 3. Create a Button that toggles theme using useContext.
 */

import React, { createContext, useState, useContext } from 'react';

// 1. Create Context
const ThemeContext = createContext();

function App() {
    const [theme, setTheme] = useState('light');

    return (
        <ThemeContext.Provider value={{ theme, setTheme }}>
            <Toolbar />
        </ThemeContext.Provider>
    );
}

function Toolbar() {
    return <ThemeButton />;
}

function ThemeButton() {
    // Todo: Consume Context
    const { theme, setTheme } = useContext(ThemeContext);

    return (
        <button
            onClick={() => setTheme(theme === 'light' ? 'dark' : 'light')}
            style={{
                background: theme === 'light' ? '#fff' : '#333',
                color: theme === 'light' ? '#000' : '#fff'
            }}
        >
            Current Theme: {theme}
        </button>
    );
}

export default App;
