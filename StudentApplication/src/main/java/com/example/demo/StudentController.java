package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
		return null;
		
	}
	
	@GetMapping("/get")
	public ResponseEntity<Student> getStudent(@PathVariable int id)
	{
		return null;
		
	}
}
