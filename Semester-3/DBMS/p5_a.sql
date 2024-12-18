--PRACTICAL-5--
--PART=A--

-- Create salesmen table
CREATE TABLE salesmen
(
    salesman_id INT PRIMARY KEY,
    name VARCHAR(50),
    city VARCHAR(50),
    commission DECIMAL(4, 2)
);

-- Create customers table
CREATE TABLE customers1
(
    customer_id INT PRIMARY KEY,
    cust_name VARCHAR(50),
    city VARCHAR(50),
    grade INT,
    salesman_id INT,
    FOREIGN KEY (salesman_id) REFERENCES salesmen(salesman_id)
);

-- Create orders table
CREATE TABLE orders
(
    ord_no INT PRIMARY KEY,
    purch_amt DECIMAL(10, 2),
    ord_date DATE,
    customer_id INT,
    salesman_id INT,
    FOREIGN KEY (customer_id) REFERENCES customers1(customer_id),
    FOREIGN KEY (salesman_id) REFERENCES salesmen(salesman_id)
);


INSERT INTO orders
    (ord_no, purch_amt, ord_date, customer_id, salesman_id)
VALUES
    (70001, 150.5, '2012-10-05', 3005, 5002),
    (70009, 270.65, '2012-09-10', 3001, 5005),
    (70020, 65.26, '2012-10-05', 3002, 5001),
    (70004, 110.5, '2012-08-17', 3009, 5003),
    (70007, 948.5, '2012-09-10', 3005, 5002),
    (70005, 2400.6, '2012-07-27', 3007, 5001),
    (70008, 5760, '2012-09-10', 3002, 5001),
    (70010, 1983.43, '2012-10-10', 3004, 5006),
    (70003, 2480.4, '2012-10-10', 3009, 5003),
    (70012, 250.45, '2012-06-27', 3008, 5002),
    (70011, 75.29, '2012-08-17', 3003, 5007),
    (70013, 3045.6, '2012-04-25', 3002, 5001),
    (70099, 150.5, '2012-10-05', 3005, 5002),
    (70100, 270.65, '2012-09-10', 3001, 5005),
    (70002, 65.26, '2012-10-05', 3002, 5001);

INSERT INTO salesmen
    (salesman_id, name, city, commission)
VALUES
    (5001, 'James Hoog', 'New York', 0.15),
    (5002, 'Nail Knite', 'Paris', 0.13),
    (5005, 'Pit Alex', 'London', 0.11),
    (5006, 'Mc Lyon', 'Paris', 0.14),
    (5007, 'Paul Adam', 'Rome', 0.13),
    (5003, 'Lauson Hen', 'San Jose', 0.12);


INSERT INTO customers1
    (customer_id, cust_name, city, grade, salesman_id)
VALUES
    (3002, 'Nick Rimando', 'New York', 100, 5001),
    (3007, 'Brad Davis', 'New York', 200, 5001),
    (3005, 'Graham Zusi', 'California', 200, 5002),
    (3008, 'Julian Green', 'London', 300, 5002),
    (3004, 'Fabian Johnson', 'Paris', 300, 5006),
    (3009, 'Geoff Cameron', 'Berlin', 100, 5003),
    (3003, 'Jozy Altidor', 'Moscow', 200, 5007),
    (3001, 'Brad Guzan', 'London', NULL, 5005);

--1. Write a SQL query to calculate total purchase amount of all orders. Return total purchase amount.
SELECT SUM(purch_amt) FROM orders;

--2. Write a SQL query to calculate the average purchase amount of all orders. Return average purchase amount.
SELECT AVG(purch_amt) FROM orders;

--3. Write a SQL query that counts the number of unique salespeople. Return number of salespeople.
SELECT COUNT(cust_name) FROM customers1;

--4. Write a SQL query to count the number of customers. Return number of customers.
SELECT COUNT(name) FROM salesmen;

--5. Write a SQL query to determine the number of customers who received at least one grade for their activity.
SELECT cust_name,COUNT(grade) FROM customers1 GROUP BY cust_name HAVING COUNT(grade)>=1;

--6. Write a SQL query to find the maximum purchase amount.
SELECT MAX(purch_amt) FROM orders;

--7. Write a SQL query to find the minimum purchase amount.
SELECT MIN(purch_amt) FROM orders;

--8. Write a SQL query to find the highest grade of the customers in each city. Return city, maximum grade.
SELECT city,MAX(grade) FROM customers1 GROUP BY city;

--9. Write a SQL query to find the highest purchase amount ordered by each customer. Return customer ID, maximum purchase amount.
SELECT customer_id,MAX(purch_amt) FROM orders GROUP BY customer_id ORDER BY customer_id;

--10. Write a SQL query to find the highest purchase amount ordered by each customer on a particular date. Return, order date and highest purchase amount.
SELECT MAX(purch_amt),ord_date FROM orders GROUP BY ord_date ORDER BY ord_date;
