--PRACTICAL-6--
--PART=B--

-- Create the DEPARTMENT table
CREATE TABLE DEPARTMENT (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(100) NOT NULL UNIQUE,
    DepartmentCode VARCHAR(50) NOT NULL UNIQUE,
    Location VARCHAR(50) NOT NULL
);

-- Create the PERSON table
CREATE TABLE PERSON (
    PersonID INT PRIMARY KEY,
    PersonName VARCHAR(100) NOT NULL,
    DepartmentID INT NULL,
    Salary DECIMAL(8,2) NOT NULL,
    JoiningDate DATETIME NOT NULL,
    City VARCHAR(100) NOT NULL,
    FOREIGN KEY (DepartmentID) REFERENCES DEPARTMENT(DepartmentID)
);


INSERT INTO DEPARTMENT (DepartmentID, DepartmentName, DepartmentCode, Location) VALUES
(1, 'Admin', 'Adm', 'A-Block'),
(2, 'Computer', 'CE', 'C-Block'),
(3, 'Civil', 'CI', 'G-Block'),
(4, 'Electrical', 'EE', 'E-Block'),
(5, 'Mechanical', 'ME', 'B-Block');


INSERT INTO PERSON (PersonID, PersonName, DepartmentID, Salary, JoiningDate, City) VALUES
(101, 'Rahul Tripathi', 2, 56000.00, '2000-01-01', 'Rajkot'),
(102, 'Hardik Pandya', 3, 18000.00, '2001-09-25', 'Ahmedabad'),
(103, 'Bhavin Kanani', 4, 25000.00, '2000-05-14', 'Baroda'),
(104, 'Bhoomi Vaishnav', 1, 39000.00, '2005-02-08', 'Rajkot'),
(105, 'Rohit Topiya', 2, 17000.00, '2001-07-23', 'Jamnagar'),
(106, 'Priya Menpara', NULL, 9000.00, '2000-10-18', 'Ahmedabad'),
(107, 'Neha Sharma', 2, 34000.00, '2002-12-25', 'Rajkot'),
(108, 'Nayan Goswami', 3, 25000.00, '2001-07-01', 'Rajkot'),
(109, 'Mehul Bhundiya', 4, 13500.00, '2005-01-09', 'Baroda'),
(110, 'Mohit Maru', 5, 14000.00, '2000-05-25', 'Jamnagar');

--1. Find all persons with their department name & code.
SELECT P.PersonName,D.DepartmentName,D.DepartmentCode FROM PERSON P
INNER JOIN DEPARTMENT D
ON P.DepartmentID = D.DepartmentID;

--2. Give department wise maximum & minimum salary with department name.
SELECT D.DepartmentName,MAX(P.Salary) AS 'MAX_SALARY',MIN(P.Salary) AS 'MIN_SALARY' FROM PERSON P
INNER JOIN DEPARTMENT D
ON P.DepartmentID = D.DepartmentID
GROUP BY D.DepartmentName;

--3. Find all departments whose total salary is exceeding 100000.
SELECT D.DepartmentName,SUM(P.Salary) FROM PERSON P
INNER JOIN DEPARTMENT D
ON P.DepartmentID = D.DepartmentID
GROUP BY D.DepartmentName
HAVING SUM(P.Salary)>100000;

--4. Retrieve person name, salary & department name who belongs to Jamnagar city.
SELECT P.PersonName,P.Salary,D.DepartmentName FROM PERSON P
INNER JOIN DEPARTMENT D
ON P.DepartmentID = D.DepartmentID
WHERE P.City = 'Jamnagar';

--5. Find all persons who does not belongs to any department.
SELECT PersonName FROM PERSON WHERE DepartmentID IS NULL; 

--6. Find department wise person counts.
SELECT D.DepartmentName,COUNT(P.PersonName) FROM PERSON P
INNER JOIN DEPARTMENT D
ON P.DepartmentID = D.DepartmentID
GROUP BY D.DepartmentName;

--7. Find average salary of person who belongs to Ahmedabad city.
SELECT PersonName,AVG(Salary) FROM PERSON
WHERE City = 'Ahmedabad'
GROUP BY PersonName;

--8. Produce Output Like: <PersonName> earns <Salary> from department <DepartmentName> monthly. (In Single Column)


--9. List all departments who have no persons.
SELECT * FROM PERSON P
INNER JOIN DEPARTMENT D
ON P.DepartmentID = D.DepartmentID
WHERE P.PersonID IS NULL;

--10. Find city & department wise total, average & maximum salaries.
SELECT P.City,D.DepartmentName,SUM(P.Salary) AS 'SUM',AVG(P.Salary) AS 'AVG',MAX(P.Salary) AS 'MAX' FROM PERSON P
INNER JOIN DEPARTMENT D
ON P.DepartmentID=D.DepartmentID
GROUP BY P.City,D.DepartmentName;