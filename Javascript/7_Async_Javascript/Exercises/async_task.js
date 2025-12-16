/**
 * Exercise: Simulated Fetch
 * 
 * 1. Create a function 'mockApi' that returns a Promise.
 * 2. It should resolve with "Data Loaded" after 2 seconds.
 * 3. Use async/await to call it and print the result.
 */

function mockApi() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("Data Loaded");
        }, 2000);
    });
}

// Implement async function main()
async function main() {
    console.log("Fetching...");
    const result = await mockApi();
    console.log(result);
}

main();
