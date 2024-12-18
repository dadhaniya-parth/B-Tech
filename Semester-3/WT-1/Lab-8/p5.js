// 5. Write a JavaScript to take 2-digit number and then separate these 2 digits, then multiply first digit by itself for second digit times. (For example, 23 should be separated as 2 and 3. 2 should multiply with itself 3 times). (B)
let a = 26
let base = Math.floor(a/10)
let power = a % 10
let ans = 0
ans += base ** power
console.log(ans)