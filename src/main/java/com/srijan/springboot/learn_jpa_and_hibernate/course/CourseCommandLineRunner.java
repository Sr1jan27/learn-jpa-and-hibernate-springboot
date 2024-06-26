package com.srijan.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.srijan.springboot.learn_jpa_and_hibernate.course.Course;
import com.srijan.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.srijan.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.srijan.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1, "Learn AWS Now!", "Srijan"));
		repository.save(new Course(2, "Learn Java Now!", "Mayur"));
		repository.save(new Course(3, "Learn C++ Now!", "Swami"));
		repository.save(new Course(4, "Learn Python Now!", "Arvind"));
		repository.save(new Course(5, "Learn SQL Now!", "Pandey"));
		
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(2l));
		
	}

}
