// WAP in NodeJS to count total vowels in a file (B)

const fs = require('fs');

const filename = 'count.txt';

fs.readFile(filename, 'utf8', (err, data) => {
  if (err) {
    console.error('Error reading file:', err);
    return;
  }

  let vowelCount = 0;

  const vowels = /[aeiouAEIOU]/g;

  const matches = data.match(vowels);

  if (matches) {
    vowelCount = matches.length;
  }

  console.log("Number Of Vowels",vowelCount);
});


