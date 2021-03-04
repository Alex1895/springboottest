package com.spring.springtest.rest;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class studentService {

	public List<student> getStudents(){
		return List.of(
				new student(
							1L,
							"Maria",
							"maria.nuno@gmail.com",
							21,
							LocalDate.of(1996, Month.OCTOBER, 5)
						)
				);
	}
}
