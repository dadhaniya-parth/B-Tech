// Check whether the given number is palindrome or not.

const prompt = require("prompt-sync")();

let n = prompt("Enter number:");
let rev = 0;
let num = n;
while (num != 0) {
    let rem = num % 10;
    rev = rev * 10 + rem;
    num = Math.floor(num / 10);
}
if (n == rev) {
    console.log("Pallindrome");
} else {
    console.log("Not Pallindrome");
}