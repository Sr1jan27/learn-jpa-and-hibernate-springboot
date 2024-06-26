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
		repository.insert(new Course(2, "Learn Java Now!", "Mayur"));
		repository.insert(new Course(3, "Learn C++ Now!", "Swami"));
		repository.insert(new Course(4, "Learn Python Now!", "Arvind"));
		repository.insert(new Course(5, "Learn SQL Now!", "Pandey"));
		
		
		repository.deleteById(2);
		
//		System.out.println(repository.findById(2));
		
	}

}
