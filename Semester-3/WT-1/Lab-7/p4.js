// 4. WAP in JavaScript to print the Fibonacci series of a number.(B)

let num = 8
let n1=0
let n2=1
let temp=0
for(let i=0;i<num;i++){
    console.log(n1)
    temp = n1+n2
    n1=n2
    n2=temp
}