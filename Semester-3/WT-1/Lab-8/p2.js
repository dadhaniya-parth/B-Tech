// 2. WAP in JavaScript to prime number between the given range of number. (A)

let start=11,end=20
for(i=start;i<=end;i++){
    let flag=0
    for (let j = 2; j < i; j++) {
        if (i%j==0) {
            flag = 1
            break
        }
    }
    if(i>1 && flag==0){
        console.log(i)
    }
}