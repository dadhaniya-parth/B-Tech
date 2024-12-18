--PRACTICAL-4--
--PART=A--

CREATE TABLE EMPLOYEE (
    Emp_ID INT PRIMARY KEY,
    Emp_Name VARCHAR(50),
    Emp_Salary DECIMAL(10, 2),
    Emp_Department VARCHAR(50),
    Emp_City VARCHAR(50),
    Emp_JoinDate DATE
);

-- Insert provided data into EMPLOYEE table
INSERT INTO EMPLOYEE (Emp_ID, Emp_Name, Emp_Salary, Emp_Department, Emp_City, Emp_JoinDate) VALUES 
(101, 'Rahul', 56000, 'Admin', 'Rajkot', '1990-01-01'),
(102, 'Hardik', 18000, 'IT', 'Ahmedabad', '1990-09-25'),
(103, 'Bhavin', 25000, 'HR', 'Baroda', '1991-05-14'),
(104, 'Bhoomi', 39000, 'Admin', 'Rajkot', '1991-02-08'),
(105, 'Rohit', 17000, 'IT', 'Jamnagar', '1990-07-23'),
(106, 'Priya', 9000, 'IT', 'Ahmedabad', '1990-10-18'),
(107, 'Neha', 34000, 'HR', 'Rajkot', '1991-12-25');

--1. Display the Highest, Lowest, Total, and Average salary of all employees. Label the columns Maximum, Minimum, Total_Sal and Average_Sal, respectively.
SELECT  MAX(Emp_Salary) AS MAXXIMUM,MIN(Emp_Salary) AS MINIMUM,AVG(Emp_Salary) AS AVG_SAL,
SUM(Emp_Salary) AS TOTAL_SAL FROM EMPLOYEE;

--2. Find total number of employees of EMPLOYEE table.
SELECT COUNT(Emp_Name) AS TOTAL_EMP FROM EMPLOYEE;

--3. Give maximum salary from IT department.
SELECT MAX(Emp_Salary) FROM EMPLOYEE WHERE Emp_Department='IT';

--4. Count total number of cities of employee without duplication.
SELECT COUNT( DISTINCT Emp_City) FROM EMPLOYEE;

--5. Display city with the total number of employees belonging to each city.
SELECT Emp_City,COUNT(Emp_ID) FROM EMPLOYEE GROUP BY Emp_City;

--6. Display city having more than one employee.
SELECT Emp_City,COUNT(Emp_ID) FROM EMPLOYEE GROUP BY Emp_City HAVING COUNT(Emp_ID)>1;

--7. Give total salary of each department of EMPLOYEE table.
SELECT Emp_Department,SUM(Emp_Salary) FROM EMPLOYEE GROUP BY Emp_Department;

--8. Give average salary of each department of EMPLOYEE table without displaying the respective department name.
SELECT AVG(Emp_Salary) FROM EMPLOYEE GROUP BY Emp_Department;

--9. Give minimum salary of employee who belongs to Ahmedabad.
SELECT MIN(Emp_Salary) FROM EMPLOYEE WHERE Emp_City='Ahmedabad';

--10. List the departments having total salaries more than 50000 and located in city Rajkot.
SELECT Emp_Department,SUM(Emp_Salary) FROM EMPLOYEE WHERE Emp_City='Rajkot' GROUP BY Emp_Department HAVING SUM(Emp_Salary)>50000;

--11. Count the number of employees living in Rajkot.
SELECT COUNT(Emp_Salary) FROM EMPLOYEE WHERE Emp_City='Rajkot';

--12. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
SELECT MAX(Emp_Salary)-MIN(Emp_Salary) AS DIFERANCE FROM EMPLOYEE;

--13. Display the total number of employees hired before 1st January, 1991.
SELECT COUNT(Emp_ID) FROM EMPLOYEE WHERE Emp_JoinDate<'1991-01-01';

--14. Display total salary of each department with total salary exceeding 35000 and sort the list by total salary.
SELECT Emp_Department,SUM(Emp_Salary) FROM EMPLOYEE GROUP BY Emp_Department HAVING SUM(Emp_Salary)>35000 ORDER BY SUM(Emp_Salary);

--15. List out department names in which more than two employees.
SELECT Emp_Department,COUNT(Emp_Name) FROM EMPLOYEE GROUP BY Emp_Department HAVING COUNT(Emp_Name)>2;