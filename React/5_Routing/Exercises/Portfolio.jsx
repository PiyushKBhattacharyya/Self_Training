/**
 * Exercise: Portfolio
 * 
 * 1. Create 'Home', 'About', and 'Contact' dummy components.
 * 2. Setup BrowserRouter and Routes.
 * 3. Create a Navigation Bar with Links to each page.
 */

import React from 'react';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';

function Home() { return <h2>Home Page</h2>; }
function About() { return <h2>About Me</h2>; }

function Portfolio() {
    return (
        <BrowserRouter>
            <nav>
                <Link to="/">Home</Link> | <Link to="/about">About</Link>
            </nav>

            <Routes>
                {/* Todo: Add Route for Home */}
                <Route path="/" element={<Home />} />
                {/* Todo: Add Route for About */}
                <Route path="/about" element={<About />} />
            </Routes>
        </BrowserRouter>
    );
}

export default Portfolio;
