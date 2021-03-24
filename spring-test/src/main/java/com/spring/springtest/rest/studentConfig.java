package com.spring.springtest.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
@Configuration
public class studentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(studentRepository repository){
		return args -> {
		student maria =	new student(
					"Maria",
					"maria.nuno@gmail.com",
					LocalDate.of(1996, Month.OCTOBER, 5)
				);
		student alex = 	new student(				
				"Alex",
				"alex@gmail.com",
				LocalDate.of(1995, Month.DECEMBER, 18)
			);
		repository.saveAll(List.of(maria, alex));
		};
	}

}
