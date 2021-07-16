drop database if exists db_emp_course;
create database db_emp_course;
use  db_emp_course;


create table course(
   course_id int auto_increment PRIMARY KEY,
   course_name varchar(100),
   course_description varchar(1000)

);


insert into course values (1, "Angular", "......");
insert into course values (2, "React", "......");
insert into course values (3, "Spring Boot", "......");
insert into course values (4, "Django", "......");
insert into course values (5, "MySQl", "......");


commit;


select * from course;