const fs = require('fs');

let data = "This is fs module demo";

fs.writeFileSync('syncdemo.txt',data);
console.log("File Created...");
console.log("Content of this file is:");
console.log(fs.readFileSync('syncdemo.txt', 'utf-8'));