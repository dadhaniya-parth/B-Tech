--PRACTICAL-1--
--PART=A--

--Part - A
CREATE TABLE DEPOSIT(
	ACTNO INT,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2),
	ADATE DATETIME
)

CREATE TABLE BRANCH(
	BNAME VARCHAR(50),
	CITY VARCHAR(50)
)

CREATE TABLE CUSTOMERS(
	CNAME VARCHAR(50),
	CITY VARCHAR(50)
)

CREATE TABLE BORROW(
	LOANNO INT,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2)
)

INSERT INTO DEPOSIT (ACTNO, CNAME, BNAME, AMOUNT, ADATE) VALUES
(101, 'ANIL', 'VRCE', 1000.00, '1995-03-01'),
(102, 'SUNIL', 'AJNI', 5000.00, '1996-04-01'),
(103, 'MEHUL', 'KAROLBAGH', 3500.00, '1995-11-17'),
(104, 'MADHURI', 'CHANDI', 1200.00, '1995-12-17'),
(105, 'PRMOD', 'M.G. ROAD', 3000.00, '1996-03-27'),
(106, 'SANDIP', 'ANDHERI', 2000.00, '1996-03-31'),
(107, 'SHIVANI', 'VIRAR', 1000.00, '1995-09-05'),
(108, 'KRANTI', 'NEHRU PLACE', 5000.00, '1995-07-02'),
(109, 'MINU', 'POWAI', 7000.00, '1995-08-10');

--SELECT * FROM DEPOSIT

INSERT INTO BRANCH (BNAME, CITY) VALUES
('VRCE', 'NAGPUR'),
('AJNI', 'NAGPUR'),
('KAROLBAGH', 'DELHI'),
('CHANDI', 'DELHI'),
('DHARAMPETH', 'NAGPUR'),
('M.G. ROAD', 'BANGALORE'),
('ANDHERI', 'BOMBAY'),
('VIRAR', 'BOMBAY'),
('NEHRU PLACE', 'DELHI'),
('POWAI', 'BOMBAY');

--SELECT * FROM BRANCH

INSERT INTO CUSTOMERS(CNAME, CITY) VALUES
('ANIL', 'CALCUTTA'),
('SUNIL', 'DELHI'),
('MEHUL', 'BARODA'),
('MANDAR', 'PATNA'),
('MADHURI', 'NAGPUR'),
('PRAMOD', 'NAGPUR'),
('SANDIP', 'SURAT'),
('SHIVANI', 'BOMBAY'),
('KRANTI', 'BOMBAY'),
('NAREN', 'BOMBAY');

--SELECT * FROM CUSTOMERS

INSERT INTO BORROW(LOANNO, CNAME, BNAME, AMOUNT) VALUES
(201, 'ANIL', 'VRCE', 1000.00),
(206, 'MEHUL', 'AJNI', 5000.00),
(311, 'SUNIL', 'DHARAMPETH', 3000.00),
(321, 'MADHURI', 'ANDHERI', 2000.00),
(375, 'PRMOD', 'VIRAR', 8000.00),
(481, 'KRANTI', 'NEHRU PLACE', 3000.00);

--1. Retrieve all data from table DEPOSIT.
SELECT * FROM DEPOSIT;

--2. Retrieve all data from table BORROW.
SELECT * FROM BORROW;

--3. Retrieve all data from table CUSTOMERS.
SELECT * FROM CUSTOMERS;

--4. Insert a record (550,’JAY’,’AJNI’,NULL)in the BORROW table.
INSERT INTO BORROW VALUES (550,'JAY','AJNI',NULL);

--5. Display Account No, Customer Name & Amount from DEPOSIT.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT;

--6. Display Loan No, Amount from BORROW.
SELECT LOANNO,AMOUNT FROM BORROW;

--7. Display loan details of all customers who belongs to ‘ANDHERI’ branch.
SELECT * FROM BORROW WHERE BNAME='ANDHERI';

