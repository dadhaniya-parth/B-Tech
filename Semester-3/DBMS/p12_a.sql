-----PRACTICAL-12-----
----- PART-A -----

CREATE TABLE PERSON (
    WorkerID INT PRIMARY KEY IDENTITY(1,1),
    FirstName VARCHAR(100) NOT NULL,
    LastName VARCHAR(100) NOT NULL,
    Salary DECIMAL(8,2) NOT NULL,
    JoiningDate DATETIME NOT NULL,
    DepartmentID INT NULL,
    DesignationID INT NULL,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
    FOREIGN KEY (DesignationID) REFERENCES Designation(DesignationID)
);

CREATE TABLE Department (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Designation (
    DesignationID INT PRIMARY KEY,
    DesignationName VARCHAR(100) NOT NULL UNIQUE
);

SELECT * FROM PERSON;

SET IDENTITY_INSERT PERSON ON;

INSERT INTO PERSON (WorkerID, FirstName, LastName, Salary, JoiningDate, DepartmentID, DesignationID)
VALUES 
(101, 'Rahul', 'Anshu', 56000, '1990-01-01', 1, 12),
(102, 'Hardik', 'Hinsu', 18000, '1990-09-25', 2, 11),
(103, 'Bhavin', 'Kamani', 25000, '1991-05-14', NULL, 11),
(104, 'Bhoomi', 'Patel', 39000, '2014-02-20', 1, 13),
(105, 'Rohit', 'Rajgor', 17000, '1990-07-23', 2, 15),
(106, 'Priya', 'Mehta', 25000, '1990-10-18', 2, NULL),
(107, 'Neha', 'Trivedi', 18000, '2014-02-20', 3, 15);

SET IDENTITY_INSERT PERSON OFF;

INSERT INTO Department (DepartmentID, DepartmentName)
VALUES
(1, 'Admin'),
(2, 'IT'),
(3, 'HR'),
(4, 'Account');

INSERT INTO Designation (DesignationID, DesignationName)
VALUES
(11, 'Jobber'),
(12, 'Welder'),
(13, 'Clerk'),
(14, 'Manager'),
(15, 'CEO');

--1. Create a Procedure on Department, Designation & Person Table for INSERT, UPDATE & DELETE Procedures.

-- 1
-- PR_DEPARTMENT_INSERT 5,'Computer'
CREATE PROCEDURE SP_DEPARTMENT_INSERT
@DepartmentID INT,
@DepartmentName VARCHAR(100)
AS
BEGIN
	INSERT INTO Department (DepartmentID,DepartmentName) 
	VALUES (@DepartmentID,@DepartmentName)
END

-- SP_DEPARTMENT_UPDATE1 1,'CE'
CREATE PROC SP_DEPARTMENT_UPDATE1
	@DEPARTMENTID INT,
	@DEPARTMENTNAME VARCHAR (100)
AS 
BEGIN
	UPDATE Department SET DEPARTMENTNAME = @DEPARTMENTNAME
	WHERE(DEPARTMENTID = @DEPARTMENTID)
END

-- SP_DEPARTMENT_DELETE 4
CREATE PROC SP_DEPARTMENT_DELETE
	@DEPARTMENTID INT
AS 
BEGIN
	DELETE FROM Department WHERE DEPARTMENTID = @DEPARTMENTID
END

-- SP_DESIGNATION_INSERT 16,'Principle'
CREATE PROCEDURE SP_DESIGNATION_INSERT
@DesignationID INT,
@DesignationName VARCHAR(100)
AS
BEGIN
	INSERT INTO Designation(DesignationID,DesignationName) 
	VALUES (@DesignationID,@DesignationName)
END

-- SP_DESIGNATION_UPDATE 12,'PEON'
CREATE PROC SP_DESIGNATION_UPDATE
	@DESIGNATIONID INT,
	@DESIGNATIONNAME VARCHAR(100)
AS
BEGIN
	UPDATE DESIGNATION SET DESIGNATIONNAME = @DESIGNATIONNAME
	WHERE(DESIGNATIONID = @DESIGNATIONID)
END

-- SP_DESIGNATION_DELETE 16
CREATE PROC SP_DESIGNATION_DELETE
	@DESIGNATIONID INT
AS 
BEGIN
	DELETE FROM DESIGNATION WHERE DESIGNATIONID = @DESIGNATIONID
END

-- PR_PERSON_INSERT 109, 'DEV', 'JAVIYA', 22000, '2015-01-30', 1,11
CREATE PROC PR_PERSON_INSERT
	@WORKERID INT,
	@FirstName VARCHAR(100),
	@LastName Varchar (100), 
	@Salary Decimal (8,2),
	@JoiningDate DATETIME,
	@DepartmentID Int,
	@DesignationID Int
AS 
BEGIN
	INSERT INTO PERSON(WORKERID,FirstName,LastName,Salary,JoiningDate,DepartmentID,DesignationID)
	VALUES(@WORKERID,@FirstName,@LastName,@Salary,@JoiningDate,@DepartmentID,@DesignationID)
END

-- PR_PERSON_UPDATE 109,40000
CREATE PROC PR_PERSON_UPDATE
	@WORKERID INT,
	@Salary Decimal (8,2)
AS
BEGIN
	UPDATE PERSON SET Salary = @Salary
	WHERE(WORKERID=@WORKERID)
END

-- PR_PERSON_DELETE DEV
CREATE PROC PERSON_DELETE
	@FIRSTNAME VARCHAR(100)
AS
BEGIN
	DELETE FROM PERSON WHERE  FIRSTNAME=@FIRSTNAME
END

-- SELECT BY PRIMARY KEY Procedure

-- SelectPersonByID 101
CREATE PROCEDURE SelectPersonByID
    @WorkerID INT
AS
BEGIN
    SELECT * FROM PERSON WHERE WorkerID = @WorkerID;
END;

-- DEPARTMENT SelectDepartmentByID 2
CREATE PROCEDURE SelectDepartmentByID
    @DepartmentID INT
AS
BEGIN
    SELECT * FROM Department WHERE DepartmentID = @DepartmentID;
END;

-- SelectDesignationByID 12
CREATE PROCEDURE SelectDesignationByID
    @DesignationID INT
AS
BEGIN
    SELECT * FROM Designation WHERE DesignationID = @DesignationID;
END;

-- SELECT with JOIN Procedure for Person

-- SelectPersonWithDetails 103
CREATE PROCEDURE SelectPersonWithDetails
    @WorkerID INT
AS
BEGIN
    SELECT P.FirstName, P.LastName, P.Salary, P.JoiningDate, D.DepartmentName, Des.DesignationName
    FROM PERSON P
    LEFT JOIN Department D ON P.DepartmentID = D.DepartmentID
    LEFT JOIN Designation Des ON P.DesignationID = Des.DesignationID
    WHERE P.WorkerID = @WorkerID;
END;

-- Similar procedures can be created for Department and Designation if needed

-- SelectDepartmentWithPersons 1
CREATE PROCEDURE SelectDepartmentWithPersons
    @DepartmentID INT
AS
BEGIN
    SELECT D.DepartmentName, P.FirstName, P.LastName, P.Salary
    FROM Department D
    LEFT JOIN PERSON P ON D.DepartmentID = P.DepartmentID
    WHERE D.DepartmentID = @DepartmentID;
END;

-- SelectDesignationWithPersons 12
CREATE PROCEDURE SelectDesignationWithPersons
    @DesignationID INT
AS
BEGIN
    SELECT Des.DesignationName, P.FirstName, P.LastName, P.Salary
    FROM Designation Des
    LEFT JOIN PERSON P ON Des.DesignationID = P.DesignationID
    WHERE Des.DesignationID = @DesignationID;
END;

-- first 3 persons in capital letters
-- SelectFirstThreePersons 
CREATE PROCEDURE SelectFirstThreePersons
AS
BEGIN
    SELECT UPPER(FirstName) AS FirstName, UPPER(LastName) AS LastName, Salary, JoiningDate
    FROM PERSON
    ORDER BY WorkerID
    OFFSET 0 ROWS FETCH NEXT 3 ROWS ONLY;
END;