--1. Create Procedure that Accepts Department Name and Returns Person Count.
-- GetPersonCountByDepartment HR
CREATE PROCEDURE GetPersonCountByDepartment
    @DepartmentName VARCHAR(100)
AS
BEGIN
    SELECT COUNT(*) AS PersonCount
    FROM PERSON P
    INNER JOIN Department D ON P.DepartmentID = D.DepartmentID
    WHERE D.DepartmentName = @DepartmentName;
END;

--2. Create Procedure that accepts Department Name & Designation as a parameter with given test cases and returns a table with FirstName, LastName, Salary, JoiningDate, DepartmentName & Designation.
-- GetWorkerByDepartmentAndDesignation @DepartmentName = 'IT', @DesignationName = NULL;
-- GetWorkerByDepartmentAndDesignation @DepartmentName = NULL, @DesignationName = 'Jobber';
-- GetWorkerByDepartmentAndDesignation @DepartmentName = 'IT', @DesignationName = 'Jobber';
-- GetWorkerByDepartmentAndDesignation @DepartmentName = NULL, @DesignationName = NULL;
CREATE PROCEDURE GetWorkerByDepartmentAndDesignation
    @DepartmentName VARCHAR(100),
    @DesignationName VARCHAR(100)
AS
BEGIN
    SELECT P.FirstName, P.LastName, P.Salary, P.JoiningDate, D.DepartmentName, Des.DesignationName
    FROM PERSON P
    LEFT JOIN Department D ON P.DepartmentID = D.DepartmentID
    LEFT JOIN Designation Des ON P.DesignationID = Des.DesignationID
    WHERE (D.DepartmentName = @DepartmentName OR @DepartmentName IS NULL)
      AND (Des.DesignationName = @DesignationName OR @DesignationName IS NULL);
END;

--3. Create Procedure that returns DepartmentID, DepartmentName & Count of all person belongs to that
--department. i.e. 1 | Admin | 2

CREATE PROCEDURE SP_DepartmentID_SelectByPK 1
@Did INT
AS
	SELECT 
		D.DepartmentID,
		D.DepartmentName,
		count(p.WorkerID) AS [Worker Count]
	FROM PERSON p left outer join Department D
		ON p.DepartmentID = D.DepartmentID
	WHERE D.DepartmentID = @Did
	GROUP BY D.DepartmentID, D.DepartmentName
