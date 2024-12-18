// WAP to read student detail speci􀆒ed as per previous program and filter the students with less than 5 SPI (C)

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

    if (parseFloat(StudentSPI) < 5) {
      console.log(`StudentID: ${StudentID}`);
      console.log(`StudentName: ${StudentName}`);
      console.log(`StudentEnrollmentNumber: ${StudentEnrollmentNumber}`);
      console.log(`StudentMobileNumber: ${StudentMobileNumber}`);
      console.log(`StudentDepartment: ${StudentDepartment}`);
      console.log(`StudentSPI: ${StudentSPI}`);
      console.log('------------------------');
    }
  });
});
