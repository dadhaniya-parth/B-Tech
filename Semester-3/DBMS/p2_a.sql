--PRACTICAL-2--
--PART-A--

CREATE TABLE Employees (
    EmpNo INT PRIMARY KEY,
    EmpName VARCHAR(100),
    JoiningDate DATE,
    Salary DECIMAL(10, 2),
    City VARCHAR(50)
);

INSERT INTO Employees (EmpNo, EmpName, JoiningDate, Salary, City) VALUES
(101, 'Keyur', '2002-05-01', 12000.00, 'Rajkot'),
(102, 'Hardik', '2004-02-15', 14000.00, 'Ahmedabad'),
(103, 'Kajal', '2006-03-14', 15000.00, 'Baroda'),
(104, 'Bhoomi', '2005-06-23', 12500.00, 'Ahmedabad'),
(105, 'Harmit', '2004-02-15', 14000.00, 'Rajkot');

--1. Display the name of employee whose salary is greater than 13000 and city is either Rajkot or Baroda.
SELECT EmpName FROM EMPLOYEE WHERE Salary>13000 AND City IN('Rajkot','Baroda');

--2. Display the name of employee in ascending order by their name.
SELECT EmpName FROM EMPLOYEE 
ORDER BY EmpName;

--3. Retrieve all unique cities.
SELECT DISTINCT City From EMPLOYEE;

--4. Update the city of Keyur and Bhoomi to NULL.
UPDATE EMPLOYEE SET City=NULL WHERE EmpName='Keyur' OR EmpName='Bhoomi';

--5. Display the name of employee whose city is NULL.
SELECT EmpName FROM EMPLOYEE WHERE City is NULL;

--6. Delete all the records of Employee table having salary greater than and equals to 14000.
DELETE FROM EMPLOYEE WHERE Salary>=14000;

--7. Delete all the Employees who belongs to ‘RAJKOT’ city.
DELETE FROM EMPLOYEE WHERE City='Rajkot';

--8. Delete all the Employees who joined after 1-1-2007.
DELETE FROM EMPLOYEE WHERE JoiningDate>'2007-01-01';

--9. Delete all the records of Employee table. (Use Truncate)
TRUNCATE TABLE EMPLOYEE;

--10. Remove Employee table. (Use Drop)
DROP TABLE EMPLOYEE;

--11. Delete all the records of DEPOSIT table. (Use Truncate)
TRUNCATE TABLE DEPOSIT;

--12. Remove DEPOSIT table. (Use Drop)
DROP TABLE DEPOSIT;

--13. Remove BRANCH table. (Use Drop)
DROP TABLE BRANCH;

--14. Remove CUSTOMERS table. (Use Drop)
DROP TABLE CUSTOMERS;

--15. Remove BORROW table. (Use Drop)
DROP TABLE BORROW;
