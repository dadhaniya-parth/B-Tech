--PRACTICAL-3--
--PART=A--

CREATE TABLE STUDENT1(
	StuID int,
	FirstName varchar(100),
	LastName varchar(100),
	Website varchar(200),
	City varchar(50),
	Division varchar(50)
  )

  INSERT INTO STUDENT1 VALUES
  (1011,'Keyur', 'Patel', 'techonthenet.com', 'Rajkot', 'II-BCX'),
(1022, 'Hardik', 'Shah', 'digminecraft.com', 'Ahmedabad', 'I-BCY'),
(1033, 'Kajal', 'Trivedi', 'bigactivities.com', 'Baroda', 'IV-DCX'),
(1044, 'Bhoomi', 'Gajera', 'checkyourmath.com', 'AhmedabadV', 'III-DCW'),
(1055, 'Harmit', 'Mitel', NULL, 'Rajkot', 'II-BCY'),
(1066, 'Ashok','Jani', NULL, 'Baroda', 'II-BCZ')

--1. Display the name of students whose name starts with ‘k’.
SELECT FirstName FROM STUDENT1 WHERE FirstName LIKE 'K%';

--2. Display the name of students whose name consists of five characters.
SELECT FirstName FROM STUDENT1 WHERE FirstName LIKE '_____';

--3. Retrieve the first name & last name of students whose city name ends with a & contains six characters.
SELECT FirstName,LastName FROM STUDENT1 WHERE City LIKE '_____a';

--4. Display all the students whose last name ends with ‘tel’.
SELECT * FROM STUDENT1 WHERE LastName LIKE '%tel';

--5. Display all the students whose first name starts with ‘ha’ & ends with‘t’.
SELECT * FROM STUDENT1 WHERE FirstName LIKE 'ha%t';

--6. Display all the students whose first name starts with ‘k’ and third character is ‘y’.
SELECT * FROM STUDENT1 WHERE FirstName LIKE 'k_y%'

--7. Display the name of students having no website and name consists of five characters.
SELECT FirstName FROM STUDENT1 WHERE Website IS NULL AND FirstName LIKE '_____';

--8. Display all the students whose last name consist of ‘jer’.
SELECT * FROM STUDENT1 WHERE LastName LIKE '%jer%';

--9. Display all the students whose city name starts with either ‘r’ or ‘b’.
SELECT * FROM STUDENT1 WHERE City LIKE 'r%' OR City LIKE 'b%';

--10. Display all the name students having websites.
SELECT * FROM STUDENT1 WHERE Website IS NOT NULL;

--11. Display all the students whose name starts from alphabet A to H.
SELECT * FROM STUDENT1 WHERE FirstName LIKE '[A-H]%';

--12. Display all the students whose name’s second character is vowel.
SELECT * FROM STUDENT1 WHERE FirstName LIKE '_[AEIOU]%';

--13. Display student’s name whose city name consist of ‘rod’.
SELECT FirstName FROM STUDENT1 WHERE City LIKE '%rod%';

--14. Retrieve the First & Last Name of students whose website name starts with ‘bi’.
SELECT FirstName,LastName FROM STUDENT1 WHERE Website LIKE 'bi%';

--15. Display student’s city whose last name consists of six characters.
SELECT City FROM STUDENT1 WHERE LastName LIKE '______';

--16. Display all the students whose city name consist of five characters & not starts with ‘ba’.
SELECT * FROM STUDENT1 WHERE City LIKE '_____' AND City NOT LIKE 'ba%';

--17. Show all the student’s whose division starts with ‘II’.
SELECT * FROM STUDENT1 WHERE Division LIKE 'II%';

--18. Find out student’s first name whose division contains ‘bc’ anywhere in division name.
SELECT FirstName FROM STUDENT1 WHERE Division LIKE '%bc%';

--19. Show student id and city name in which division consist of six characters and having website name.
SELECT StuID,City FROM STUDENT1 WHERE Division LIKE '______' AND Website IS NOT NULL;

--20. Display all the students whose name’s third character is consonant.
SELECT * FROM STUDENT1 WHERE FirstName NOT LIKE '__[AEIOU]%';
