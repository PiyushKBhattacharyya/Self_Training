/**
 * Exercise: Factorial Calculator
 * 
 * 1. Create a function 'factorial(n)' that returns the factorial of n.
 * 2. Use recursion or a loop.
 * 3. Test it with n=5.
 */

function factorial(n) {
    // Implement logic
    if (n === 0 || n === 1) return 1;
    return n * factorial(n - 1);
}

console.log("Factorial of 5:", factorial(5));
