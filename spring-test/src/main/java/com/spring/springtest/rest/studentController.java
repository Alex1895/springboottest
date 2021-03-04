package com.spring.springtest.rest;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "api/student")
public class studentController {

	private final studentService StudentService;
	
	@Autowired
	public studentController(studentService StudentService) {
		this.StudentService = StudentService;
	}
	
	@GetMapping
	public List<student> getStudents(){
		return StudentService.getStudents();
	}

	
}
