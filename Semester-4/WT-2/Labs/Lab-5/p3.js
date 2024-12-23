// WAP in NodeJS to count number of words in a file (B)

const fs = require('fs');

const filename = 'count.txt';

fs.readFile(filename,'utf-8', (err,data) =>{
    if(err) {
        console.log(err);
        }
    else {
        const words = data.split(' ');
        console.log(words.length);
        }
});