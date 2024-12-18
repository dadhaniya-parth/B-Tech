// Find factors of given Number.

const prompt = require("prompt-sync")();

let n = prompt("Enter number:");

for(i=1;i<=n;i++){
    if(n%i==0){
        console.log(i);
        }
}