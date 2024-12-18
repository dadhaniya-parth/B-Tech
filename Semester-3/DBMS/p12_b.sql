-----PRACTICAL-12-----
-----PART-B-----

--1. Create a Procedure that takes the department name as input and returns a table with all workers working in that department.
-- GetWorkersByDepartment HR
CREATE PROCEDURE GetWorkersByDepartment
    @DepartmentName VARCHAR(100)
AS
BEGIN
    SELECT P.FirstName, P.LastName, P.Salary, P.JoiningDate
    FROM PERSON P
    INNER JOIN Department D ON P.DepartmentID = D.DepartmentID
    WHERE D.DepartmentName = @DepartmentName;
END;

--2. Create Procedure that takes department name & designation name as input and returns a table with worker’s first name, salary, joining date & department name.
-- PROCEDURE GetWorkersByDepartmentAndDesignation @DepartmentName = 'IT', @DesignationName = 'Jobber';
CREATE PROCEDURE GetWorkersByDepartmentAndDesignation
    @DepartmentName VARCHAR(100),
    @DesignationName VARCHAR(100)
AS
BEGIN
    SELECT P.FirstName, P.Salary, P.JoiningDate, D.DepartmentName
    FROM PERSON P
    INNER JOIN Department D ON P.DepartmentID = D.DepartmentID
    INNER JOIN Designation Des ON P.DesignationID = Des.DesignationID
    WHERE D.DepartmentName = @DepartmentName AND Des.DesignationName = @DesignationName;
END;

--3. Create a Procedure that takes the first name as an input parameter and display all the details of the worker with their department & designation name.
-- GetWorkerDetailsByFirstName ROHIT
CREATE PROCEDURE GetWorkerDetailsByFirstName
    @FirstName VARCHAR(100)
AS
BEGIN
    SELECT P.*, D.DepartmentName, Des.DesignationName
    FROM PERSON P
    LEFT JOIN Department D ON P.DepartmentID = D.DepartmentID
    LEFT JOIN Designation Des ON P.DesignationID = Des.DesignationID
    WHERE P.FirstName = @FirstName;
END;

--4. Create Procedure which displays department wise maximum, minimum & total salaries.
-- GetDepartmentSalaryStatistics 
CREATE PROCEDURE GetDepartmentSalaryStatistics
AS
BEGIN
    SELECT D.DepartmentName,
           MAX(P.Salary) AS MaxSalary,
           MIN(P.Salary) AS MinSalary,
           SUM(P.Salary) AS TotalSalary
    FROM Department D
    LEFT JOIN PERSON P ON D.DepartmentID = P.DepartmentID
    GROUP BY D.DepartmentName;
END;

