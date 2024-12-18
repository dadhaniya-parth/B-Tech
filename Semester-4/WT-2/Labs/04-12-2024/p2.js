// print first 50 numbers in series 1, 4, 7, 10..

const prompt = require("prompt-sync")();

let n = prompt("Enter number:");

let sum = 1;

for(let i=1;i <= n;i++){
    console.log(sum);
    sum += 3;
}

console.log(sum);