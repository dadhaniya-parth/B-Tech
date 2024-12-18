// Check whether the given number is perfect or not.

const prompt = require("prompt-sync")();

let n = prompt("Enter number:");
let sum = 0;

for(i=1;i<n;i++){
    if(n%i==0){
        console.log(i);
        sum += i;
        }
}

if(sum == n){
    console.log("Perfect");
}
else{
    console.log("Not Perfect");
}


