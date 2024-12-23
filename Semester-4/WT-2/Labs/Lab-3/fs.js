// Demonstrate “fs” core module in NodeJS.

const fs = require("fs")

data='name : Parth Patel';

// writeFile
fs.writeFile('mydemo.txt',data,(err,data)=>{
    if(err){
        console.error(err);
    }
    else{
        console.log("File Created....");
    }
})

// readFile
// fs.readFile('mydemo.txt','utf-8',(err,data)=>{
//     if(err){
//         console.error(err);
//     }
//     else{
//         console.log('File Content:',data);
//     }
// })

//appendFile
// const data1='\n city : Rajkot';
// fs.appendFile('mydemo.txt',data1,(err)=>{
//     if (err) {
//         console.error(err);
//     }
//     else{
//         console.log("Data Appended...");
//     }
// })

//unlink
// fs.unlink('mydemo.txt',(err)=>{
//     if (err) {
//         console.error(err);
//     }
//     else{
//         console.log("File Deleted...")
//     }
// })