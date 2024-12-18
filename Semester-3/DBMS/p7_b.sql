select * from DEPARTMENT

select * from PERSON

--1. Find all persons with their department name & code.
select * from PERSON p inner join DEPARTMENT d on p.DepartmentID = d.DepartmentID

--2. Find the person's name whose department is located in C-Block.
select * from PERSON p inner join DEPARTMENT d on p.DepartmentID = d.DepartmentID where d.Location = 'C-Block'

--3. Retrieve person name, salary & department name who belongs to Jamnagar city.
select p.PersonName,p.Salary,d.DepartmentName from PERSON p inner join DEPARTMENT d on p.DepartmentID = d.DepartmentID where p.City = 'Jamnagar'

--4. Retrieve person name, salary & department name who does not belong to Rajkot city.
select p.PersonName,p.Salary,d.DepartmentName from PERSON p inner join DEPARTMENT d on p.DepartmentID = d.DepartmentID where p.City != 'Rajkot'

--5. Retrieve person�s name of the person who joined the Civil department after 1-Aug-2001.
select p.PersonName from PERSON p inner join DEPARTMENT d on p.DepartmentID = d.DepartmentID where d.DepartmentName= 'Civil' and p.JoiningDate >'1-Aug-2001'

--6. Find details of all persons who belong to the Computer department.
select * from PERSON p 
inner join DEPARTMENT d 
on p.DepartmentID = d.DepartmentID 
where d.DepartmentName= 'Computer'

--7. Display all the person's name with the department whose joining date difference with the current date is more than 365 days.
select PersonName from PERSON where datediff(day,JoiningDate,getdate()) > 365 

--8. Find department wise person counts.
select d.DepartmentName,count(p.PersonID) as[Number of People] from PERSON p 
inner join DEPARTMENT d 
on p.DepartmentID = d.DepartmentID 
group by d.DepartmentName

--9. Give department wise maximum & minimum salary with department name.
select d.DepartmentName,max(p.Salary) as [Max Salary],min(p.Salary) as [Min Salary] from PERSON p 
inner join DEPARTMENT d 
on p.DepartmentID = d.DepartmentID 
group by d.DepartmentName

--10. Find city wise total, average, maximum and minimum salary.
select p.City,sum(p.Salary) as [Total],avg(p.Salary) as [Average],max(p.Salary) as [Max] from PERSON p 
inner join DEPARTMENT d 
on p.DepartmentID = d.DepartmentID 
group by p.City

--11. Find the average salary of a person who belongs to Ahmedabad city.
select avg(p.Salary) as [Average Salary] from PERSON p 
inner join DEPARTMENT d 
on p.DepartmentID = d.DepartmentID 
where p.City = 'Ahmedabad'

--12. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In single column)
select concat(p.PersonName,' lives in ',p.City,' and works in ',d.DepartmentName,' Department.') from PERSON p 
inner join DEPARTMENT d 
on p.DepartmentID = d.DepartmentID

--13. Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (In single column)
select concat(p.PersonName,' earns ',p.Salary,' from ',d.DepartmentName,' department monthly.') from PERSON p 
inner join DEPARTMENT d 
on p.DepartmentID = d.DepartmentID

--14. Find city & department wise total, average & maximum salaries.
select p.City,d.DepartmentName,sum(p.Salary) as [Total],avg(p.Salary) as [Average],max(p.Salary) as [Max] from PERSON p 
inner join DEPARTMENT d 
on p.DepartmentID = d.DepartmentID 
group by p.City,d.DepartmentName

--15. Find all persons who do not belong to any department.
select * from PERSON 
where DepartmentID is null
