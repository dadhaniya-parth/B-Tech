// 2. WAP in JavaScript to check whether the given no. is prime or not.(A)
let a = 5
let conut  = 0
for (i = 2; i <= a; i++) {
    if (a % i == 0) {
        conut++ ;
        }
}
if (conut == 2) {
    console.log(a + " is a prime number");
} 
else {
    console.log(a + " is not a prime number");
}
