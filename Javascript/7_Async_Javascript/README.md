# ⏳ Async Javascript

Javascript is single-threaded, but can handle asynchronous operations.

## Evolution
1.  **Callbacks**: Passing functions as arguments (can lead to "Callback Hell").
2.  **Promises**: Objects representing future success/failure.
3.  **Async/Await**: Syntactic sugar for Promises, making code look synchronous.

## Async/Await Syntax
```javascript
async function fetchData() {
    try {
        const response = await fetch('/api/data');
        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error("Error:", error);
    }
}
```
