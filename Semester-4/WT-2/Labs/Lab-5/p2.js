// WAP in NodeJS to copy the content of a file named abc.txt to xyz.txt (B)

const fs = require('fs');

const source = 'abc.txt';

const destination = 'xyz.txt';

fs.copyFile(source, destination, (err) => {
  if (err) {
    console.error('Error copying file:', err);
  } else {
    console.log('File copied successfully!');
  }
});
