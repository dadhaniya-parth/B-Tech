// Check whether the given number is prime or not using flag.

const prompt = require("prompt-sync")();

let n = prompt("Enter number:");
let flag = false;
for (let i = 2; i <= n / 2; i++) {
    if (n % i == 0) {
        flag = true;
        break;
    }
}
if (flag == false) {
    console.log("Prime");
}
else {
    console.log("Not Prime");
}

