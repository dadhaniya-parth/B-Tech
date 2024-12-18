----- PRACTICAL-9 -----
----- PART-C -----

-- Create table as per following schema with proper validation and try to insert data which violate your validation.

--Emp(Eid, Ename, Did, Cid, Salary, Experience)
-- Dept(Did, Dname)
-- City(Cid, Cname, Did))
-- District(Did, Dname, Sid)
-- State(Sid, Sname, Cid)
-- Country(Cid, Cname)

CREATE TABLE Dept2(
	Did int Primary key, 
	Dname varchar(50) not null
);

CREATE TABLE Country2(
	Cid int Primary key, 
	Cname varchar(50) not null
);

CREATE TABLE State2(
	Sid int Primary key, 
	Sname varchar(50) not null,
	Cid int Foreign Key references Country2(Cid)
);

CREATE TABLE District2(
	Did int Primary key, 
	Dname varchar(50) not null,
	Sid int Foreign Key references State2(Sid)
);

CREATE TABLE City2(
	Cid int Primary key, 
	Cname varchar(50) not null,
	Did int Foreign Key references District2(Did)
);

CREATE TABLE Emp2(
	Eid int Primary key, Ename varchar(50) not null,
	Did int Foreign Key references Dept2(Did),
	Cid int Foreign Key references City2(Cid),
	Salary decimal(8,2) not null,
	Experience int check(Experience >= 0)
);


INSERT INTO Dept2 VALUES(1, 'Admin')
INSERT INTO Dept2 VALUES(2, 'Computer')
INSERT INTO Dept2 VALUES(3, 'Civil')
INSERT INTO Dept2 VALUES(4, 'Electrical')
INSERT INTO Dept2 VALUES(5, 'Mechanical')

INSERT INTO Country2 VALUES(1, 'IND')
INSERT INTO Country2 VALUES(2, 'USA')
INSERT INTO Country2 VALUES(3, 'UK')
INSERT INTO Country2 VALUES(4, 'UAE')
INSERT INTO Country2 VALUES(5, 'AUS')

INSERT INTO State2 VALUES(1, 'Gujarat', 1)
INSERT INTO State2 VALUES(2, 'Maharastra', 1)
INSERT INTO State2 VALUES(3, 'Dilhi', 1)
INSERT INTO State2 VALUES(4, 'London', 3)
INSERT INTO State2 VALUES(5, 'California', 2)

INSERT INTO District2 VALUES(1,'Rajkot',1)
INSERT INTO District2 VALUES(2,'Jamnagar',1)
INSERT INTO District2 VALUES(3,'Konkan',2)
INSERT INTO District2 VALUES(4,'Ahmedabad',1)
INSERT INTO District2 VALUES(5,'Bhavnagar',1)

INSERT INTO City2 VALUES(1, 'Rajkot', 1)
INSERT INTO City2 VALUES(2, 'Jamnagar', 2)
INSERT INTO City2 VALUES(3, 'Mumbai', 3)
INSERT INTO City2 VALUES(4, 'Ahmedabad', 4)
INSERT INTO City2 VALUES(5, 'Bhavnagar', 5)

INSERT INTO Emp2 VALUES(1,'ABC',1,1,50000,15)
INSERT INTO Emp2 VALUES(2,'BCD',2,3,30000,7)
INSERT INTO Emp2 VALUES(3,'CDE',2,4,35000,10)
INSERT INTO Emp2 VALUES(4,'DEF',3,2,20000,5)
INSERT INTO Emp2 VALUES(5,'EFG',4,5,40000,13)

--3. Display employeename, departmentname, Salary, Experience, City, District, State and country of all employees.

SELECT e.Ename,d.Dname,e.Salary,e.Experience,c.Cname,di.Dname,s.Sname,co.Cname FROM Emp2 e 
INNER JOIN Dept2 d ON e.Did=d.Did 
INNER JOIN City2 c ON e.Cid=c.Cid 
INNER JOIN District2 di ON c.Did = di.Did 
INNER JOIN State2 s ON di.Sid=s.Sid 
INNER JOIN Country2 co ON s.Cid=co.Cid

