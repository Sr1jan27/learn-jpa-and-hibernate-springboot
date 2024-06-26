package com.srijan.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.srijan.springboot.learn_jpa_and_hibernate.course.Course;

public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1, "Learn AWS Now!", "Srijan"));
		
	}

}
