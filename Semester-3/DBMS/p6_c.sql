-----PRACTICAL-6-----
-----PART-C-----

--1. Display Unique city names.
select distinct City from PERSON

--2. List out department names in which more than two persons.
select d.DepartmentName from PERSON p inner join DEPARTMENT d on p.DepartmentID = d.DepartmentID group by d.DepartmentName having count(p.PersonID) > 2

--3. Combine person name’s first three characters with city name’s last three characters in single column.
select CONCAT(left(PersonName,3),right(City,3)) from PERSON

--4. Give 10% increment in Computer department employee’s salary.
update PERSON set Salary=Salary+(Salary/100*10) where DepartmentID = (select DepartmentID from DEPARTMENT where DepartmentName = 'Computer')

--5. Display all the person name’s who’s joining dates difference with current date is more than 365 days
select PersonName from PERSON where datediff(day,JoiningDate,getdate()) > 365 
