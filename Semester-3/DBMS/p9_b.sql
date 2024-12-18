----- PRACTICAL-9 -----
----- PART-B -----

-- Create table as per following schema with proper validation and try to insert data which violate your validation.
-- Emp(Eid, Ename, Did, Cid, Salary, Experience)
-- Dept(Did, Dname)
-- City(Cid, Cname)

CREATE TABLE Dept(
	Did int Primary key, 
	Dname varchar(50) not null
);

CREATE TABLE City1(
	Cid int Primary key, 
	Cname varchar(50) not null
);

CREATE TABLE Emp(
	Eid int Primary key, Ename varchar(50) not null,
	Did int Foreign Key references Dept(Did),
	Cid int Foreign Key references City1(Cid),
	Salary decimal(8,2) not null,
	Experience int check(Experience >= 0)
);



