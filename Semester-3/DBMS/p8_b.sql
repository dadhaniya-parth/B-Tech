----- PRACTICAL-8 -----
----- PART-B -----

-- 1. Write a SQL statement to generate a report with customer name, city, order number, order date, order
--amount, salesperson name, and commission to determine if any of the existing customers have not placed
--orders or if they have placed orders through their salesman or by themselves.

select c.cust_name,c.city,o.ord_no,o.ord_date,o.purch_amt,s.name,s.commission from  
ORDERS o full outer join  customers c on o.customer_id = c.customer_id 
full outer join salesmen s on o.salesman_id = s.salesman_id where c.salesman_id = s.salesman_id or c.customer_id = o.customer_id

--2. Write a SQL statement to generate a list in ascending order of salespersons who work either for one or more
--customers or have not yet joined any of the customers.

select s.name,count(c.salesman_id) as [Works for] from customers c 
inner join salesmen s 
on c.salesman_id = s.salesman_id group by s.name order by count(c.salesman_id) desc

--3. Write a SQL query to list all salespersons along with customer name, city, grade, order number, date, and amount.

select s.name,c.cust_name,c.city,c.Grade,o.ord_no,o.ord_date,o.purch_amt from ORDERS o full outer join  customers c on o.customer_id = c.customer_id 
full outer join salesmen s on o.salesman_id = s.salesman_id where c.salesman_id = s.salesman_id

--4. Write a SQL statement to make a list for the salesmen who either work for one or more customers or yet to
--join any of the customer. The customer may have placed, either one or more orders on or above order
--amount 2000 and must have a grade, or he may not have placed any order to the associated supplier.

select s.name,count(c.salesman_id) as [Works for],count(c.customer_id) as [Number of order],o.purch_amt from  
ORDERS o full outer join  customers c on o.customer_id = c.customer_id 
full outer join salesmen s on o.salesman_id = s.salesman_id
where o.purch_amt > 2000 and c.Grade is not null or o.salesman_id != s.salesman_id group by s.name,o.purch_amt having  count(s.salesman_id) > 0

--5. For those customers from the existing list who put one or more orders, or which orders have been placed by
--the customer who is not on the list, create a report containing the customer name, city, order number, order
--date, and purchase amount.

select c.cust_name,c.city,o.ord_no,o.ord_date,o.purch_amt 
from ORDERS o inner join customers c on o.customer_id = c.customer_id 
group by c.cust_name,c.city,o.ord_no,o.ord_date,o.purch_amt having count(o.customer_id) > 0

--6. Write a SQL statement to generate a report with the customer name, city, order no. order date, purchase
--amount for only those customers on the list who must have a grade and placed one or more orders or which
--order(s) have been placed by the customer who neither is on the list nor has a grade.

select c.cust_name,c.city,o.ord_no,o.ord_date,o.purch_amt 
from ORDERS o inner join customers c 
on o.customer_id = c.customer_id 
where c.Grade is not null 
group by c.cust_name,c.city,o.ord_no,o.ord_date,o.purch_amt 
having count(o.customer_id) > 0
select c.cust_name,c.city,o.ord_no,o.ord_date,o.purch_amt 
from orders o inner join customers c 
on o.customer_id = c.customer_id 
where c.Grade is not null 
group by c.cust_name,c.city,o.ord_no,o.ord_date,o.purch_amt 
having count(o.customer_id) = 0


--7. Write a SQL query to combine each row of the salesman table with each row of the customer table.

select c.customer_id,c.cust_name,c.city,c.Grade,c.salesman_id,s.name,s.city,s.commission from customers c inner join salesmen s on c.salesman_id = s.salesman_id

--8. Write a SQL statement to create a Cartesian product between salesperson and customer, i.e. each
--salesperson will appear for all customers and vice versa for that salesperson who belongs to that city.

select c.customer_id,c.cust_name,c.city,c.Grade,c.salesman_id,s.name,s.city,s.commission from customers c 
full outer join salesmen s on c.salesman_id = s.salesman_id and c.city = s.city

--9. Write a SQL statement to create a Cartesian product between salesperson and customer, i.e. each
--salesperson will appear for every customer and vice versa for those salesmen who belong to a city and
--customers who require a grade.

select c.customer_id,c.cust_name,c.city,c.Grade,c.salesman_id,s.name,s.city,s.commission from customers c 
full outer join salesmen s on c.salesman_id = s.salesman_id and c.city = s.city and c.Grade is not null

--10. Write a SQL statement to make a Cartesian product between salesman and customer i.e. each salesman
--will appear for all customers and vice versa for those salesmen who must belong to a city which is not the
--same as his customer and the customers should have their own grade.

select c.customer_id,c.cust_name,c.city,c.Grade,c.salesman_id,s.name,s.city,s.commission from customers c 
full outer join salesmen s on c.salesman_id = s.salesman_id and c.city != s.city and c.Grade is not null
