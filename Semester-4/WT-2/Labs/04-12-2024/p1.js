// print sum of series 1 + 4 + 9 + 16 + 25 + 36 + ...n.

const prompt = require("prompt-sync")();

let n = prompt("Enter number:");

let sum = 0;
for(let i=1;i<=n;i++){
    sum += i*i;
}

console.log(sum);