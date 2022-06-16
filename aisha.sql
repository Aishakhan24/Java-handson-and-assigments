create database Employeee;
show databases;
create table emp (emp_id int, emp_name char(10));
alter table emp
add emp_dob date;
select * from emp;
alter table emp
add (emp_mobno int, emp_addr varchar(50));
alter table emp
add emp_salary int;
insert into emp values(100,'Aisha', 23/4/2000, 986675567, 'Bangalore', 50000);
insert into emp values(101,'Deeksha', 1/1/2000, 776675567, 'Mangalore', 55000);
insert into emp values(102,'Chaithanya', 1/2/2000, 986644567, 'Bangalore', 35000);
insert into emp values(103,'Chaitra', 2/2/2000, 454533670, 'Bangalore', 45000);
insert into emp values(104,'Vamsi', 4/2/2000, 664533670, 'Bangalore', 40000);
insert into emp values(105,'Altaf', 3/2/2000, 984532270, 'Bangalore', 45000);
select emp_salary from emp where emp_salary> 30000 and 40000;

create table customer(cust_id int primary key, cust_name char(10), cust_addrs varchar(50), cust_oderid int);
insert into customer values(101, ' CHAGDDH', 'Bangalore', 10001);
insert into customer values(102, ' jdfGDDH', 'Mangalore', 10002);
insert into customer values(103, ' CHAGDDH', 'Bangalore', 10003);

create table orders (cust_id int , cust_name char(10), cust_oderid int primary key);
insert into orders values(101, 'CHAGDDH', 10001);
insert into orders values(102, 'jdfGDDH', 10002);
insert into orders values(103, 'CHAGDDH', 10003);
select * from customer cross join orders;
select customer.cust_id, customer.cust_name, orders.cust_id, orders.cust_oderid from customer cross join orders;

create table clients( cust_orderid int, client_mobno int, client_requirement char(10));
insert into clients values( 10001, 898889992, 'Computer');
insert into clients values( 10002, 777789992, 'Applicat');
insert into clients values( 10003, 666689992, 'Website');
select * from customer cross join clients;
select customer.cust_id, customer.cust_name, clients.cust_orderid, clients.client_mobno, clients.client_requirement from customer cross join clients;