--8. Give account no and amount of depositor, whose account no is equals to 106.
SELECT ACTNO,AMOUNT FROM DEPOSIT WHERE ACTNO=106;

--9. Give name of borrowers having amount greater than 5000.
SELECT CNAME FROM BORROW WHERE AMOUNT>5000;

--10. Give name of customers who opened account after date '1-12-96'.
SELECT CNAME FROM  DEPOSIT WHERE ADATE>'1996-12-1';

--11. Display name of customers whose account no is less than 105.
SELECT CNAME FROM DEPOSIT WHERE ACTNO<105;

--12. Display name of customer who belongs to either ‘NAGPUR’ Or ‘DELHI’. (OR & IN)
SELECT CNAME FROM CUSTOMERS WHERE CITY='NAGPUR' OR CITY='DELHI';
SELECT CNAME FROM CUSTOMERS WHERE CITY IN('NAGPUR','DELHI');

--13. Display name of customers with branch whose amount is greater than 4000 and account no is less than 105.
SELECT CNAME,BNAME FROM DEPOSIT WHERE AMOUNT>4000 AND ACTNO<105;

--14. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000.(AND & BETWEEN)
SELECT CNAME FROM BORROW WHERE AMOUNT>=3000 AND AMOUNT<=8000;
SELECT CNAME FROM BORROW WHERE AMOUNT BETWEEN 3000 AND 8000;

--15. Find all depositors who do not belongs to ‘ANDHERI’ branch.
SELECT CNAME FROM DEPOSIT WHERE BNAME != 'ANDHERI';

--16. Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’ Or ‘M.G.ROAD’ and Account No is less than 104.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT WHERE BNAME IN('AJNI','KAROLBAGH','M. G. ROAD') AND ACTNO<104;  

--17. Display all the details of first five customers.
SELECT TOP 5 * FROM CUSTOMERS;

--18. Display all the details of first three depositors whose amount is greater than 1000.
SELECT TOP 3 * FROM DEPOSIT WHERE AMOUNT>1000;

--19. Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to ‘ANDHERI’.
SELECT TOP 5 LOANNO,CNAME FROM BORROW WHERE BNAME != 'ANDHERI';

--20. Retrieve all unique cities using DISTINCT. (Use Customers Table)
SELECT DISTINCT CITY FROM CUSTOMERS;

--21. Retrieve all unique branches using DISTINCT. (Use Branch Table)
SELECT DISTINCT BNAME FROM BRANCH;

--22. Retrieve all the records of customer table as per their city name in ascending order.
SELECT * FROM CUSTOMERS ORDER BY CITY;

--23. Retrieve all the records of deposit table as per their amount column in descending order.
SELECT * FROM DEPOSIT ORDER BY AMOUNT DESC;

--24. Update deposit amount of all customers from 3000 to 5000.
UPDATE DEPOSIT SET AMOUNT=5000 WHERE AMOUNT=3000;

--25. Change branch name of ANIL from VRCE to C.G. ROAD. (Use Borrow Table)
UPDATE BORROW SET BNAME='C. G. ROAD' WHERE CNAME='ANIL';

--26. Update Account No of SANDIP to 111 & Amount to 5000.
UPDATE DEPOSIT SET ACTNO=111,AMOUNT=5000 WHERE CNAME='SANDIP';

--27. Give 10% Increment in Loan Amount.
UPDATE BORROW SET AMOUNT=AMOUNT+AMOUNT*0.1;

--28. Update deposit amount of all depositors to 5000 whose account no between 103 & 107.
UPDATE DEPOSIT SET AMOUNT=5000 WHERE ACTNO BETWEEN 103 AND 107;

--29. Update amount of loan no 321 to NULL.
UPDATE BORROW SET LOANNO=NULL WHERE LOANNO=321; 

--30. Display the name of borrowers whose amount is NULL.
SELECT CNAME FROM BORROW WHERE AMOUNT IS NULL;
