--1. Find all departments whose total salary is exceeding 100000.
select d.DepartmentName,sum(p.Salary) as [Total Salary] from PERSON p inner join DEPARTMENT d on p.DepartmentID = d.DepartmentID group by d.DepartmentName having SUM(p.Salary) > 100000

--2. List all departments who have no person.
select d.DepartmentName from PERSON p inner join DEPARTMENT d on p.DepartmentID = d.DepartmentID group by d.DepartmentName having count(p.PersonID) = 0

--3. List out department names in which more than two persons are working.
select d.DepartmentName from PERSON p inner join DEPARTMENT d on p.DepartmentID = d.DepartmentID group by d.DepartmentName having count(p.PersonID) > 2

--4. Give a 10% increment in the Computer department employee�s salary. (Use Update)
update PERSON set Salary=Salary+(Salary/100*10) where DepartmentID = (select DepartmentID from DEPARTMENT where DepartmentName = 'Computer')

--5. Calculate Employee Experience in Years, Months & Days with respect to their joining Date.
select PersonName,concat('years = ',datediff(year,JoiningDate,getdate()),', Month = ',datediff(month,JoiningDate,getdate()),', days = ',datediff(day,JoiningDate,getdate())) from PERSON

