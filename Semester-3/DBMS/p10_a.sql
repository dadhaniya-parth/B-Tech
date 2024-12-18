----- PRACTICAL-10 -----
---- PART-A ----

CREATE TABLE STUDENT10 (Rno int, Name varchar(50), City varchar(50), DID int)

insert into STUDENT10 values(101, 'Raju', 'Rajkot', 10)
insert into STUDENT10 values(102, 'Amit', 'Ahmedabad', 20)
insert into STUDENT10 values(103, 'Sanjay', 'Baroda', 40)
insert into STUDENT10 values(104, 'Neha', 'Rajkot', 20)
insert into STUDENT10 values(105, 'Meera', 'Ahmedabad', 30)
insert into STUDENT10 values(106, 'Mahesh', 'Baroda', 10)

select* from STUDENT10


create table ACADEMIC10(Rno int, SPI decimal(4,2), Bklog int)


insert into ACADEMIC10 values(101, 8.8, 0)
insert into ACADEMIC10 values(102, 9.2, 2)
insert into ACADEMIC10 values(103, 7.6, 1)
insert into ACADEMIC10 values(104, 8.2, 4)
insert into ACADEMIC10 values(105, 7.0, 2)
insert into ACADEMIC10 values(106, 8.9, 3)

select* from ACADEMIC10


create table DEPARTMENT10(DID int, DName varchar(50))

insert into DEPARTMENT10 values(10, 'Computer')
insert into DEPARTMENT10 values(20, 'Electrical')
insert into DEPARTMENT10 values(30, 'Mechanical')
insert into DEPARTMENT10 values(40, 'Civil')

select* from DEPARTMENT10


/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/


--1. Display details of students who are from computer department.
select * from STUDENT10 where DID in (select DID from DEPARTMENT10 where DName = 'Computer')

--2. Displays name of students whose SPI is more than 8.
select Name from STUDENT10 where Rno in (select Rno from ACADEMIC10 where SPI > 8)

--3. Display details of students of computer department who belongs to Rajkot city.
select * from STUDENT10 where DID in (select DID from DEPARTMENT10 where DName = 'Computer') and City = 'Rajkot'

--4. Find total number of students of electrical department.
select count(Rno) as [number of students of electrical] from STUDENT10 where DID in (select DID from DEPARTMENT10 where DName = 'Electrical')

--5. Display name of student who is having maximum SPI.
select Name from STUDENT10 where Rno in (select Rno from ACADEMIC10 where SPI = (select max(SPI) from ACADEMIC10))

--6. Display details of students having more than 1 backlog.
select Name from STUDENT10 where Rno in (select Rno from ACADEMIC10 where Bklog > 1)

--7. Display name of student who is having second highest SPI.

select Name from STUDENT10 where Rno in (select Rno from ACADEMIC10 order by SPI desc offset 1 rows fetch next 1 row only)
select Name from STUDENT10 where Rno in (select Rno from ACADEMIC10 where SPI = (select max(SPI) from ACADEMIC10 where SPI < (select max(SPI) from ACADEMIC10)))

--8. Display name of students who are either from computer department or from mechanical department.
select * from STUDENT10 where DID in (select DID from DEPARTMENT10 where DName in ('Computer','Mechanical' )

--9. Display name of students who are in same department as 102 studying in.
select * from STUDENT10 where DID in (select DID from DEPARTMENT10 where DID in (Select DID from STUDENT10 where Rno = 102))

--10. Display name of students whose SPI is more than 9 and who is from electrical department.
select * from STUDENT10 where Rno in (select Rno from ACADEMIC10 where SPI > 9) and DID = (select DID from DEPARTMENT10 where DName = 'Electrical') 
