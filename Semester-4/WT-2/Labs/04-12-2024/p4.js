// Find factorial of the given number.

const prompt = require("prompt-sync")();

let n = prompt("Enter number:");

let fact = 1;

for(let i=1;i<=n;i++){
    fact = fact * i;
}

console.log(fact);