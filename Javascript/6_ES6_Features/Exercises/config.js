/**
 * Exercise: Config Parser
 * 
 * 1. Create a default config object { theme: 'light', lang: 'en' }.
 * 2. Create a user config object { theme: 'dark' }.
 * 3. Merge them using Spread operator (user overrides default).
 * 4. Destructure the result to print variables.
 */

const defaults = { theme: 'light', lang: 'en', debug: false };
const userConfig = { theme: 'dark' };

// Todo: Merge
const finalConfig = { ...defaults, ...userConfig };

// Todo: Destructure and print
const { theme, lang } = finalConfig;
console.log(`Theme: ${theme}, Lang: ${lang}`);
