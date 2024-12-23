// 4. WAP in JavaScript to print the GCD of two number. (A)
let a = 60,b = 36
while(b != 0){
    let temp = b
    b = a % b
    a = temp
}
console.log(a)
