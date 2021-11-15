create table courses(
id int  AUTO_INCREMENT PRIMARY KEY,
name varchar(100) not null
);

create table student(
id int  AUTO_INCREMENT PRIMARY KEY,
name varchar(20) not null,
surname varchar(20) not null,
age int not null,
coursesId int,
FOREIGN KEY(coursesId) REFERENCES courses(id)
);
