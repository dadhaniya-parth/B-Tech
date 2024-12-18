--PRACTICAL-6--
--PART=A--

-- Create the STUDENT table
CREATE TABLE STUDENT6 (
    Rno INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Branch VARCHAR(50) NOT NULL
);

-- Create the RESULT table
CREATE TABLE RESULT (
    Rno INT,
    SPI DECIMAL(3,1) NOT NULL,
    PRIMARY KEY (Rno),
);

-- Create the EMPLOYEE table
CREATE TABLE EMPLOYEE6 (
    EmployeeNo VARCHAR(10) PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    ManagerNo VARCHAR(10),
);


-- Insert data into the STUDENT table
INSERT INTO STUDENT6(Rno, Name, Branch) VALUES
(101, 'Raju', 'CE'),
(102, 'Amit', 'CE'),
(103, 'Sanjay', 'ME'),
(104, 'Neha', 'EC'),
(105, 'Meera', 'EE'),
(106, 'Mahesh', 'ME');

-- Insert data into the RESULT table
INSERT INTO RESULT (Rno, SPI) VALUES
(101, 8.8),
(102, 9.2),
(103, 7.6),
(104, 8.2),
(105, 7.0),
(106, 8.9);

-- Insert data into the EMPLOYEE table
INSERT INTO EMPLOYEE6(EmployeeNo, Name, ManagerNo) VALUES
('E01', 'Tarun', NULL),
('E02', 'Rohan', 'E02'),
('E03', 'Priya', 'E01'),
('E04', 'Milan', 'E03'),
('E05', 'Jay', 'E01'),
('E06', 'Anjana', 'E04');

--1. Combine information from student and result table using cross join or Cartesian product.
SELECT * FROM STUDENT6 CROSS JOIN RESULT;

--2. Display Rno, Name, Branch and SPI of all students.
SELECT s.Rno,s.Name,s.Branch,r.SPI FROM STUDENT6 s
INNER JOIN RESULT r
ON s.Rno = r.Rno;

--3. Display Rno, Name, Branch and SPI of CE branch’s student only.
SELECT s.Rno,s.Name,s.Branch,r.SPI FROM STUDENT6 s
INNER JOIN RESULT r
ON s.Rno = r.Rno
WHERE s.Branch = 'CE';

--4. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
SELECT s.Rno,s.Name,s.Branch,r.SPI FROM STUDENT6 s
INNER JOIN RESULT r
ON s.Rno = r.Rno
WHERE s.Branch != 'EC';

--5. Display average result of each branch.
SELECT s.Branch,AVG(r.SPI) FROM STUDENT6 s
INNER JOIN RESULT r
ON s.Rno = r.Rno
GROUP BY s.Branch

--6. Display average result of each branch and sort them in ascending order by SPI.
SELECT s.Branch,AVG(r.SPI) FROM STUDENT6 s
INNER JOIN RESULT r
ON s.Rno = r.Rno
GROUP BY s.Branch
ORDER BY AVG(r.SPI);

--7. Display average result of CE and ME branch.
SELECT s.Branch,AVG(r.SPI) FROM STUDENT6 s
INNER JOIN RESULT r
ON s.Rno = r.Rno
WHERE s.Branch IN('CE','ME')
GROUP BY s.Branch

--8. Perform the left outer join on Student and Result tables.
SELECT * FROM STUDENT6 s
LEFT JOIN RESULT r
ON s.Rno = r.Rno;

--9. Perform the right outer join on Student and Result tables.
SELECT * FROM STUDENT6 s
RIGHT JOIN RESULT r
ON s.Rno = r.Rno;

--10. Perform the full outer join on Student and Result tables.
SELECT * FROM STUDENT6 s
FULL OUTER JOIN RESULT r
ON s.Rno = r.Rno;

--11. Retrieve the names of employee along with their manager name from the Employee table.
SELECT E1.Name AS EmployeeName,  E2.Name AS ManagerName
FROM EMPLOYEE6 E1
INNER JOIN EMPLOYEE6 E2 
ON E1.ManagerNo = E2.EmployeeNo;
 