package com.springjdbc.example.SpringJDBCx;

import com.springjdbc.example.SpringJDBCx.student.Student;
import com.springjdbc.example.SpringJDBCx.student.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJdbCxApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbCxApplication.class, args);

		StudentService studentService = context.getBean(StudentService.class);

		//? uncomment below to add Student entry to DB on init
//		Student s = context.getBean(Student.class);
//		s.setRollNum(104);
//		s.setName("Smith");
//		s.setMarks(90);
//		s.toString();
//		studentService.addStudent(s);

		// Fetch and print list of student(s) records from DB
		List<Student> studentList = studentService.getStudents();
		System.out.println(studentList);
	}

}
