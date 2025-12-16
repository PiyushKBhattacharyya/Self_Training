/**
 * Exercise: FizzBuzz
 * 
 * Print numbers from 1 to 20.
 * - If number is divisible by 3, print "Fizz".
 * - If divisible by 5, print "Buzz".
 * - If divisible by both, print "FizzBuzz".
 * - Otherwise print the number.
 */

for (let i = 1; i <= 20; i++) {
    // Implement logic here
    if (i % 3 === 0 && i % 5 === 0) {
        console.log("FizzBuzz");
    } else {
        console.log(i);
    }
}
