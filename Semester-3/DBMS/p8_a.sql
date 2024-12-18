----- PRACTICAL-8 -----
----- PART-A -----
-- Create salesmen table
CREATE TABLE salesmen
(
    salesman_id INT PRIMARY KEY,
    name VARCHAR(50),
    city VARCHAR(50),
    commission DECIMAL(4, 2)
);

-- Create customers table
CREATE TABLE customers
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
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
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


INSERT INTO customers
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

-- 1. Write a SQL query to find the salesperson and customer who reside in the same city. Return Salesman, cust_name and city.
SELECT c.cust_name,s.name,c.city FROM customers c inner join salesmen s ON c.city = s.city

-- 2. Write a SQL query to find those orders where the order amount exists between 500 and 2000. Return ord_no, purch_amt, cust_name, city.
SELECT o.ord_no,o.purch_amt,c.cust_name,c.city FROM orders o inner join customers c on o.customer_id = c.customer_id where purch_amt >= 500 and purch_amt <= 2000

-- 3. Write a SQL query to find the salesperson(s) and the customer(s) he represents. Return Customer Name, city, Salesman, commission.
SELECT c.cust_name,s.name,c.city,s.commission FROM customers c inner join salesmen s ON c.customer_id = s.salesman_id;

-- 4. Write a SQL query to find salespeople who received commissions of more than 12 percent from the company. Return Customer Name, customer city, Salesman, commission.
SELECT c.cust_name,c.city,s.name,s.commission from customers c inner join salesmen s on c.salesman_id = s.salesman_id where s.commission > 0.12

-- 5. Write a SQL query to locate those salespeople who do not live in the same city where their customers live 
--and have received a commission of more than 12% from the company. Return Customer Name, 
--customer city, Salesman, salesman city, commission.
SELECT c.cust_name,c.city,s.city,s.name,s.commission from customers c inner join salesmen s on c.City != s.City where s.commission > 0.12

-- 6. Write a SQL query to find the details of an order. Return ord_no, ord_date, purch_amt, Customer Name, grade, Salesman, commission.
SELECT o.ord_no,o.purch_amt,c.cust_name,c.Grade,s.name,s.commission from  orders o 
inner join  customers c on o.customer_id = c.customer_id 
inner join salesmen s on o.salesman_id = s.salesman_id

-- 7. Write a SQL statement to join the tables salesman, customer and orders so that the same column of each
--table appears once and only the relational rows are returned.
SELECT o.ord_no,o.purch_amt,o.ord_date,c.customer_id,c.cust_name,c.city,c.Grade,s.salesman_id,s.name,s.name,s.commission from  ORDERS o 
inner join  customers c on o.customer_id = c.customer_id 
inner join salesmen s on o.salesman_id = s.salesman_id

-- 8. Write a SQL query to display the customer name, customer city, grade, salesman, salesman city. The results 
--should be sorted by ascending customer_id.
SELECT c.cust_name,c.city,c.Grade,s.name,s.city from customers c inner join salesmen s on c.salesman_id = s.salesman_id order by c.customer_id

-- 9. Write a SQL query to find those customers with a grade less than 300. Return cust_name, customer city, 
--grade, Salesman, salesmancity. The result should be ordered by ascending customer_id.
SELECT c.cust_name,c.city,c.Grade,s.name,s.city from customers c inner join salesmen s on c.salesman_id = s.salesman_id where c.Grade < 300 order by c.customer_id

-- 10. Write a SQL statement to make a report with customer name, city, order number, order date, and order
--amount in ascending order according to the order date to determine whether any of the existing customers
--have placed an order or not.
SELECT c.cust_name,c.city,o.ord_no,o.ord_date,o.purch_amt from orders o inner join customers c on o.customer_id = c.customer_id order by o.ord_date

