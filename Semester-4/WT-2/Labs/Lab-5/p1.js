// WAP in NodeJS to store the student details in text file.(A)

const fs = require("fs")

data='Name : Parth Patel\nRoll No : 563\nBranch : CSE\nSemester : 4\n';

// writeFile
fs.writeFile('student.txt',(data),(err,data,data1)=>{
    if(err){
        console.error(err);
    }
    else{
        console.log("File Created....");
    }
})