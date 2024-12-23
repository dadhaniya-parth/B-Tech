// 6. WAP in JavaScript to check whether the given number is Armstrong or not.(C)

let n = 407,
    sum = 0,
    totalnumber = 0,
    rem = 0
    y = n.toString()
    totalnumber = y.length
    console.log(totalnumber)
let temp = n
while (n > 0) {
    rem = n % 10
    sum = sum + rem ** totalnumber
    n = parseInt(n / 10)
}
if (sum == temp) {
    console.log("The Number is Armstrong")
} else {
    console.log("The Number is Not Armstrong")
}