-----PRACTICAL-15-----
-----PART-A-----

CREATE TABLE PERSON (
    WorkerID INT PRIMARY KEY,
    FirstName VARCHAR(100) NOT NULL,
    LastName VARCHAR(100) NOT NULL,
    Salary DECIMAL(8,2) NOT NULL,
    JoiningDate DATETIME NOT NULL,
    DepartmentID INT NULL,
);

INSERT INTO PERSON (WorkerID, FirstName, LastName, Salary, JoiningDate, DepartmentID)
VALUES 
(101, 'Rahul', 'Anshu', 56000, '1990-01-01', 1),
(102, 'Hardik', 'Hinsu', 18000, '1990-09-25', 2),
(103, 'Bhavin', 'Kamani', 25000, '1991-05-14', NULL),
(104, 'Bhoomi', 'Patel', 39000, '2014-02-20', 1),
(105, 'Rohit', 'Rajgor', 17000, '1990-07-23', 2),
(106, 'Priya', 'Mehta', 25000, '1990-10-18', 2),
(107, 'Neha', 'Trivedi', 18000, '2014-02-20', 3);

-- 1. Write a function to print "hello world".
CREATE FUNCTION Print_HelloWorld()
RETURNS VARCHAR(50)
AS
BEGIN
    RETURN 'Hello World';
END

SELECT DBO.Print_HelloWorld()

-- 2. Write a function which returns addition of two numbers.
CREATE FUNCTION ADD_TWO_NUMBERS(@NUM1 INT,@NUM2 INT)
RETURNS INT
AS
BEGIN
	RETURN @NUM1+@NUM2;
END


SELECT DBO.ADD_TWO_NUMBERS(2,3)

--3. Write a function to print a cube of a given number.
CREATE FUNCTION CUBE(@NUMBER INT)
RETURNS INT
AS
BEGIN
	RETURN @NUMBER*@NUMBER*@NUMBER;
END

SELECT DBO.CUBE(10);

-- 4. Write a function to check whether the given number is ODD or EVEN.
CREATE FUNCTION CHECKEVENODD(@NO INT)
RETURNS VARCHAR(10)
AS
BEGIN
    IF (@NO % 2 = 0)
        RETURN 'Even'
    ELSE
        RETURN 'Odd'
	RETURN ''
END

SELECT DBO.CHECKEVENODD(25);

-- 5. Write a function which returns a table with details of a person whose first name starts with B.
CREATE FUNCTION GetPersonsWithB()
RETURNS @DETAILS TABLE(PNAME VARCHAR(50)) 
AS
BEGIN
	INSERT INTO @DETAILS
		SELECT FirstName FROM PERSON WHERE FirstName LIKE 'B%'

	RETURN 
END

SELECT * FROM DBO.GetPersonsWithB();

-- 6. Write a function which returns a table with unique first names from the person table.
CREATE FUNCTION GetUniqueFirstNames()
RETURNS @NAME TABLE(PNAME VARCHAR(50))
AS
BEGIN
	INSERT INTO @NAME
		SELECT DISTINCT FirstName FROM PERSON
	RETURN
END

SELECT * FROM DBO.GetUniqueFirstNames();