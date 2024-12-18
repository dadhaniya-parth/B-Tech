--PRACTICAL-3--
--PART=B--

CREATE TABLE CUSTOMER(
	CID int,
	CustomerName varchar(100),
	ContactName varchar(100),
	Address varchar(200),
	City varchar(50),
	PostalCode varchar(50),
	Country varchar(50)
)

INSERT INTO CUSTOMER VALUES
(1, 'Alfreds Futterkiste', 'Maria Anders', 'Obere Str. 57', 'Berlin', '12209', 'Germany'),
(2, 'AAna Trujillo Emparedados y helados', 'Ana Trujillo', 'Avda. de la Constit', 'Mexico D.F.', '05021', 'Mexico'),
(3, 'Antonio Moreno Taqueria', 'Antonio Moreno', 'Mataderos 2312 ', 'Mexico D.F.', '05023', 'Mexico'),
(4, 'Around the Horn', 'Thomas Hardy', '120 Hanover Sq.', 'London', 'WA1 1DP', 'UK'),
(5, 'Berglunds snabbkop ', 'Christina Berglund', 'Berguvsvagen 8', 'Lulea', 'S-958 22', 'Sweden')

--1. Return all customers from a city that starts with 'L' followed by one wildcard character, then 'nd' and then two wildcard characters.
SELECT * FROM CUSTOMER WHERE City LIKE 'L_ND__';

--2. Return all customers from a city that contains the letter 'L'.
SELECT * FROM CUSTOMER WHERE City LIKE '%L%';

--3. Return all customers from a city that do not contains the letter 'L'.
SELECT * FROM CUSTOMER WHERE City NOT LIKE '%L%';

--4. Return all customers that starts with 'La'.
SELECT * FROM CUSTOMER WHERE CustomerName LIKE 'LA%';

--5. Return all customers that do not starts with 'La'.
SELECT * FROM CUSTOMER WHERE CustomerName NOT LIKE 'LA%';

--6. Return all customers that starts with 'a' or starts with 'b'.
SELECT * FROM CUSTOMER WHERE CustomerName LIKE 'A%' OR CustomerName LIKE 'B%';

--7. Return all customers that starts with 'a' or starts with 'c' or starts with ’t’.
SELECT * FROM CUSTOMER WHERE CustomerName LIKE 'A%' OR CustomerName LIKE 'C%' OR CustomerName LIKE 'T%';

--8. Return all customers that starts with 'a' to ’d’.
SELECT * FROM CUSTOMER WHERE CustomerName LIKE '[A-D]%';

--9. Return all customers that ends with 'a'.
SELECT * FROM CUSTOMER WHERE CustomerName LIKE '%A';

--10. Return all customers that do not ends with 'a'.
SELECT * FROM CUSTOMER WHERE CustomerName NOT LIKE '%A';

--11. Return all customers that starts with 'b' and ends with ’s’.
SELECT * FROM CUSTOMER WHERE CustomerName LIKE 'B%S'; 

--12. Return all customers that contains the phrase 'or'.
SELECT * FROM CUSTOMER WHERE CustomerName LIKE '%OR%';

--13. Return all customers that starts with "a" and are at least 3 characters in length.
SELECT * FROM CUSTOMER WHERE CustomerName LIKE 'A__';

--14. Return all customers that have "r" in the second position.
SELECT * FROM CUSTOMER WHERE CustomerName LIKE '_R%';

--15. Return all customers from Spain.
SELECT * FROM CUSTOMER WHERE Country='Spain';