package com.spring.springtest.rest;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class studentService {

	private final studentRepository studentRepository;
	
	@Autowired
	public studentService(studentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public List<student> getStudents(){
		return studentRepository.findAll();
	}

	public static void addNewStudent(student student) {
		// TODO Auto-generated method stub
		System.out.println(student);
	}
}
