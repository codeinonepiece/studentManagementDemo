package com.studentManagement.demo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentManagement.demo1.Entity.Student;
import com.studentManagement.demo1.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	public ResponseEntity<Student> createNewStudent(@RequestBody Student student) {
		
		Student newStudent = studentService
		return new ResponseEntity<Student>(createPost, HttpStatus.CREATED);
	}
	
	

}
