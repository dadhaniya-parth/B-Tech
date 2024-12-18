----- PRACTICAL-9 -----
----- PART-A -----
-- Table Creation for CITY
CREATE TABLE CITY (
	CITYID INT PRIMARY KEY,
	CITYNAME VARCHAR(50) UNIQUE NOT NULL,
	PINCODE VARCHAR(50) NOT NULL,
	REMARKS VARCHAR(50)
);

INSERT INTO CITY (CITYID, CITYNAME, PINCODE, REMARKS) VALUES
(1, 'Rajkot', '360005', 'Good'),
(2, 'Surat', '335009', 'Very Good'),
(3, 'Baroda', '390001', 'Awesome'),
(4, 'Jamnagar', '361003', 'Smart'),
(5, 'Junagadh', '362229', 'Historic'),
(6, 'Morvi', '363641', 'Ceramic');

CREATE TABLE VILLAGE (
	VID INT PRIMARY KEY,
	Name VARCHAR(50) NOT NULL,
	CityID int,
	FOREIGN KEY (CityID) REFERENCES CITY(CITYID)
);

INSERT INTO VILLAGE (VID, Name, CityID) VALUES
(101, 'Raiya', 1),
(102, 'Madhapar', 1),
(103, 'Dodka', 3),
(104, 'Falla', 4),
(105, 'Bhesan', 5),
(106, 'Dhoraji', 5);

--1. Display all the villages of Rajkot city.

SELECT v.Name FROM VILLAGE v INNER JOIN CITY c ON v.CityID = c.CityID WHERE c.CITYNAME = 'Rajkot'

--2. Display city along with their villages & pin code.

SELECT c.CITYNAME,v.Name,c.Pincode FROM VILLAGE v inner join CITY c ON v.CityID = c.CityID 

--3. Display the city having more than one village.

SELECT c.CITYNAME,COUNT(v.CityID) AS [Number of Village] FROM VILLAGE v FULL OUTER JOIN 
CITY c ON v.CityID = c.CityID GROUP BY c.CITYNAME,v.CityID HAVING COUNT(v.CityID) > 1

--4. Display the city having no village.

SELECT c.CITYNAME,COUNT(v.CityID) AS [Number of Village] FROM VILLAGE v 
FULL OUTER JOIN CITY c ON v.CityID = c.CityID GROUP BY c.CITYNAME,v.CityID HAVING COUNT(v.CityID)=0

--5. Count the total number of villages in each city.

SELECT c.CITYNAME,COUNT(v.CityID) AS [Number of Village] FROM VILLAGE v FULL OUTER JOIN CITY c ON v.CityID = c.CityID GROUP BY c.CITYNAME,v.CityID 

--6. Count the number of cities having more than one village.

SELECT c.CITYNAME,COUNT(v.CityID) AS [Number of Village] FROM VILLAGE v 
FULL OUTER JOIN CITY c ON v.CityID = c.CityID GROUP BY c.CITYNAME,v.CityID HAVING COUNT(v.CityID) > 1 

------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE STUDENT (
	Rno int PRIMARY KEY,
	Name VARCHAR(50),
	Branch VARCHAR(50) DEFAULT 'General',
	SPI DECIMAL(4,2) CHECK (SPI>=0 AND SPI<=10),
	Bklog INT CHECK (Bklog >= 0),
);

INSERT INTO STUDENT (Rno,Name,Branch,SPI,Bklog) VALUES
(101,'Raju','CE',8.80,0),
(102,'Amit','CE',2.20,3),
(103,'Sanjay','ME',1.50,6),
(104,'Neha','EC',7.65,0),
(105,'Meera','EE',5.52,2),
(106,'Mahesh',DEFAULT,4.50,3);

--Try to update SPI of Raju from 8.80 to 12.
UPDATE STUDENT SET SPI= 12 WHERE Name='Raju'

--Try to update Bklog of Neha from 0 to -1.
UPDATE STUDENT SET Bklog=-1 WHERE Name='Neha'

