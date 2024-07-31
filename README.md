# Simple Spring Boot JDBC (Java Database Connectivity) with Postgres Drive Example
> Build Tool: Maven
- Connect to local Postgres DB
- Fetch records from DB: List of students

# Usage

## Create Postgres DB, Table & Mock Data
### `student` Table 
```roomsql
create table student (
    rollNum int primary key,
    name varchar(50),
    marks int
);
```
### `student` Mock Data
```roomsql
insert into student (rollNum, name, marks) values (101, 'John', 90);
insert into student (rollNum, name, marks) values (102, 'Blake', 99);
insert into student (rollNum, name, marks) values (103, 'Kim', 83);
```

## Clone Or Open Project in IDE
> Intellij, Eclipse, ect...

## Replace/add values for spring database props for psql driver
```properties
spring.datasource.url=jdbc:postgresql://<HOST>:5432/<DATABASE_NAME>
spring.datasource.username=<USER>
spring.datasource.password=<PASSWORD>
spring.datasource.driver-class-name=org.postgresql.Driver
```
