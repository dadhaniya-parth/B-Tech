// 5. WAP in JavaScript to check whether the given number is palindrome or not.(B)

let num = 121,temp = num,sum = 0,rem = 0
while (num > 0) {
    rem = num % 10
    sum = (sum * 10) + rem
    num = parseInt(num/10)
}
console.log(sum)
if(sum==temp){
    console.log("The number is palindrome")
}
else{
    console.log("The number is not palindrome")
}
  
