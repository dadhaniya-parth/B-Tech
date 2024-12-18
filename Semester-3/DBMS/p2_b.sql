--PRACTICAL-2--
--PART=B--

CREATE TABLE ACCOUNT (
    ACTNO INT PRIMARY KEY,            -- Account Number, unique identifier for each transaction
    CNAME VARCHAR(100),               -- Customer Name
    BNAME VARCHAR(100),               -- Branch Name
    AMOUNT DECIMAL(10, 2),            -- Amount involved in the transaction
    ADATE DATE                        -- Date of the transaction
);

INSERT INTO ACCOUNT (ACTNO, CNAME, BNAME, AMOUNT, ADATE) VALUES
(101, 'ANIL', 'VRCE', 1000.00, '1995-03-01'),
(102, 'SUNIL', 'AJNI', 5000.00, '1996-01-04'),
(103, 'MEHUL', 'KAROLBAGH', 3500.00, '1995-11-17'),
(104, 'MADHURI', 'CHANDI', 1200.00, '1995-12-17'),
(105, 'PRMOD', 'M.G. ROAD', 3000.00, '1996-03-27'),
(106, 'SANDIP', 'ANDHERI', 2000.00, '1996-03-31'),
(107, 'SHIVANI', 'VIRAR', 1000.00, '1995-09-05'),
(108, 'KRANTI', 'NEHRU PLACE', 5000.00, '1995-07-02'),
(109, 'MINU', 'POWAI', 7000.00, '1995-08-10');

--1. Retrieve all unique BNAME.
SELECT DISTINCT BNAME FROM ACCOUNT;

--2. Display the Cname in ascending order by their amount and if amount is same then in descending order by cname.
SELECT CNAME,AMOUNT FROM ACCOUNT 
ORDER BY AMOUNT, CNAME DESC;

--3. Update the BNAME of Anil and Shivani to NULL.
UPDATE ACCOUNT SET BNAME=NULL WHERE CNAME IN('ANIL','SHIVANI');

--4. Display the Cname of customers whose Bname is NULL.
SELECT CNAME FROM ACCOUNT WHERE BNAME IS NULL;

--5. Delete all the records of Account table having amount greater than and equals to 4000.
DELETE FROM ACCOUNT WHERE AMOUNT>=4000;

--6. Delete all the accounts Bname is CHANDI.
DELETE FROM ACCOUNT WHERE BNAME='CHANDI';

--7. Delete all the accounts having adate after 1-10-1995.
DELETE FROM ACCOUNT WHERE ADATE>'1995-10-01';

--8. Delete all the records of Account table. (Use Truncate)
TRUNCATE TABLE ACCOUNT;

--9. Remove Account table. (Use Drop)
DROP TABLE ACCOUNT;

	