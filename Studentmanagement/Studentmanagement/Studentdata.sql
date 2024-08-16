create database studentdata;
show databases;
use studentdata;
create table studentdatamgmt(

FirstName varchar(50) ,

Surname varchar(50),

Age int,

DateOfBirth int,

Gender char,

contactNo int,

YearOfJoin int,

Id int NOT Null auto_increment,

Department varchar(2),

class varchar(50),

FatherName varchar(20),

MotherName varchar(20),

primary key(Id)

);
show databases;

show tables;
select * from studentdatamgmt;
Insert into studentdatamgmt values('Roshni','Gupta','19','7082002','F','100000000','2020','101','CS','Second Year','Umesh Gupta','Archana Gupta');

Insert into studentdatamgmt values('Alex','Gupta','19','9082002','M','30000000','2020','103','CS','Second Year','Abcd','Efgh');

Insert into studentdatamgmt values('Elle','Gupta','19','5082002','F','400000000','2020','104','IT','First Year','Nix','Helen');

Insert into studentdatamgmt values('Roshni','Gupta','19','3082002','F','500000000','2020','105','IT','First Year','Zooba','Kia');
select * from studentdatamgmt;
use studentdata;
create table login(
username varchar(100) primary key,
pass VARCHAR (20)
);

select * from login;
insert into login values('pavi@123','pavithra');
select * from login;
