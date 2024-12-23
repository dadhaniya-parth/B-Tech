// WAP to read student details from the file named students.txt, student details are stored line by line with following comma
// seperated 􀆒elds (C)
// ◦ StudentID
// ◦ StudentName
// ◦ StudentEnrollmentNumber
// ◦ StudentMobileNumber
// ◦ StudentDepartment
// ◦ StudentSPI

const fs = require('fs');

const filename = 'students.txt';

fs.readFile(filename, 'utf8', (err, data) => {
  if (err) {
    console.error('Error reading file:', err);
    return;
  }

  const lines = data.trim().split('\n');

  lines.forEach((line) => {
    const [StudentID, StudentName, StudentEnrollmentNumber, StudentMobileNumber, StudentDepartment, StudentSPI] = line.split(',');

    // Print student details
    console.log(`StudentID: ${StudentID}`);
    console.log(`StudentName: ${StudentName}`);
    console.log(`StudentEnrollmentNumber: ${StudentEnrollmentNumber}`);
    console.log(`StudentMobileNumber: ${StudentMobileNumber}`);
    console.log(`StudentDepartment: ${StudentDepartment}`);
    console.log(`StudentSPI: ${StudentSPI}`);
    console.log('----------------------');
  });
});
