--PRACTICAL-1--
--PART-B--

CREATE TABLE STUDENT (
    RollNo INT ,
    Name VARCHAR(50),
    Birthdate DATE,
    SPI DECIMAL(4, 2),
    City VARCHAR(50),
    Backlog INT,
    Branch VARCHAR(10)
);

INSERT INTO STUDENT (RollNo, Name, Birthdate, SPI, City, Backlog, Branch) VALUES
(101, 'Keyur', '1992-01-05', 8.5, 'Rajkot', 2, 'CE'),
(102, 'Hardik', '1994-02-15', 9.0, 'Ahmedabad', 0, 'CE'),
(103, 'Kajal', '1996-03-14', 10.00, 'Baroda', 0, 'IT'),
(104, 'Bhoomi', '1995-06-23', 8.90, 'Ahmedabad', 1, 'ICT'),
(105, 'Harmit', '1994-02-15', 9.80, 'Rajkot', 1, 'IT'),
(106, 'Jay', '1994-02-15', 7.9, 'Rajkot', 2, 'CE');

--1. Give RollNo and Name of students, whose RollNo is greater than 103 and backlog is greater than 0 and branch is either CE or IT.
SELECT RollNo,NAME FROM STUDENT WHERE RollNo>103 AND Backlog>0 AND Branch ='CE' OR Branch='IT';

--2. Give name of students whose SPI is between 8 and 9 and branch is either CE or IT. (OR & IN)
SELECT Name FROM STUDENT WHERE SPI BETWEEN 8 AND 9 AND Branch='CE' OR Branch='IT';
SELECT Name FROM STUDENT WHERE SPI BETWEEN 8 AND 9 AND Branch IN('CE','IT');

--3. Find all students who do not belongs to ‘CE’ branch.
SELECT * FROM STUDENT WHERE Branch != 'CE';

--4. Display RollNo and Name of first three students.
SELECT TOP 3 RollNo,Name FROM STUDENT; 

--5. Display all the details of first three students whose SPI is greater than 8.5.
SELECT TOP 3 * FROM STUDENT WHERE SPI>8.5;

--6. Retrieve all unique cities using DISTINCT.
SELECT DISTINCT City FROM STUDENT;

--7. Retrieve all unique branches using DISTINCT.
SELECT DISTINCT Branch FROM STUDENT;

--8. Retrieve all the records of student table as per their Backlog in descending order and then SPI in ascending order.
SELECT * FROM STUDENT ORDER BY SPI,Backlog DESC;

--9. Update the branch and city of Jay to MCA and Jamangar respectively.
UPDATE STUDENT SET Branch='MCA',City='Jamnagar' WHERE Name='Jay';

--10. Update the backlog of Keyur and Bhoomi to NULL.
UPDATE STUDENT SET Backlog=NULL WHERE Name IN ('Keyur','Bhoomi');

--11. Display the name of students whose backlog is NULL and backlog is greater than 1 and branch is either CE or IT.
SELECT Name FROM STUDENT WHERE Backlog is NULL AND Backlog>1 AND Branch IN ('CE','IT');
